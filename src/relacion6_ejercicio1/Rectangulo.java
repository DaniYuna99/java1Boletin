package relacion6_ejercicio1;

public class Rectangulo {
	
	//Atributos
	private Double longitud = 1.00;
	private Double ancho = 1.00;
	private String id;
	private static Integer contador = 1;
	
	
	
	//Constructores
	public Rectangulo() {
		
	}
	
	public Rectangulo (Double ancho, Double longitud) throws Exception {
		setAncho(ancho);
		setLongitud(longitud);
		
		this.id = "ID" + contador;
		this.contador++;
	}
	
	
	
	//Métodos
	public Double calcularPerimetro () {
		Double perimetro = (this.longitud * 2) + (this.ancho * 2);
		return perimetro;
	}
	
	public Double calcularArea () {
		Double area = this.longitud * this.ancho;
		return area;
	}
	
	
	
	//Getters-Setters
	public Double getLongitud() {
		return longitud;
	}
	
	public void setLongitud(Double longitud) throws Exception {
		if (longitud > 0 && longitud < 20) {
			this.longitud = longitud;
		}else {
			System.out.println("La longitud no es válida.");
		}
	}
	
	public Double getAncho() {
		return ancho;
	}
	
	public void setAncho(Double ancho) {
		if (ancho > 0 && ancho < 20) {
			this.ancho = ancho;
		}else {
			throw new RectanguloException("El ancho introducido no es válido.");
		}
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("El ancho del rectángulo es: ");
		sb.append(getAncho());
		sb.append("\n");
		sb.append("y su longitud es: ");
		sb.append(getLongitud());
		sb.append("\n");
		sb.append(". Su perímetro es: ");
		sb.append(calcularPerimetro());
		sb.append(" y su área: ");
		sb.append(calcularArea());
		
		return sb.toString();
	}

}
