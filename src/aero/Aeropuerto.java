package aero;

import java.util.Scanner;

public class Aeropuerto {
	
	public static String MENU_SECUNDARIO = "Selecciona opción:\n"
											+ "a. Asignar vuelo\n"
											+ "b. Obtener el número de vuelos\n"
											+ "c. Obtener el total de kilómetros volados\n"
											+ "d. Obtener la media de kilómetros por vuelo\n"
											+ "e. Cambio de compañía\n"
											+ "f. Mostrar información del avión\n"
											+ "g. Salir";

	public static void main(String[] args) {


		Avion jumbo = crearAvionConMenu();

		
		System.out.println(MENU_SECUNDARIO);
		
		
		Scanner sc = new Scanner(System.in);
		String opcion = sc.nextLine();
		
		while (!opcion.equalsIgnoreCase("g")) {
			
			if(opcion.equalsIgnoreCase("a")) {
				
				//asignar vuelo npasajeros km
				System.out.println("¿Cuántos pasajeros viajan en este vuelo?");
				int pasajeros = Integer.valueOf(sc.nextLine());
				
				System.out.println("¿Cuántos kilómetros recorre este vuelo?");
				int kms = Integer.valueOf(sc.nextLine());
				
				if(jumbo.asignarVuelo(pasajeros, kms)) {
					System.out.println("Vuelo asignado correctamente.");
				}else {
					System.out.println("El número de pasajeros excede la capacidad del avión.");
				}
				
			}else if(opcion.equalsIgnoreCase("b")) {
				System.out.println(jumbo.getNumVuelos());
				
			}else if(opcion.equalsIgnoreCase("c")) {
				System.out.println(jumbo.getKmVolados());
				
			}else if(opcion.equalsIgnoreCase("d")) {
				System.out.println(jumbo.getMediaKms());
			
			}else if(opcion.equalsIgnoreCase("e")) {
				System.out.println("¿Cuál es el nombre de la compañía?");
				String tmpCompania = sc.nextLine();
				jumbo.setCompania(tmpCompania);
				System.out.println("Compañía cambiada.");
			
			}else if(opcion.equalsIgnoreCase("f")) {
				System.out.println(jumbo.getInformacionAvion());
			}
			
			
			opcion = sc.nextLine();
		
		}
		
	}
	
	
	
	public static Avion crearAvionConMenu() {
		System.out.println("MENÚ CREACIÓN DE AVIÓN: \n"
					+ "1. Crear avión sólo con el identificador.\n"
					+ "2. Crear avión con el identificador y la compañía.\n"
					+ "###############################");
		
		int capacidad=0;
		Avion avionCreado = null;
				
		Scanner sc = new Scanner(System.in);
		int op = Integer.valueOf(sc.nextLine());
		
		if(op==1) {
			System.out.println("Introduzca el identificador del avión: ");
			String identificador = sc.nextLine();
			System.out.println("Introduzca la capacidad del avión: ");
			capacidad = Integer.valueOf(sc.nextLine());
			
			avionCreado = new Avion(identificador, capacidad);
			
		}else if(op==2) {
			System.out.println("Introduzca el identificador del avión: ");
			String identificador = sc.nextLine();
			System.out.println("Introduzca el nombre de la compañía: ");
			String compania = sc.nextLine();
			System.out.println("Introduzca la capacidad del avión: ");
			capacidad = Integer.valueOf(sc.nextLine());
			
			avionCreado = new Avion(identificador, compania, capacidad);
			

			
		}else {
			System.out.println("La opción seleccionada no es correcta");
		}
		capacidad = 3;
		
		
		return avionCreado;
	}

}