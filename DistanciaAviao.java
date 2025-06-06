import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
public class DistanciaAviao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] matriz = {
				{0, 	2, 	11, 	6, 	    15, 	11, 	1},  
				{2, 	0, 	7, 	    12, 	4, 	     2, 	15},
				{11, 	7, 	0, 	    11, 	8, 	     3, 	13},
				{6, 	12, 11, 	0, 	    10, 	 2, 	1},
				{15, 	4, 	8, 	    10, 	0,	     5, 	13},
				{11, 	2, 	3, 	     2, 	5, 	     0, 	14},
				{1, 	15, 13, 	1, 	    13, 	14, 	0}   
		};
		ArrayList<Integer> vetores = new ArrayList<>();
		while (true) {
		    int vetor = scanner.nextInt();
		    if (vetor == -1) {
		        break;
		    }
		    vetores.add(vetor);
		}
		HashMap<Integer, Integer> indices = new HashMap<>();
		indices.put(111, 0);
	    indices.put(222, 1);
	    indices.put(333, 2);
	    indices.put(444, 3);
	    indices.put(555, 4);
	    indices.put(666, 5);
	    indices.put(777, 6);
	    int total = 0;
	    for(int i = 0; i<vetores.size() - 1;i++) {
	    	int cidade1 = vetores.get(i);
	        int cidade2 = vetores.get(i + 1);
	        
	        int indice1 = indices.get(cidade1);
	        int indice2 = indices.get(cidade2);
	        
	        total += matriz[indice1][indice2];
		}
	    System.out.println(total);
	    scanner.close();
	}
	
}
