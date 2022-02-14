/**
 * @(#)Deadlock.java
 *
 *
 * @author 
 * @version 1.00 2022/2/14
 */


public class Deadlock {

    public static void main (String[] args) {
    	final String printer="printer";
    	final String scanner="scanner";
    	
    	new Thread(){
    		public void run(){
    			synchronized (printer){
    				System.out.println("thread 1: printer is locked");
    				try{Thread.sleep(100);}
    				catch(Exception e){ }
    				System.out.println("Thread 1: trying to lock scanner ");
    				synchronized (scanner){
    					System.out.println("thread 1: scanner is locked");
    				}
    			}
    		}
    	}.start();
    	
    	new Thread(){
    		public void run(){
    			synchronized (scanner){
    				System.out.println("thread 2: scanner is locked");
    				try{Thread.sleep(100);}
    				catch(Exception e){ }
    				System.out.println("thread 2: trying to lock printer ");
    				synchronized (printer){
    					System.out.println("thread 2: printer is locked");
    				}	
    			}
    		}
    	}.start();
    	
}
    
}