package com.generation;

public abstract class FiguraGeometrica {
	// Clases abstractas.
	// Clases que pueden o no contener métodos abstractos
	// Un metodo abstracto es un metodo que te dice que hacer pero no te dice como hacerlo.
	// Se utiliza para que no pueda contener objetos
	
	protected String nombre;
	protected float alto;
	protected float largo;
	
	
	public FiguraGeometrica(String nombre) {
		this.nombre = nombre; 
	}
	
//	public float calcularArea() {
//		return alto * largo;
//	} 
	
	public abstract float calcularArea();
	
	public abstract float perimetro();
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre; 
	}
	
	public float getAlto() {
		return alto;
	}
	
	public void setAlto(float alto) {
		this.alto = alto;
	}
	
	public float getLargo() {
		return largo;
	}
	
	public void setLargo(float largo) {
		this.largo = largo;
	}
	
}
