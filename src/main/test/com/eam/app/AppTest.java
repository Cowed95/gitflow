package main.test.com.eam.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.miempresa.miapp.App;

class AppTest {

	@Test
    void testSumar() {
        double resultado = App.sumar(10, 5);
        assertEquals(15, resultado, 0.001);
    }

    @Test
    void testRestar() {
        double resultado = App.restar(10, 5);
        assertEquals(5, resultado, 0.001);
    }
    
    @Test
    void testMultiplicar() {
        double resultado = App.multiplicar(3, 3);
        assertEquals(9, resultado, 0.001);
    }

    @Test
    void testDividir() {
        double resultado = App.dividir(10, 2);
        assertEquals(5, resultado, 0.001);
    }

    @Test
    void testDividirPorCero() {
        assertThrows(ArithmeticException.class, () -> App.dividir(10, 0), 
            "Dividir por cero debería lanzar ArithmeticException");
    }

}
