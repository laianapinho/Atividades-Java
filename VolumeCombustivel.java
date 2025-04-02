import java.util.Scanner;

public class VolumeCombustivel {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int h = scan.nextInt(); 
		int r = scan.nextInt();
		double a = H-r;
		if ((0<=h) && (h<=r) && (H>0)) {
			double v = (Math.PI/3)*h*h*(3*r-h);
			System.out.printf("%.3f\n",v);
		}
		else if((r<h) && (h<=a) && (H>0)){
			double va = (2.0/3.0)*(Math.PI)*r*r*r + (Math.PI)*r*r*(h-r);
			System.out.printf("%.3f\n",va);
		}
		else if((a<h) && (h<=H) && (H>0)) {
			double vb = (2.0/3.0)*(Math.PI)*r*r*r + (Math.PI)*r*r*(H-2*r) + (Math.PI/3)*(h-a)*(3*r-(h-a));
			System.out.printf("%.3f\n",vb);
		}
		else {
			System.out.println("-1.000");
		}
		scan.close();
	}	
}
