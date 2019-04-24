/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testunit;

/**
 *
 * @author ismehene
 */
public class Testunit {
     private String hello; 
     private String world; 

    public Testunit() {
        
	    hello = "Hello";  
	    world = "World"; 
	  
    }
    public String formMessage(){ 
	 String message;  
	    message = hello + " "+ world;  
	    return message; 
	  } 
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Testunit helloWorld = new Testunit();  
	System.out.println(helloWorld.formMessage()); 
    }
    
}
