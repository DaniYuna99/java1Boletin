package persona; //INCOMPLETO

public class Persona {
	
	//Atributos
	private Integer edad;
	private String apellido1;
	private String apellido2;
	private String nombre;
	private String dni;
	private double altura;
	private double peso;
	
	private Persona progenitor1;
	private Persona progenitor2;
	
	
	public boolean equals(Object personaDesconocida) {
		boolean sonLaMismaPersona = false;
		Persona convertida = (Persona) personaDesconocida;
		
		this.dni.equals(((Persona)personaDesconocida).getDni());
		
		sonLaMismaPersona = this.dni.equals(convertida.getDni()) 
				&& this.nombre.equalsIgnoreCase(convertida.getNombre());
		
				
		return sonLaMismaPersona;
	}
	
	public boolean esHermano (Persona pOtra) {
		boolean sonHermanos = false;
		
		if (!this.equals(pOtra) && this.getApellido1().equalsIgnoreCase(pOtra.getApellido1())
				&& this.getApellido2().equalsIgnoreCase(pOtra.getApellido2())) {
			
			sonHermanos = true;
		}
		
		return sonHermanos;
	}
	
	
	//Constructores
	public Persona () {}

	public Persona (String nombre, String apellido1, String apellido2, String dni) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
	}

	
	//Metodos
	
	
	//Getters-Setters
	private Integer getEdad() {
		return edad;
	}

	private void setEdad(Integer edad) {
		this.edad = edad;
	}

	private String getApellido1() {
		return apellido1;
	}

	private void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getDni() {
		return dni;
	}

	private void setDni(String dni) {
		this.dni = dni;
	}

	private double getAltura() {
		return altura;
	}

	private void setAltura(double altura) {
		this.altura = altura;
	}

	private double getPeso() {
		return peso;
	}

	private void setPeso(double peso) {
		this.peso = peso;
	}

	public Persona getProgenitor1() {
		return progenitor1;
	}

	public void setProgenitor1(Persona progenitor1) {
		this.progenitor1 = progenitor1;
	}

	public Persona getProgenitor2() {
		return progenitor2;
	}

	public void setProgenitor2(Persona progenitor2) {
		this.progenitor2 = progenitor2;
	}
	
	
	
	
	private String getApellido2() {
		return apellido2;
	}

	private void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String toString() {
		return this.nombre + " " + this.apellido1;
	}
	
	
}
