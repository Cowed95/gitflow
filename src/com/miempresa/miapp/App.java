package com.miempresa.miapp;

public class App {
	
	public static double sumar (double a, double b) {
		return a + b;
	}
	
	public static double restar (double a, double b) {
		return a - b;
	}

	public static double multiplicar (double a, double b) {
		return a * b;
	}
	
	public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return a / b;
    }
}
