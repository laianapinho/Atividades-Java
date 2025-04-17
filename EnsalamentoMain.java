//package trabs;

public class EnsalamentoMain {
	public static void main(String args[]) {
		Sala salaone = new Sala();
		salaone.bloco = 6;
		salaone.sala = 4;
		salaone.capacidade = 50;
		salaone.acessivel = true;
		Turma turmaone = new Turma();
		turmaone.nome = "Sistemas Embarcados";
		turmaone.professor = "Rafael";
		turmaone.numAlunos = 34;
		turmaone.acessivel = true;
		turmaone.addHorario(9);  
		turmaone.addHorario(15); 		
		turmaone.addHorario(21);  
		TurmaEmSala turmaensala = new TurmaEmSala(turmaone, salaone);
		Ensalamento ensalamento = new Ensalamento();
		ensalamento.addSala(salaone);
		ensalamento.addTurma(turmaone);
		ensalamento.alocar(turmaone, salaone);
		ensalamento.alocarTodas();
		System.out.println(ensalamento.relatorioResumoEnsalamento());
		System.out.println(ensalamento.relatorioTurmasPorSala());
		System.out.println(ensalamento.relatorioSalasPorTurma());
	}
}
