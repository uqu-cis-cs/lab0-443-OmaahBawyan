package edu.uqu.cs;
/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/

import java.util.Scanner;
public class App{

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/
public static void twisters()
{
    for(int i=1;i<=110;i++)
    {
        if(i%2==0)
        {
          System.out.print(" Tweetie ");
          if(i%4==0) System.out.print(" Beetle ");
          else if (i%6==0) System.out.print(" Poodle ");
        }
        else  System.out.print(i);
        if(i%11==0) System.out.print("\n"); 
    }
}

public static int phoneKeypad (String str)
	{
	    String STR=str.toUpperCase();
	    
	    for(int o=0;o<=STR.length()-1;o++)
	    {
	    	char w=STR.charAt(o);
	    	switch(w) {
	    	case('A'): case('B'):case('C'):
	    		return 2;
	    	case('D'):case('E'):case('F'):
	    		return 3;
	    	
	    	case('G'):case('H'):case('I'):
	    		return 4;
	    	
	    	case('J'):case('K'):case('L'):
	    		return 5;
	    	
	    	case('M'):case('N'):case('O'):
	    		return 6;
	    	
	    	case('P'):case('Q'):case('R'):case('S'):
	    		return 7;
	    	
	    	case('T'):case('U'):case('V'):
	    		return 8;
	    	
	    	case('W'):
	    	case('X'):
	    	case('Y'):
	    	case('z'):
	    		return 9;
	    	
	    	}	    		
	    			
	    }
		return -1;
	    	
	}
/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/
 
    public static void main(String [] args) {
        

        /* Write your code here */
     
       //call method twisters()
       twisters();

       Scanner k=new Scanner(System.in);
	   System.out.print("print string:\n");
	   String string=k.nextLine();
       phoneKeypad(string);
       //prompt user to enter a string 
       //call method phoneKeypad(string)


    }

}
