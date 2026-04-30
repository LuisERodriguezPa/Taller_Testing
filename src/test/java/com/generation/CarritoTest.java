package com.generation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CarritoTest {
    @Test
    void probarCarritoVacio(){
        Carrito car1 = new Carrito();
        assertEquals(0, car1.cantidadDeProductos());
    }
    @Test
    void probarAgregarProducto(){
        Carrito car2 = new Carrito();
        Producto p1 = new Producto("Aceite",200,20);
        car2.agregar(p1);
        assertEquals(1,car2.cantidadDeProductos());
    }
    @Test
    void probarTotalCarrito(){
        Producto p1 = new Producto("Arroz",200,4);
        Producto p2 = new Producto("Azucar",150,6);
        Carrito car1 = new Carrito();
        car1.agregar(p1);
        car1.agregar(p2);
        assertEquals(350.0, car1.calcularTotal());
    }
    @Test
    void probarCarritoNoEstaVacio(){
        Producto p1 = new Producto("Arroz",200,4);
        Carrito car1 = new Carrito();
        car1.agregar(p1);
        assertFalse(car1.estaVacio());
    }
    @Test
    void probarTotalCarritoVacio(){
        Carrito car1 = new Carrito();
        assertEquals(0, car1.calcularTotal());
    }
}
