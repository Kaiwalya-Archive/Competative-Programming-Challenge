
/*
 * 
 *@author : Kaiwalya Koparkar
 *@date : 24 /9 /2020
 *@resource : https://thewireuschallenge.com  
 *@question :Write a program which can calculate the occurance of the characters in the string
 *
 */
package Day7Challenge;
import java.util.*;
class Solution{ 
	static final int MAX_CHAR = 256; 

	static void getOccuringChar(String str) 
	{ 
		// Create an array of size 256 i.e. ASCII_SIZE 
		int count[] = new int[MAX_CHAR]; 

		int len = str.length(); 

		// Initialize count array index 
		for (int i = 0; i < len; i++) 
			count[str.charAt(i)]++; 

		// Create an array of given String size 
		char ch[] = new char[str.length()]; 
		for (int i = 0; i < len; i++) { 
			ch[i] = str.charAt(i); 
			int find = 0; 
			for (int j = 0; j <= i; j++) { 

				// If any matches found 
				if (str.charAt(i) == ch[j]) 
					find++;				 
			} 

			if (find == 1){
              	System.out.print( str.charAt(i));
                if(count[str.charAt(i)] != 1){
            	System.out.print(count[str.charAt(i)]);
                }
            } 
				
          		
		} 
	} 
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in); 
		String str = sc.nextLine(); 
		getOccuringChar(str); 
	} 
} 
