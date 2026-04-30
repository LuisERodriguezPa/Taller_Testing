package com.generation;

import com.generation.Producto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {

    @Test
    void comprobrarPrecio(){
        Producto p1 = new Producto("Arroz", 2000.0, 30);
        assertEquals(2000.0, p1.getPrecio());
    }
    @Test
    void estaDisponible(){
        Producto p1 = new Producto("Arroz", 2000.0, 30);
        assertTrue(p1.estaDisponible());
    }
    @Test
    void noEstaDisponible(){
        Producto p2 = new Producto("Azucar",1700.0,0);
        assertFalse(p2.estaDisponible());
    }

    @Test
    void comprobarReducirStock(){
        Producto p3 = new Producto("Maiz",500,23);
        p3.reducirStock(10);
        assertEquals(13, p3.getStock());
    }
    @Test
    void comprobarExcepcionStock(){
        Producto p4 = new Producto("Panela", 2000, 20);
        assertThrows(Exception.class, ()->{p4.reducirStock(30);});
    }
    @Test
    void probarExcepcionPrecioNegativo(){
        assertThrows(Exception.class, ()->new Producto("Jabon",-2,20));

    }

    // Tarea 3:
/* Voy Probar el metodo GetNombre de la clase Producto
    Voy usar assertEquals porque voy a verificar que el nombre que le ingreso al producto a la hora de crearlo,
    sea el mismo que me devuelve el metodo getNombre
    Espero obtener true porque los nombres son iguales
 */
    @Test
    void probarGetNombre(){
        Producto p1 = new Producto("Arroz",2000,20);
        assertEquals("Arroz", p1.getNombre());
    }

}
