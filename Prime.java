/**
 * @(#)Prime.java
 *
 *
 * @author 
 * @version 1.00 2022/2/13
 */


public class Prime {

public static void main (String[] args) {
	int i,p,j,n;
	System.out.println("Prime Numbers Between 2 to 100");
	for(i=2; i<=100; i++){
		p=0;
		for(j=2; j<=i/2; j++){
			if(i%j==0){
			p= 1;
			break;
			}
		}
		if(p==0)
			System.out.print(i+", ");
	}
}
    
    
}