package trabs;
public class IniciadoJedi{
	String nome;
	String especie;
	int anoNascimento;
	
	public IniciadoJedi() {
		
	}
	public IniciadoJedi(String nome,  String especie,int anoNascimento ) {
        this.nome = nome;
        this.especie = especie;
        this.anoNascimento = anoNascimento;
    }
	
	public String getAnoNascimento() {
		if (this.anoNascimento>=0) {
			return this.anoNascimento + " DBY";
		}
		else {
			return Math.abs(this.anoNascimento) + " ABY";
		}
	}
	
	
	public String getDescricao() {
		return this.nome + " (especie=" + this.especie + ","+ " nascimento=" +  getAnoNascimento() + ")";
	}
}