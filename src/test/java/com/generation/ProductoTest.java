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
    void estaDisponibilidad(){
        Producto p1 = new Producto("Arroz", 2000.0, 30);
        assertTrue(true, p1.estaDisponible());
    }
}
