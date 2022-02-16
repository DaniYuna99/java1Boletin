package aero;

public class Avion {
	
	//Atributos
	private String idAvion;
	private final Integer capacidad;
	private Integer numVuelos = 0;
	private Double kmVolados = 0.0;
	private String compania;
	
	
	
	//Constructores
	public Avion(String idAvion, Integer capacidad) {
		this.idAvion = idAvion;
		this.capacidad = capacidad;

	}
	
	public Avion(String id, String compania, Integer capacidad) {
		this.idAvion = id;
		this.capacidad = capacidad;
		this.compania = compania;
	}
	
	
	
	
	
	//Métodos
	public boolean asignarVuelo(int viajeros, double km) {
		boolean posibleAsignarVuelo = false;
		
		if(viajeros <= this.capacidad) {
			this.kmVolados += km;
			this.numVuelos++;
			posibleAsignarVuelo = true;
		}
		return posibleAsignarVuelo;
	}

	
	public Double getMediaKms() {
		double resultado = 0;
		
		if(numVuelos>0) {
			resultado = kmVolados/numVuelos;
			//resultado = getKmVolados()/getNumVuelos();
			
		}
		
		return resultado;
	}
	
	
	
	//Getters / Setters
	private void setIdAvion(String idAvion) {
		this.idAvion = idAvion;
	}


	private void setNumVuelos(Integer numVuelos) {
		this.numVuelos = numVuelos;
	}

	private void setKmVolados(Double kmVolados) {
		this.kmVolados = kmVolados;
	}
	
	public void setCompania(String compania) {
		this.compania = compania;
	}
	
	

	public String getCompania() {
		return compania;
	}

	public String getIdAvion() {
		return idAvion;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public Integer getNumVuelos() {
		return numVuelos;
	}

	public Double getKmVolados() {
		return kmVolados;
	}
	
	/* Avión con id: <id> de la compañia <compania> ha realizado \n
	 * <numero de vuelos> vuelos, con un total de <kilometros> km y una media de\n
	 * <kilometros> km por vuelo.*/
	
	public String getInformacionAvion () {
		return "Avión con id: "+ getIdAvion()
		+ " de la compañía " + getCompania()
		+ " ha realizado " + getNumVuelos() + " vuelos, "
		+ "con un total de " + getKmVolados() + " km "
		+ "y una media de " + getMediaKms()
		+ " km por vuelo.";
	}


}

