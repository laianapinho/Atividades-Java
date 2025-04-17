package trabs;

import java.util.ArrayList;

public class Ensalamento {
	ArrayList<Sala> salas = new ArrayList<Sala>();
	ArrayList<Turma> turmas = new ArrayList<Turma>();
	ArrayList<TurmaEmSala> ensalamento = new ArrayList<TurmaEmSala>();

	public Ensalamento() {
		
	}
	
	public void addSala(Sala sala) {
        salas.add(sala);
	}
	
	public void addTurma(Turma turma) {
        turmas.add(turma);
	}
	
	public Sala getSala(Turma turma) {
		 for (int i = 0; i < ensalamento.size(); i++) {
		        if (ensalamento.get(i).turma == turma) {
		          return ensalamento.get(i).sala;
		        }
		    }
		 return null;
	}
	
	public boolean salaDisponivel(Sala sala, int horario) {
		 for (int i = 0; i < ensalamento.size(); i++) {
		        if (ensalamento.get(i).sala == sala) {
		            Turma turma = ensalamento.get(i).turma;
		            if(turma.horarios.contains(horario)){
		            	return false;
		            }	
		        }
		    }
         	return true;
	}
	
	public boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios) {
		 for (int i = 0; i < ensalamento.size(); i++) {
			 if(ensalamento.get(i).sala == sala) {
				 for (int a = 0; a < horarios.size() ; a++) {
					 Turma turma = ensalamento.get(i).turma;
					 int horario = horarios.get(a);
					 if (turma.horarios.contains(horario)) {
						    return false;
						}
				 }	   
			}
		 } 
         return true;
	}
	
	public boolean alocar(Turma turma, Sala sala) {
		//verificar acessibilidade 
		if((turma.acessivel == true) && (sala.acessivel == false)) {
			return false;
		}
		else {
			//verificar capacidade
			if(turma.numAlunos >  sala.capacidade) {
				return false;
			}else {
				//Verifica se a sala está disponivel
				if(!salaDisponivel(sala, turma.horarios)) {
					return false;
				}else {
					TurmaEmSala turmaSala = new TurmaEmSala(turma, sala);
					ensalamento.add(turmaSala);
					return true;
				}
			}
			
		}
	}
	
	public void alocarTodas() {
		for (int i = 0; i < turmas.size(); i++) {
			Turma turma = turmas.get(i);
			for (int b = 0; b < salas.size(); b++) {
				Sala sala = salas.get(b);
				if(alocar(turma,sala)) {
					break;
				}
			}
		}
	}
	
	public int getTotalTurmasAlocadas() {
		int cont = 0;
		 for (int i = 0; i < ensalamento.size(); i++) {
			 if (ensalamento.get(i).sala != null) {
				 cont = cont + 1;
			 }
		 }
		 return cont;
	}
	
	public int getTotalEspacoLivre() {
		int total = 0;
		 for (int c = 0; c < ensalamento.size(); c++) {
			 Sala salaAtual = ensalamento.get(c).sala;
			 Turma turmaAtual = ensalamento.get(c).turma;
			 if (ensalamento.get(c).sala != null) {
				 int diferenca = salaAtual.capacidade - turmaAtual.numAlunos;
				 total += diferenca;
			 }
		 }
		 return total;
	}
	
	public String relatorioResumoEnsalamento() {
		 return "Total de Salas: " + salas.size() + "\n" + "Total de Turmas: " + turmas.size() + "\n" + "Turmas Alocadas: " + getTotalTurmasAlocadas() + "\n" + "Espaços Livres: " + getTotalEspacoLivre();
	}
	
	public String relatorioTurmasPorSala() {
	    String resultado = "";

	    // Adiciona o resumo inicial
	    resultado += "Total de Salas: " + salas.size() + "\n";
	    resultado += "Total de Turmas: " + turmas.size() + "\n";
	    resultado += "Turmas Alocadas: " + getTotalTurmasAlocadas() + "\n";
	    resultado += "Espaços Livres: " + getTotalEspacoLivre() + "\n\n";

	    // Para cada sala, mostra turmas alocadas nela
	    for (Sala salaAtual : salas) {
	        resultado += "--- " + salaAtual.getDescricao() + " ---\n\n";

	        boolean temTurma = false;

	        for (TurmaEmSala alocacao : ensalamento) {
	            if (alocacao.sala == salaAtual) {
	                resultado += alocacao.turma.getDescricao() + "\n\n";
	                temTurma = true;
	            }
	        }

	        if (!temTurma) {
	            resultado += "\n";
	        }
	    }

	    return resultado;
	}

	public String relatorioSalasPorTurma() {
	    String resultado = "";

	    // Adiciona o resumo inicial
	    resultado += "Total de Salas: " + salas.size() + "\n";
	    resultado += "Total de Turmas: " + turmas.size() + "\n";
	    resultado += "Turmas Alocadas: " + getTotalTurmasAlocadas() + "\n";
	    resultado += "Espaços Livres: " + getTotalEspacoLivre() + "\n\n";
	    

	    // Para cada sala, mostra turmas alocadas nela
	   
	    for (Turma turmaAtual : turmas) {
	    	Sala salaAtual = getSala(turmaAtual);
	        resultado += turmaAtual.getDescricao() + "\n";
	        if(salaAtual != null) {
	        	resultado += "Sala: " + salaAtual.getDescricao() + "\n";
	        }else {
	        	resultado += "Sala: SEM SALA\n\n";
	        }
	    }
	    return resultado;
	    
	}
	
}
