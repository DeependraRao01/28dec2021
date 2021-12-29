package dee;
import java.util.Scanner;

public class Array_program {
    static void condi_Fun(int[] a, int n){
    	
        int flag=0;
        
        for(int i=0;i<n-1;i++){
        	
            if(a[i]==a[i+1]){
                flag=1;  
            }
        }
        if(flag==0){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
    }
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = scan.nextInt();
        int[] a = new int[n];
        System.out.println("Enter numberr you want to search in array");
        
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        
        condi_Fun(a,n);
    }
    
}

