/*
 * 
 *@author : Kaiwalya Koparkar
 *@date : 27 /9 /2020
 *@resource : https://thewireuschallenge.com  
 *@question : Perform the left shift of the array d times
 *
 */
package Day10Challenge;
import java.util.*;
public class Solution {

	public static int[] rotate(int[] arr, int size) {
		/*
		 *This function only shifts 1 element to the
		 *left. so number of times this function will be
		 *called that many times it will shift to left
		 */
		
		int temp = arr[0];
		for(int i=0 ; i < size; i++) {//rotating to left 1 times
			if(i+1 <= size-1) {
				arr[i] = arr[i+1];
			}
		}
		arr[size-1] = temp;
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();//takes size of array
		int d = sc.nextInt();//times of rotation to be done
		int[] arr = new int[size];
		int[] res = new int[size];
		
		for(int i=0; i<size; i++) {//taking input in array
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<d; i++){//rotating d times
			arr = rotate(arr,size);
		}
		
		for(int i=0; i<size; i++) {//printing the final array
			System.out.print(arr[i]+" ");
		}
	}
}
