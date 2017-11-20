package chapter03_problems;
import java.util.Scanner;

public class Probelm_pratices {

	public static void main(String[] args) {
		double[][] ary = new double[4][];
		ary[0] = new double[4];
		ary[1] = new double[2];
		ary[2] = new double[3];
		ary[3] = new double[1];
		int i, j;
		Scanner input = new Scanner(System.in);
		
		for(i = 0; i<ary.length; i++) {
			for(j = 0; j<ary[i].length; j++) {
				ary[i][j] = input.nextDouble();
			}
		}
		input.close();
		
		for(i = 0; i<ary.length; i++) {
			for(j = 0; j<ary[i].length; j++) {
				System.out.print(ary[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}
}
