/**
 * @(#)PerfectSquare.java
 *
 *
 * @author 
 * @version 1.00 2022/2/15
 */

import java.util.Scanner;
public class PerfectSquare {

    public static void main (String[] args) {
    	int a;
    	double b;
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter any number: ");
    	
    	
    	a= s.nextInt();
    	b= Math.sqrt(a);
    	
    	if(b%1==0){
    		System.out.println("Perfect Square");
    	}
    	else{
    		System.out.println("Not a Perfect Square");
    	}
    	
}
    
}