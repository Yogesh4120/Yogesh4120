package hi;
import java.util.*;
public class intequal {

	public static void main(String[] args) {
		int n1,n2,n3,n4;
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the first number");
		n1=a.nextInt();
		System.out.println("Enter the Second number");
		n2=a.nextInt();
		System.out.println("Enter the Third number");
		n3=a.nextInt();
		System.out.println("Enter the fourth number");
		n4=a.nextInt();
		if(n1==n2 && n2==n3 && n3==n4 && n4==n1)
		{
			System.out.println("All numbers are equal");
		}
		else {
			System.out.println("All numbres are not equal");
		}
				

	}

}
