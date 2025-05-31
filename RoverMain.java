package br.edu.ufam.icomp.lab_excecoes;

public class RoverMain {
	public static void main(String args[]) {
		Caminho caminho = new Caminho(2); 

        try {
        	Coordenada coodum = new Coordenada(2,3,4);
        	Coordenada cooddois = new Coordenada(-1,5,6);
        	
        	 caminho.addCoordenada(coodum);
             caminho.addCoordenada(cooddois);
             
             System.out.println(caminho);
        }catch (RoverException e) {
            System.out.println("Erro detectado: " + e.getMessage());
            caminho.reset();
        }
	}     
}
