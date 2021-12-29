package dee;
import java.util.Scanner;

public class odd_Even_Program {
	public static String odd_Even_Condition(int n) {
		
		String string;
		
		
		
		if(n%2==0) {
			string = (n+" "+"is Even");
		}
		else {
			string=(n+" "+"is odd");
		}
		return string;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int i;
		
		do {
			
			int n=sc.nextInt();
			
			System.out.println(odd_Even_Condition(n));
			System.out.println("if you want to continue press 1");
			
			i=sc.nextInt();
			if(i==1) {

				System.out.println("Enter a number : ");			
			}
		}while(i==1);

	}

}
