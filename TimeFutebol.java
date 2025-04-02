import java.util.ArrayList;
import java.util.Scanner;

public class TimeFutebol {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> timeum = new ArrayList<>();
		while (true) {
		    int timeu = scanner.nextInt();
		    if (timeu == -1) {
		        break;
		    }
		    timeum.add(timeu);
		}
		ArrayList<Integer> timedois = new ArrayList<>();
		while (true) {
		    int timed = scanner.nextInt();
		    if (timed == -1) {
		        break;
		    }
		    timedois.add(timed);
		}
		//numero de vitorias
		int cont = 0;
		for(int i = 0; i<timeum.size();i++) {
			if (timeum.get(i) > timedois.get(i)) {
				cont = cont + 1;
			}
		}
		System.out.print(cont + " ");
		//numero de empates
		int conte = 0;
		for(int i = 0; i<timeum.size();i++) {
			if (timeum.get(i).equals(timedois.get(i))) { 
			    conte = conte + 1;
			}
		}
		System.out.print(conte + " ");
		//numero de derrotas
		int contd = 0;
		for(int i = 0; i<timeum.size();i++) {
			if (timeum.get(i) < timedois.get(i)){
				contd = contd + 1;
			}
		}
		System.out.print(contd);
		scanner.close();
	}
}
	
