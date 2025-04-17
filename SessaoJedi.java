package trabs;
import java.util.ArrayList;
public class SessaoJedi{
    String nome;
	TreinadorJedi treinador;
	ArrayList<IniciadoJedi> iniciados = new ArrayList<IniciadoJedi>();
	
	public SessaoJedi() {
		
	}
	
	public SessaoJedi(String nome, TreinadorJedi treinador) {
        this.nome = nome;
        this.treinador = treinador;
    }
	
	public void addIniciado(IniciadoJedi iniciado) {
	    for (int i = 0; i < iniciados.size(); i++) {
	        if (iniciados.get(i).nome.equals(iniciado.nome)) {
	            return;
	        }
	    }
	    iniciados.add(iniciado);
	}
	
	public IniciadoJedi getIniciado(String nome) {
		 for (int i = 0; i < iniciados.size(); i++) {
		        if (iniciados.get(i).nome.equals(nome)) {
		            return iniciados.get(i);
		        }
		    }
		 return null;
	}
	
	public double getMediaAnoNascimento() {
		double soma = 0;
		for (int i = 0; i < iniciados.size(); i++) {
			soma = soma + iniciados.get(i).anoNascimento;
		}
		double media = soma/iniciados.size();
		return media;
	}
	
	public String getDescricao() {
	    String descricaoIniciados = "";
	    for (int i = 0; i < iniciados.size(); i++) {
	        descricaoIniciados += "\n - Iniciado " + (i + 1) + ": " + iniciados.get(i).getDescricao();
	    }

	    return "-->" + "SESSÃO " + this.nome + " (Treinador: " + treinador.getDescricao() + ")" + descricaoIniciados;
	}
	
}
