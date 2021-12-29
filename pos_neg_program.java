package dee;
import java .util.Scanner;

public class pos_neg_program {
	
	public static String pos_neg_condition(int n) {
		String string;
		if(n>0) {
			string=(n+" "+"is positive number");
		}
		else {
			string=(n+" "+"is negetive number");
		}
		return string;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		int i;
		
		do {
			int n=sc.nextInt();
			
			System.out.println(pos_neg_condition(n));
			System.out.println("if you want to continue press 1");
			
			i=sc.nextInt();
			if(i==1) {

				System.out.println("Enter a number : ");			
			}
		}while(i==1);

	}

}
