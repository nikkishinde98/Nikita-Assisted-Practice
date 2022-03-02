package StringSearch;

import java.util.Scanner;

public class StringSearch {
	public static void main(String [] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Cars do u have");
		
		num = sc.nextInt();
		String[] names = new String[num];
		
		for(int counter = 0; counter < num; counter++) {
			System.out.println("Enter the name of Friend : " + (counter + 1));
			names[counter] = sc.next();
		}
		sc.close();
		System.out.println("Your Cars are : ");
		for(int counter = 0; counter < num; counter++) {
			System.out.println(names[counter]);
		}
	}
}