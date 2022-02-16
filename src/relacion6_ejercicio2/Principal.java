package relacion6_ejercicio2;

import java.util.Scanner;

public class Principal {

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		Cuenta cuenta1 = null;
		System.out.println("¿Con qué saldo inicial quiere abrir su cuenta?");
		Double saldoInicial = Double.valueOf(sc.nextLine());
		cuenta1 = new Cuenta(saldoInicial);
		
		System.out.println("¿Qué operación quiere realizar?");
		String op = sc.nextLine();
		
		boolean finalizado = false;
		
		while(!finalizado) {
			
			if(op.equals("1")) {
				System.out.println("Cantidad a ingresar:");
				double ingreso = Double.valueOf(sc.nextLine());
				
				if(cuenta1.hacerIngreso(ingreso)) {
					System.out.println("Operación realizada con éxito.");
				}else {
					System.out.println("Lo siento, no se puede realizar el ingreso.");
				}
				
			}else if (op.equals("2")) {
				System.out.println("Cantidad a sacar:");
				double reintegro = Double.valueOf(sc.nextLine());
				
				if(cuenta1.hacerReintegro(reintegro)) {
					System.out.println("Operación realizada con éxito.");
				}else {
					System.out.println("Lo siento, no se puede realizar el ingreso.");
				}		
			}else if(op.equals("3")) {
				System.out.println(cuenta1);
				
			}else if(op.equals("4")) {
				
				System.out.println("¿Seguro que quiere salir (S/N)?");
				String seleccion = sc.nextLine();
				if("S".equalsIgnoreCase(seleccion)){
					finalizado = true;
				}
				//finalizado = "S".equalsIgnoreCase(sc.nextLine());
				
			}
			
			
			System.out.println("¿Qué operación quiere realizar?");
			op = sc.nextLine();
			
		}

		
		
		
	}

}
