/**
 * @(#)Fibonacci.java
 *
 *
 * @author 
 * @version 1.00 2022/2/13
 */

import java.util.Scanner;
public class Javagcd{

   public static void main (String[] args) {
   	int a,b,i,gcd=1;
   	
   	Scanner sc=new Scanner(System.in);
   	
   	System.out.println("enter first no.: ");
   	a= sc.nextInt();
   	System.out.println("enter second no.: ");
   	b= sc.nextInt();
   	
   	for(i=1; i<=a&&i<=b; i++){
   		if(a%i==0 && b%i==0){
   			gcd=i;
   		}
   	}
   System.out.println("gcd of "+a+" and "+b+" is :"+gcd);
}
   
}