
public class AstromechMain {
	public static void main(String args[]) {
	    Mestre mest = new Mestre();
	    mest.nome = "Luke Skywalker";
	    mest.anoNascimento = 19;
	    mest.afiliacao = "Alianca para Restauracao da Republica";
	    mest.posto = "Jedi";
	    Astromech astro = new Astromech();
	    astro.modelo = "R2-D2";
	    Sensor senso = new Sensor();
	    senso.cor = "Azul";
	    senso.resolucao = 512.0;
	    senso.framesPorSegundo = 240;
	    Conexao conect = new Conexao();
	    conect.tipoPorta = "SCOMP Link";
	    conect.idProtocolo = 1;
	    conect.taxaTransmissao = 4096000;
	    boolean resultadoforca = mest.possuiForca();
	    String resultadoanoNascimento = mest.getAnoNascimentoString();
	    double resultadoPixelsPorSegundo = senso.getMPixelsPorSegundo();
	    String resultadoprotocolo = conect.getProtocoloString();
	    double resultadotaxatransmissao = conect.getTaxaMBps();
	    System.out.println("Astromech modelo" + astro.modelo + " Mestre: nome= " + mest.nome + " anoNascimento=" + resultadoanoNascimento + " afiliacao=" + mest.afiliacao + "posto=" + mest.posto + " possuiForca=" 
	    + resultadoforca + " Sensor:" + senso.cor + "resolucao=" + senso.resolucao +"Mp" +" framesPorSegundo=" + senso.framesPorSegundo + "fps" + " mPixelsPorSegundo=" + resultadoPixelsPorSegundo + "Mpps" 
	    + " Conexao: tipoPorta=" + conect.tipoPorta + "protocolo=" + resultadoprotocolo +  " taxaTransmissao=" + resultadotaxatransmissao + "MBps");
	}
}
