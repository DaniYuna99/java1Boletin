package aero;

public class AeropuertoArray {

	public static void main(String[] args) {
		crearParqueAeropuerto();
	}
	
	public static void crearParqueAeropuerto() {
	
		Avion[] parqueAeropuerto = new Avion[50];
		
		for (int i = 0; i<50; i++) {
			parqueAeropuerto[i] = new Avion ("identificador_" +i, 120);
		}
		
		for (int j=0; j<parqueAeropuerto.length; j++) {
			System.out.println(parqueAeropuerto[j]);
			
		}
	}
}

token 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