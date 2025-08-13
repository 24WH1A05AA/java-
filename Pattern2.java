package intro;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows;
		System.out.println("Enter number of row:");
		rows=sc.nextInt();
		sc.close();
		for(int i=1;i<=rows;i++) {
			for(int j=i;j<=1;j--) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
		
	}
}
