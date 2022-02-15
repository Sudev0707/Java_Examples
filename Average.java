

public class Average {

    public static void main (String[] args) {
    	int i,avg=0,sum=0;
    	for(i=0; i<args.length; i++){
    		sum+=Integer.parseInt(args[i]);
    	}
    	avg= sum/args.length;
    	System.out.println("Average of given numbers is: "+avg);
}
    
}