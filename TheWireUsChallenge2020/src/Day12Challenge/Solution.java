/*
 * 
 *@author : Kaiwalya Koparkar
 *@date : 29 /9 /2020
 *@resource : https://thewireuschallenge.com  
 *@question : Stock span problem
 *
 */
package Day12Challenge;
import java.util.*;

class GFG { 
	
	static void calculateSpan(int price[], int n, int S[]) 
	{ 
		
		S[0] = 1; 

		
		for (int i = 1; i < n; i++) { 
			S[i] = 1;  
			for (int j = i - 1; (j >= 0) && (price[i] >= price[j]); j--) 
				S[i]++; 
		} 
	} 

	
	static void printArray(int arr[]) 
	{ 
		System.out.print(Arrays.toString(arr)); 
	} 


	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		int stocks = sc.nextInt();
		int price[] = new int[stocks];
		for(int i=0; i<stocks; i++) {
			price[i] = sc.nextInt();
		}

		int S[] = new int[stocks]; 

		
		calculateSpan(price, stocks, S); 

		
		printArray(S); 
	} 
} 


