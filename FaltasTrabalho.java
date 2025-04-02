import java.util.ArrayList;
import java.util.Scanner;

public class FaltasTrabalho {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> faltas = new ArrayList<>();
		while (true) {
		    int falta = scanner.nextInt();
		    if (falta == -1) {
		        break;
		    }
		    faltas.add(falta);
		}
		int contd = 0;//2
		int contt = 0;//3
		int contq = 0;//4
		int contc = 0;//5
		int conts = 0;//6
		int conte = 0;//7
		double porcc = 0;//2
		double porct = 0;//3
		double porcq = 0;//4
		double porcr = 0;//5
		double porcs = 0; //6
		double porce = 0; //7
		for(int i = 0; i<faltas.size();i++) {
			if ((faltas.get(i) == 2)){
				contd = contd + 1;
			}
			if ((faltas.get(i) == 3)){
				contt = contt + 1;
			}
			if ((faltas.get(i) == 4)){
				contq = contq + 1;
			}
			if ((faltas.get(i) == 5)){
				contc = contc + 1;
			}
			if ((faltas.get(i) == 6)){
				conts = conts + 1;
			}
			if ((faltas.get(i) == 7)){
				conte = conte + 1;
			}
		}
		double totalf = contd + contt + contq + contc + conts + conte;
		porcc = (contd/totalf)*100;//2
		porct = (contt/totalf)*100;//3
		porcq =  (contq/totalf)*100;//4
		porcr =  (contc/totalf)*100;//5
		porcs =  (conts/totalf)*100;//6
		porce =  (conte/totalf)*100;//7
		System.out.printf("%.1f %.1f %.1f %.1f %.1f %.1f%n",porcc, porct, porcq, porcr,porcs, porce);//2,3,4,5,6,7
		scanner.close();
	}
}