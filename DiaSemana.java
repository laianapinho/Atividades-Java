import java.util.Scanner;
import java.util.ArrayList;
public class DiaSemana {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> vetores = new ArrayList<>();
		while (true) {
		    int vetor = scanner.nextInt();
		    if (vetor == -1) {
		        break;
		    }
		    vetores.add(vetor);
		}
		int N = vetores.size()/7;
		int[][] matriz = new int[N][7];
		int cont = 0;
		for(int i = 0; i<N;i++) {
			for (int j = 0; j <7; j++) {
				matriz[i][j] = vetores.get(cont);
				cont = cont +1;
			}
		}
		int semana[] = new int[7];
		for(int i = 0; i<N;i++) {
			for (int j = 0; j <7; j++) {
				semana[j] += matriz[i][j];
			}
		}
		int max = 0;
		for (int j = 0; j <7; j++) {
			if(semana[j] > max) {
				max = semana[j];
			}
		}
		ArrayList<Integer> vetortwo = new ArrayList<>();
		for (int a = 0; a <7; a++) {
			if(semana[a] ==  max) {
				vetortwo.add(a+1);
			}
		}
		for (int b = 0; b < vetortwo.size(); b++) {
			System.out.println(vetortwo.get(b));
		}
		scanner.close();
	}
}
