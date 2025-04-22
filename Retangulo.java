package br.edu.icomp.ufam.lab_heranca;

public class Retangulo extends FormaGeometrica {
	public int posX;
	public int posY;
	public double largura;
	public double altura;
	
	public Retangulo (int posX, int posY, double largura, double altura) {
		this.posX = posX;
		this.posY = posY;
		this.largura= largura;
		this.altura= altura;
	}
	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		double C = 2*(largura + altura);
		return C;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double A = largura * altura;
		return A;
	}
	
	public String toString() {
		return "Retângulo na posição (" + this.posX + ", " + this.posY + ") com largura de " + this.largura + "cm" + " e altura de " + 
	this.altura + "cm (área=" +  getArea() + "cm2, perímetro=" +  getPerimetro() + "cm)";
				
	}

}
