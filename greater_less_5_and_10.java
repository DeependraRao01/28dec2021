package dee;
import java.util.Scanner;

public class greater_less_5_and_10 {
	
	public static boolean greater_less_condition_10(int n) {
		
		boolean less=false;
		
		if(n<=10) {
			less=true;
		}
		
		return less;
		
	}
    public static boolean greater_less_condition_5(int n) {
		
		boolean less=false;
		
		if(n<=5) {
			less=true;
		}
		
		return less;
		
	}
    public static boolean equal_5(int n) {
    	boolean less=false;
    	if(n==5) {
			less=true;
		}
    	return less;
    }
    
    public static boolean equal_10(int n) {
    	boolean less=false;
    	if(n==10) {
			less=true;
		}
    	return less;
    }
	
	public static void main(String[]arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int i;
		
		do {
			int n=sc.nextInt();
			
			if(greater_less_condition_10(n)) {
				if(greater_less_condition_5(n)) {
					if(equal_5(n)) {
						System.out.println(n+" "+"is lesser than 10 but equal to 5");
					}
										
					
					else {
						System.out.println(n+" "+"is lesser than 10 and also lesser than 5");
						
					}
				}
				else if(equal_10(n)) {
					System.out.println(n+" "+"is equal to 10");
				}
				
				else {
					System.out.println(n+" "+"is lesser than 10 but not lesser than 5");
				}
			}
			else {
				System.out.println(n+" "+"is greater than 10");
			}
			

			System.out.println("if you want to continue press 1");
			
			i=sc.nextInt();
			if(i==1) {

				System.out.println("Enter a number : ");			
			}
		}while(i==1);
		
		
	}

}
