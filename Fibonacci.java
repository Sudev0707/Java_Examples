/**
 * @(#)Fibonacci.java
 *
 *
 * @author 
 * @version 1.00 2022/2/13
 */

import java.util.Scanner;
public class Fibonacci {

   public static void main (String[] args) {
   	int i,n,f=0,s=1;
   	System.out.println("enter range.");
   	Scanner r=new Scanner(System.in);
   	n=r.nextInt();
   	
   	for(i=1; i<=n; i++){
   		System.out.print(f +", ");
   		
   		int l= f+s;
   		f=s;
   		s=l;
   	}
}
   
}