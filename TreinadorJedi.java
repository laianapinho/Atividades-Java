package trabs;

public class TreinadorJedi{
	String titulacao;
	String nome;
	
	public TreinadorJedi() {
		
	}
	
	public TreinadorJedi(String titulacao,  String nome) {
        this.titulacao = titulacao;
        this.nome = nome;
    }
	
	public String getDescricao() {
		return this.titulacao + " " + this.nome;
	}
}