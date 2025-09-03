package intro;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc = new Scanner(System.in);
		sc.close();
		int number = sc.nextInt();
		int factorial=1;
		for (int i=number;i>0;i--) {
			factorial*=i;
		}
		System.out.println("Factorial is " + factorial);
	}
	
}
