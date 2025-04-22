package br.edu.icomp.ufam.lab_heranca;

public class Circulo extends FormaGeometrica {
	public int posX;
	public int posY;
	public double raio;
	
	public Circulo (int posX, int posY, double raio) {
		this.posX = posX;
		this.posY = posY;
		this.raio = raio;
	}
	
	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		double pi = Math.PI;
		double C = 2*pi*raio;
		return C;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double pi = Math.PI;
		double A = pi*raio*raio;
		return A;
	}
	
	public String toString() {
		return "Círculo na posição (" + this.posX + ", " + this.posY + ") com raio de " + this.raio + "cm" + " (área=" + getArea() 
		+ "cm2, perímetro=" +  getPerimetro() + "cm)";
				
	}

}
