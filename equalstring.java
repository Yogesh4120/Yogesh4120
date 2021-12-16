package a;
import java.util.Scanner;
public class equalstring {

	public static void main(String[] args) {
		String a,b;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first String");
		a=scan.nextLine();
		System.out.println("Enter the second String");
		b=scan.nextLine();
		if(a.equals(b))
		{
			System.out.println("String Equals");
		}
		else
		{
			System.out.println("String not equals");
		}

	}

}
