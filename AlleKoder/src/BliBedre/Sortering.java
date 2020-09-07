package BliBedre;

public class Sortering {

	public static int[] plukksortering(int[] tall) {
		int[] ny = new int[tall.length];
		
		for (int i = 0; i < tall.length; i++) {
			int minPos = 0;
			for (int j = 1; j < tall.length; j++) {
				if (tall[j] < tall[minPos]) {
					minPos = j;
				}
			}	
			ny[i] = tall[minPos];
			tall[minPos] = Integer.MAX_VALUE;
		}
		return ny;
	}
	


	public static void main(String[] args) {
		int[] tab = {9, 8, 32, 1, 7, 69};
		
		int[] sortertTab = plukksortering(tab);
		
		for (int e: sortertTab) { 
			System.out.println(e + " ");
		}
		}
	}
