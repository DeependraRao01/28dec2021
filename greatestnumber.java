package dee;
import java.util.Scanner;

public class greatestnumber {
	public static void findLargest(int num1,int num2, int num3){
	    if(num1>=num2 && num1>=num3){
	        System.out.println(num1+" is the biggest number");
	        
	    }
	    else if(num2>=num1 && num2>=num3){
	        System.out.println(num2+" is the biggest number");
	        
	    }
	    else{
	        System.out.println(num3+" is the biggest number");
	        
	    }
	}
	    
	
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int i=1;
	
	do {
	
	System.out.println("Enter the first number");
	int num1=sc.nextInt();
	
	System.out.println("Enter the second number");
	int num2=sc.nextInt();
	
	System.out.println("Enter the Third number");
	int num3=sc.nextInt();
	
	findLargest(num1,num2,num3);
	i=sc.nextInt();
	}while(i==1);
	}
}



