package br.edu.ufam.icomp.lab_excecoes;


public class Coordenada {
	private int posX;
	private int posY;
	private int digito;
	
	public Coordenada(int posX, int posY, int digito)
	        throws CoordenadaNegativaException, CoordenadaForaDosLimitesException, DigitoInvalidoException {

	    if (posX < 0 || posY < 0) {
	        throw new CoordenadaNegativaException("Coordenada com valor negativo");
	    }

	    if (posX >= 30000 || posY >= 30000) {
	        throw new CoordenadaForaDosLimitesException("Coordenada com valor fora dos limites");
	    }

	    if (digito < 0 || digito > 9) {
	        throw new DigitoInvalidoException("Dígito deve estar entre 0 e 9");
	    }

	    int soma = posX + posY;
	    if (soma % 10 != digito) {
	        throw new DigitoInvalidoException("Dígito inválido: " + digito + ". Esperado: " + (soma % 10));
	    }
	    this.posX = posX;
	    this.posY = posY;
	    this.digito = digito;
	}
	
	public int getPosX() {
		return posX;
	}
	
	public int getPosY() {
		return posY;
	}
	
	public double distancia(Coordenada coordenada) {
		 int deltaX = this.posX - coordenada.getPosX();
		 int deltaY = this.posY - coordenada.getPosY();
		 return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
	}
	
	public String toString() {
		return  this.posX + ", " + this.posY;
				
	}
}
