/**
 * @(#)SudevPyramid.java
 *
 *
 * @author 
 * @version 1.00 2022/2/15
 */

import java.util.Scanner;
public class SudevPyramid {

  public static void main (String[] args) {
  	
  	Scanner sc=new Scanner(System.in);
  	System.out.println("Enter number of rows");
  	
  	int r=sc.nextInt();
  	System.out.println("..pyramid..");
  	
  	for(int i=1; i<=r; i++){
  		for(int j=r; j>i; j--){
  			System.out.print("  ");
  		}
  		for(int k=1; k<=i; k++){
  			System.out.print(k+" ");
  			
  		}
  		for(int l=i-1; l>=1; l--){
  			
  			System.out.print(l+" ");
  		}
  		System.out.println(" ");
  	}
 }
    
}