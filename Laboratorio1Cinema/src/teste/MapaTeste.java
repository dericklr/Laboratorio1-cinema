package teste;

import main.Mapa;

public class MapaTeste {

	public static void main(String[] args) {
		Mapa m= new Mapa();
		
		m.reservarAssento("1A");
		m.reservarAssento("2B");
		m.reservarAssento("5K");
		m.reservarAssento("14L");
		
		m.mostrarMapa();
		



	}

}
