/*
 * 
 *@author : Kaiwalya Koparkar
 *@date : 26 /9 /2020
 *@resource : https://thewireuschallenge.com  
 *@question : Reversing the array.
 *
 */
package Day9Challenge;
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
	
		for (int i = 0; i < size / 2; i++) { 
            int t = arr[i]; 
            arr[i] = arr[size - i - 1]; 
            arr[size - i - 1] = t; 
        } 
		
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]);
		}
	}
}
