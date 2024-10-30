package com.miempresa.miapp;

public class AppService {
	
	private App app;

	public AppService(App app) {
		this.app = app;
	}

	public double sumar(double a, double b) {
		return app.sumar(a, b);
	}

	public double restar(double a, double b) {
		return app.restar(a, b);
	}

}
