
public class Calculate {

   public static void main (String[] args) {
   	
   	String s= "#$SuDev@mail.Com!%?";
   	int a=0, b=0, c=0,i=0;
   	
   	for(i=0; i<s.length(); i++){
   		
   		char ch=s.charAt(i);
   		if(ch>='a' && ch<='z')
   			a++;
   		else if(ch=='.' || ch==',' || ch==';' || ch==':'|| ch=='?'|| ch=='!')
   			c++;
   		else if(ch=='@'||ch=='#'||ch=='$'||ch=='%'||ch=='^'||ch=='&')
   			b++;
   	}
   	System.out.println("lowercase :"+a);
   	System.out.println("Symbol :"+b);
   	System.out.println("punctuation :"+c);
}
   
}