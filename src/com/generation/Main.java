package com.generation;

public class Main {
	
	public static void main(String [] args) {
		
		Cuadrado cuadrado1 = new Cuadrado();
		cuadrado1.setAlto(15f);
		cuadrado1.setLargo(10f);
		
		System.out.println("El area del " + cuadrado1.getNombre() + " es " + cuadrado1.calcularArea());
		
		Triangulo triangulo1 = new Triangulo();
		triangulo1.setAlto(15f);
		triangulo1.setLargo(10f);
		
		System.out.println("El area del " + triangulo1.getNombre() + " es " + triangulo1.calcularArea());

   }
}
