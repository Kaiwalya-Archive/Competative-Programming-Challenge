/*
 * 
 *@author : Kaiwalya Koparkar
 *@date : 25 /9 /2020
 *@resource : https://thewireuschallenge.com  
 *@question : For each query string determine how many times it occurs in the list of input string
 *
 */

package Day8Challenge;
import java.util.*;

public class Solution 
{ 
	static int search(String[]inputString, String queryString) 
	{ 
			int counter = 0; 
			for (int j = 0; j < inputString.length; j++) {
				if (queryString.equals(inputString[j])) {
					counter++;
				}
					
			}

		return counter; 
	} 

	static void findString(String[] inputString, String queryString[]) 
	{ 
		for (int i=0;i<queryString.length; i++) 
			System.out.print(search(inputString, queryString[i]) + " "); 
	} 

	
	public static void main(String[] args) { 

		String[] inputString = {"aba","baba","aba","xzxb"}; 
		String[] queryString = {"aba","xzxb","ab"}; 
		findString(inputString, queryString); 
	} 
} 

