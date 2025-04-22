package trabs;
public class Sala{
	int bloco;
	int sala;
	int capacidade;
	boolean acessivel;
	
	public Sala() {
		
	}
	public Sala(int bloco,int sala,int capacidade, boolean acessivel) {
        this.bloco = bloco;
        this.sala = sala;
        this.capacidade = capacidade;
        this.acessivel = acessivel;
    }
	
	public String getDescricao() {
		String descricaoAcessibilidade;
		if (acessivel) {
		    descricaoAcessibilidade = "acessível";
		} else {
		    descricaoAcessibilidade = "não acessível";
		}
		return "Bloco " + this.bloco + "," + " Sala " + this.sala + " ("+ this.capacidade + " lugares," + descricaoAcessibilidade + ")";
	}
}