import java.util.*;
import java.util.ArrayList;


class arrayFunctions{

  public static void primes(boolean primes[], int num){
	  int l = num;
	    //System.out.println(l);
	
	    for (int i=0; i<l; i++){
	      if (i==0 || i==1){
	
	      }else{
	    	//System.out.println(l);
	        if (primes[i] = true){
	        	//System.out.println(l);
	          for (int p=i; p<l; p++){
	        	  //System.out.println(p);
	        	  int a = p*2;
	        	  if (a < l) {
	        		  //System.out.println(primes[p*2]);
	        		  primes[p*2] = false;
	        		  //System.out.println(primes[p*2]);
	        		  //System.out.println(i);
	        	  }
	          }
	        }
	      }
	    
	    }
	    
	   }
  
  
  public static void presentPrimes(boolean primes[], int num) {
	  int l = num;
	  for (int i=0; i<l; i++) {
		  if (i==0 || i==1){
				
	      }else{
	    	  if (primes[i] == true) {
	    		  System.out.print(i + " ");
	      }
	   }
  }
  
  
  
  
  
  
  
  
  
  
  
  }
  
  
  
  
  
  
  
  
  
  
  
}
	    
	    
	    
	    