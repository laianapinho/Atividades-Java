import java.util.Scanner;

public class SomaColecoes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int sum = 0;
		while(true) {
			if(n == -1) {
				System.out.println(sum);
				sum = 0;
				n = scan.nextInt();
				if(n==-1) {
					break;
				}
			}else {
				sum += n;
				n = scan.nextInt();
			}
		}
		scan.close();
	 }
}
