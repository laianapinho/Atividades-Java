
public class Conexao {
	String tipoPorta;
	int idProtocolo;
	int taxaTransmissao;
	
	public Conexao() {
		
	}
	public Conexao(String tipoPorta, int idProtocolo, int taxaTransmissao) {
        this.tipoPorta = tipoPorta;
        this.idProtocolo = idProtocolo;;
        this.taxaTransmissao = taxaTransmissao;
    }
	
	public double getTaxaMBps(){
		return this.taxaTransmissao/1024;
	}
	
	public String getProtocoloString(){
		if (this.idProtocolo==1) {
			return "Rotoscope";
		}
		else if(this.idProtocolo==2) {
			return "Acustico";
		}
		else if(this.idProtocolo==3) {
			return "Radio";
		}
		else {
			return "Outros";
		}
	}
	
	public String getDescricao() {
		return "Conexao: tipoPorta=" + this.tipoPorta + ", " + "protocolo=" +  getProtocoloString() + ", "+ "taxaTransmissao=" + getTaxaMBps() + "MBps" + ".";
	}
}
