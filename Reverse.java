package a;

import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverse();
	}
	static void reverse() {
		
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter first character");
		char a=sr.next().charAt(0);
		System.out.println("Enter second character");
		char b=sr.next().charAt(0);
		System.out.println("Enter third character");
		char c=sr.next().charAt(0);
		System.out.println("Reverse characters\n"+c+b+a);
	}
}
