package ui;

import java.util.Scanner;

import main.Mapa;

public  class Menu implements Opcoes {
	private Scanner s;
	private Mapa mapa;
	
	public Menu() {
		 s= new Scanner(System.in);
			mapa=new Mapa();
			}
	
	
	public void mostraMenu() {
		int opcoes;
		
		do {
			System.out.println(" O que deseja fazer?\n(1) Reservar\n(2) Cancelar\n(3) Quantidade de assentos\n(4) Mostrar mapa\n(0) Sair\nOpcao: ");
			opcoes=s.nextInt(); 
			s.nextLine();
			
			switch (opcoes) {
			case 1:
				if(reserva())
					System.out.println();
					
				else
					System.out.println("N�o foi possivel fazer a reserva...");
				break;
				
			case 2:
				if(cancela()) 
					System.out.println();
				else
					System.out.println("N�o foi possivel cancelar...");
				break;
			
			
			case 3:
				quantAssentos();
				break;
				
				
			case 4:
				mostrarMapaAssentos();
				break;
			
			case 0:
				break;
				
				default:
				System.out.println("Op��o invalida...");
								
		}
		}while(opcoes!=0);
		
	}
	
	    

	    public boolean reserva() {
	    	boolean assentoReservado = true;
	        System.out.print("Digite o n�mero do assento (exemplo: 1A): ");
	        String assento = s.nextLine().toUpperCase();
	        mapa.reservarAssento(assento);
	        return assentoReservado;
	    }

	    public boolean cancela() {
	    	boolean assentoCancelado=true;
	        System.out.print("Digite o n�mero do assento (exemplo: 1A): ");
	        String assento = s.nextLine().toUpperCase();
	        mapa.cancelarAssento(assento);
	        return assentoCancelado;
	    }

	    public void mostrarMapaAssentos() {
	        mapa.mostrarMapa();
	    }
	

	    public void quantAssentos() {
	    	int assentosLivres = mapa.getAssentosLivres();
	    	int assentosOcupados = mapa.getAssentosOcupados();
	    	System.out.println("Assentos livres: " + assentosLivres);
	    	System.out.println("Assentos ocupados: " + assentosOcupados);

	    }


		
		

		
		}


	        

		


