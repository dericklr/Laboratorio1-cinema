package main;

import java.util.Map;
import java.util.HashMap;
public class Mapa {
    private Map<String, Assento> assentos;

    public Mapa() {
        this.assentos = new HashMap<>();
        for (int i = 1; i <= 14; i++) {
            for (char j = 'A'; j <= 'L'; j++) {
                String key = i + "" + j;
                assentos.put(key, new Assento());
            }
        }
    }

	

	public int getAssentosLivres() {
        return (int) assentos.values().stream().filter(a -> !a.isOcupado()).count();
    }

    public int getAssentosOcupados() {
        return (int) assentos.values().stream().filter(Assento::isOcupado).count();
    }

    public void mostrarMapa() {
        System.out.println("Mapa de assentos:");
        System.out.println();
        System.out.println("LEGENDA:\n X-Assento ocupado\n O-Assento disponivel");
        System.out.println();
        for (char i = 'A'; i <= 'L'; i++) {
            for (int j = 1; j <= 14; j++) {
                String key = j + "" + i;
                Assento assento = assentos.get(key);
                System.out.print(assento.isOcupado() ? "[X]" : "[O]"); //"X" para assento Ocupado e "O" para Assento livre.
            }
           
            System.out.println();
        }
    }

    public void reservarAssento(String assento) {
        Assento assentoObj = assentos.get(assento);
        if (assentoObj == null) {
            System.out.println("Assento inválido.");
        } else if (assentoObj.isOcupado()) {
            System.out.println("Assento já ocupado.");
        } else {
            assentoObj.setOcupado(true);
            System.out.println("Assento " + assento + " reservado com sucesso.");
        }
    }

    public void cancelarAssento(String assento) {
        Assento assentoObj = assentos.get(assento);
        if (assentoObj == null) {
            System.out.println("Assento inválido.");
        } else if (!assentoObj.isOcupado()) {
            System.out.println("Assento já está livre.");
        } else {
            assentoObj.setOcupado(false);
            System.out.println("Assento " + assento + " cancelado com sucesso.");
        }
    }
}
 