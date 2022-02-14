/**
 * @(#)Arms.java
 *
 *
 * @author 
 * @version 1.00 2022/2/13
 */

import java.util.Scanner;
public class Arms {

   public static void main (String[] args) {
   	
   	int n,arm=0,rem,c;
   	System.out.println("Enter any no. ");
   	Scanner sc= new Scanner(System.in);
   	n= sc.nextInt();
   	c=n;
   	
   	
   	while(c!=0)
   	{
   		rem= c%10;
   		arm=(rem*rem*rem)+arm;
   		c= c/10;
   	}
   	if(arm==n)   		
   	 	System.out.print("armstrong");
   	else   		
   	   	System.out.print("not armstrong");
          
}
}