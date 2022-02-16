package relacion6_ejercicio3;

public class Maquina {
	
	//Atributos
	private final int CAPACIDAD_MAX_CAFE			= 50;
	private final int CAPACIDAD_MAX_CAFE_LECHE		= 50;
	private final int CAPACIDAD_MAX_VASOS 			= 80;
	
	private Integer depositoCafe;
	private Integer depositoLeche;
	private Integer depositoVasos;
	
	
	//Constructores
	public void MaquinaCafe() {
		llenarDepositos();
	}
	

	
	//Metodos
	public void llenarDepositos () {
		this.depositoCafe 		= CAPACIDAD_MAX_CAFE;
		this.depositoLeche 		= CAPACIDAD_MAX_CAFE_LECHE;
		this.depositoVasos 		= CAPACIDAD_MAX_VASOS;
	}
	
	//Getters-Setters

}
