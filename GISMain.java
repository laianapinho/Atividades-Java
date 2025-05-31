package br.edu.ufam.icomp.lab_encapsulamento;

public class GISMain {
	public static void main(String args[]) {
		Localizavel[] exemp = new Localizavel[2];
		exemp[0] = new Celular(4,5,6);
		exemp[1] = new CarroLuxuoso("D4FG5");
		
		
		 for(int i = 0; i < exemp.length; i++) {
	            System.out.println(exemp[i].getPosicao());
	        }
	        
	}
}
