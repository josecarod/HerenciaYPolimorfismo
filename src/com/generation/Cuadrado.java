package com.generation;

public class Cuadrado extends FiguraGeometrica {
	
	public Cuadrado() {
		super("Cuadrado"); //llamando al constructor padre
	}
    
	public float calcularArea() {
		return getAlto() * getAlto();
	}
	
	public float perimetro() {
		return (getAlto() + getLargo()) * 2;
	}
}
