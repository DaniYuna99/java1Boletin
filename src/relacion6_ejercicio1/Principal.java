package relacion6_ejercicio1;

import java.util.Scanner;

public class Principal {
	
	/* 1. Crear una clase Rectangulo con los atributos longitud y ancho, cada uno con un
	valor predeterminado igual a 1. Proporcionar los métodos set y get para los
	atributos longitud y ancho respectivamente. El método set debe verificar que
	longitud y ancho contengan números reales mayores que cero y menores que
	20. Además, proporcionar métodos que calculen el perímetro y el área del
	rectángulo.
	
	Escribir un método main que solicite los datos de un rectángulo y muestre cual es
	su área y su perímetro. Probar a introducir un dato incorrecto (mayor o igual que
	20).*/

	public static void main(String[] args) {
		
		//menu();
		
		Rectangulo r1;
		
		try {
			
			System.out.println("hola".charAt(30));
			r1 = new Rectangulo(-1.0, -2.0);
			r1.calcularArea();

			
		}catch(RectanguloException | NullPointerException | StringIndexOutOfBoundsException e) {
			System.out.println("Introduce los valores correctos: ");
		
		}catch(StringIndexOutOfBoundsException s) {
			System.out.println("La excepción no se esperaba."+s.getMessage());
		}
		
		 
		
	}
	
	
	public static void menu() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la longitud: ");
		double longitud = Double.valueOf(sc.nextLine());
		
		System.out.println("Introduzca el ancho: ");
		double ancho = Double.valueOf(sc.nextLine());
		
		
		Rectangulo rectangulo = new Rectangulo(ancho, longitud);
		
		System.out.println(rectangulo);
		
		sc.close();
	}

}
