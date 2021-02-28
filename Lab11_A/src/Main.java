// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

//import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;


public class Main
{
	final static int MAX = 100;
	static boolean[] finalPrime = new boolean[MAX];
	
	public static void main(String[] args)
	{
		// This main method needs additions for the 100 point version.
		Scanner input = new Scanner(System.in);
		//final int MAX = 100;
		boolean[] primes = new boolean[MAX];
		Arrays.fill(primes, true);
		Arrays.fill(finalPrime, true);
		int pLength = primes.length;
		
		
   
		computePrimes(primes, pLength);
		displayPrimes(primes, pLength);
	}

	public static void computePrimes(boolean primes[], int num)
	{
		
		
		
		
		System.out.println("\nCOMPUTING PRIME NUMBERS");
//	    for (int i=0; i<num; i++){
//	      primes[i] = true;
//	    }
	
	    //arrayFunctions.primes(primes, num);
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
	        	  int a = i*p;
	        	  if (a < l) {
	        		  //System.out.println(primes[p*2]);
	        		  primes[i*p] = false;
	        		  finalPrime[i*p] = false;
	        		  //System.out.println(primes[p*2]);
	        		  
	        	  }
	          }
    		  //System.out.print(i + " ");
    		  
	        }
	      }
	    }
	    //arrayFunctions.presentPrimes(primes, num);
		
		
		
		

    

    
  }

	

	public static void displayPrimes(boolean primes[], int num)
	{
		System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
	    arrayFunctions.presentPrimes(finalPrime, num);
		System.out.println();

	}

}



