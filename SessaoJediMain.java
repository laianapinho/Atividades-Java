package trabs;
public class SessaoJediMain {
	public static void main(String args[]) {
		IniciadoJedi inium = new IniciadoJedi();
		inium.nome = "Katooni";
		inium.especie = "Tholothian";
		inium.anoNascimento = 23;
		TreinadorJedi treium = new TreinadorJedi();
		treium.titulacao = "Grão-Mestre";
		treium.nome = "Fae Coven";
		SessaoJedi sessao = new SessaoJedi("Instruções de Uso da Força", treium);
		sessao.addIniciado(inium);
		System.out.println(sessao.getDescricao());
	}
}

