import java.util.Scanner;
public class MediaColecao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n = scan.nextDouble();
		double sum = 0;
		int count = 0;
		double c = 0;
		while (n != -1) {
			sum +=n;
			count = count + 1;
			n = scan.nextInt();
			c = sum/count;
		}
		//System.out.println(sum);
		System.out.printf("%.2f%n",c);
		scan.close();
	 }
}
