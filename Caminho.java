package br.edu.ufam.icomp.lab_excecoes;

public class Caminho {
	private int tamanho;
	private Coordenada[] caminho;
	
	public Caminho(int maxTam) {
		this.caminho = new Coordenada[maxTam];
	    this.tamanho = 0;
	}
	
	public int tamanho() {
		return tamanho;
	}
	
	public void addCoordenada(Coordenada coordenada) 
			throws TamanhoMaximoExcedidoException, DistanciaEntrePontosExcedidaException{
			if(tamanho >= caminho.length) {
				throw new TamanhoMaximoExcedidoException("Quantidade máxima de coordenadas excedida");
			}
			if (tamanho > 0 && coordenada.distancia(caminho[tamanho - 1]) > 15.0) {
				throw new DistanciaEntrePontosExcedidaException("Distância máxima entre duas coordenadas vizinhas excedida");
			}
			caminho[tamanho] = coordenada;
			tamanho++;
	}
	
	public void reset() {
		for (int i = 0; i < caminho.length; i++) {
		    caminho[i] = null;
		}
		tamanho = 0;
	}
	
	public String toString() {
	    String s = "Dados do caminho:\n";
	    s += " - Quantidade de Pontos: " + this.tamanho + "\n";
	    s += " - Pontos:\n";
	    for (int i = 0; i < tamanho; i++) {
	        s += " -> " + caminho[i].toString() + "\n";
	    }
	    return s;
	}
}
