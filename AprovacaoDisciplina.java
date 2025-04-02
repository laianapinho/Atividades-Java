import java.util.ArrayList;
import java.util.Scanner;

public class AprovacaoDisciplina {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> notas = new ArrayList<>();
		while (true) {
		    double nota = scanner.nextDouble();
		    if (nota == -1) {
		        break;
		    }
		    notas.add(nota);
		}
		ArrayList<Integer> frequencias = new ArrayList<>();
		while (true) {
		    int frequencia = scanner.nextInt();
		    if (frequencia == -1) {
		        break;
		    }
		    frequencias.add(frequencia);
		}
		int cargaHoraria = scanner.nextInt();
		double freqmin = 0.75*cargaHoraria;
		int cont = 0;
		for(int i = 0; i<notas.size();i++) {
			if ((notas.get(i)>=5) && (frequencias.get(i)>=freqmin)) {
				cont = cont + 1;
			}
		}
		System.out.print(cont + " ");
		int contn = 0;
		for(int i = 0; i<notas.size();i++) {
			if ((notas.get(i)<5) && (frequencias.get(i)>=freqmin)) {
				contn = contn + 1;
			}
		}
		System.out.print(contn + " ");
		int contf = 0;
		for(int i = 0; i<frequencias.size();i++) {
			if (frequencias.get(i)<freqmin) {
				contf = contf + 1;
			}
		}
		System.out.print(contf);
		scanner.close();
	}	
}
