package br.edu.icomp.ufam.lab_heranca;

public class FormasMain {
	public static void main(String args[]) {
		FormaGeometrica[] formas = new FormaGeometrica[3];
		formas[0] = new Circulo(4,5,6);
		formas[1] = new Retangulo(3,2,8,9);
		formas[2] = new Quadrado(1,3,4);
		
		 for(int i = 0; i < formas.length; i++) {
	            System.out.println(formas[i]);
	        }
	        
	}
}
