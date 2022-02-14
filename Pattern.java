/**
 * @(#)Pattern.java
 *
 *
 * @author 
 * @version 1.00 2022/2/13
 */

import java.util.Scanner;
public class Pattern {

  public static void main (String[] args) {
  	
  	Scanner sc= new Scanner(System.in);
  	System.out.println(" Enter no. of rows :");
  	
  	int r=sc.nextInt();
  	System.out.println("..pattern..");
  	for(int i=1; i<=r; i++){
  		for(int j=1; j<=i; j++){
  			System.out.print(j+" ");
  		}
  		System.out.println();
  	}
}
    
}