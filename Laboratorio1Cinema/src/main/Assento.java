package main;

public class Assento {
	
	private boolean ocupado;
	
	public Assento() {
		this.ocupado=false;
	}


	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	
	public void reservar() {
		ocupado=true;
	}
	
	public void cancelar() {
		ocupado=false;
	}
	

}
