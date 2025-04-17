import java.util.Scanner;
public class ContaEnergia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n = scan.nextDouble();
		char tipo = scan.next().charAt(0);
		if(tipo == 'R'){
			if((n>0) && (n<=500)){
				double b = n* 0.40;
				System.out.printf("%.2f\n",b);
			}
			else if (n>500){
				double c = n* 0.65;
				System.out.printf("%.2f\n",c);
			}
		}
		else if(tipo == 'C'){
			if((n>0) && (n<=1000)) {
				double d = n* 0.55;
				System.out.printf("%.2f\n",d);
			}
			else if(n>1000) {
				double a = n* 0.60;
				System.out.printf("%.2f\n",a);
			}
		}
		else if(tipo == 'I'){
			if ((n>0) && (n<=5000)) {
				double d = n* 0.55;
				System.out.printf("%.2f\n",d);
			}
			else if(n>5000) {
				double a = n* 0.60;
				System.out.printf("R$%.2f\n",a);
			}
		}
		else if((tipo !=  'R') && (tipo != 'C') && (tipo != 'I')) {
				System.out.println("-1.00");
		}
		if(n<0) {
			System.out.println("-1.00");
		}
		scan.close();
	 }
}
