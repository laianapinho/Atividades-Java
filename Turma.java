package trabs;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Turma{
	String nome;
	String professor;
	int numAlunos;
	boolean acessivel;
	ArrayList<Integer> horarios = new ArrayList<>();
	
	public Turma() {
		
	}
	public Turma(String nome,String professor,int numAlunos,boolean acessivel) {
        this.nome = nome;
        this.professor = professor;
        this.numAlunos = numAlunos;
        this.acessivel = acessivel;
    }
	
	public void addHorario(int horario) {
	        horarios.add(horario);
	}
	 
	public String getHorariosString() {
		List<String> resultado = new ArrayList<>();
		List<String> diassemana = Arrays.asList("segunda", "terça","quarta","quinta","sexta");
		List<String> hora = Arrays.asList("8hs","10hs","12hs","14hs","16hs", "18hs","20hs");
		List<Integer> horariosOrdenados = new ArrayList<>(horarios);
		Collections.sort(horariosOrdenados);
		for (int numero : horariosOrdenados) {
			int linha = (numero - 1) / 7;  // agora linha = dia da semana
			int coluna = (numero - 1) % 7; // agora coluna = horário
			String dia = diassemana.get(linha);
			String hor = hora.get(coluna);
		    resultado.add(dia + " " + hor);
		    }
		return String.join(", ", resultado);
	}
	
	
	public String getDescricao() {
		String descricaoAcessibilidade;
		if (acessivel) {
		    descricaoAcessibilidade = "sim";
		} else {
		    descricaoAcessibilidade = "não";
		}
		return "Turma: " + this.nome + "\n" + "Professor: " + this.professor + "\n"+ "Número de Alunos: " +  this.numAlunos + 
				 "\n" + "Horário: " + getHorariosString() + "\n" +  "Acessível: " + descricaoAcessibilidade;
	}
}