package relacion6_ejercicio2;

public class Cuenta {
	
	private Double saldo;
	private int numIngresos;
	private int numReintegros;

	public Cuenta() {}
	
	public Cuenta(Double saldoInicial) {
		setSaldo(saldoInicial);
	}

	
	public boolean hacerIngreso(double cantidadAIngresar) {
		boolean exitoOperacion = false;
		
		if(cantidadAIngresar > 0) {
			this.saldo+=cantidadAIngresar;
			this.numIngresos++;
			exitoOperacion = true;
		}
		
		return exitoOperacion;
	}
	
	
	public boolean hacerReintegro(double cantidadASacar) {
		boolean exitoOperacion = false;
		
		if(cantidadASacar <=this.saldo && cantidadASacar>0) {
			this.saldo-=cantidadASacar;
			this.numReintegros++;
			exitoOperacion = true;
		}
		
		return exitoOperacion;
	}
		
	private Double getSaldo() {
		return saldo;
	}

	private void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	private int getNumIngresos() {
		return numIngresos;
	}


	private int getNumReintegros() {
		return numReintegros;
	}
	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		return sb.append("La cuenta tiene un saldo de ")
				.append(getSaldo())
				.append( "€, se han realizado ")
				.append(getNumIngresos())
				.append(" ingresos ")
				.append(" y ")
				.append(getNumReintegros())	
				.append(" reintegros.")
				.toString();

	}


}

