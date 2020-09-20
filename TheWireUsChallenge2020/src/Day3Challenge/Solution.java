/*
 * 
 *@author : Kaiwalya Koparkar
 *@date : 20 /9 /2020
 *@resource : https://thewireuschallenge.com  
 *@question : To find maximum rectangular area in histogram
 *
 */
package Day3Challenge;
import java.util.*; 

public class Solution { 
	static int getMaxArea(int hist[], int n) { 
		Stack<Integer> s = new Stack<>(); 
		
		int max_area = 0;  
		int tp; 
		int area_with_top; 
		int i = 0; 
		while (i < n) { 
		
			if (s.empty() || hist[s.peek()] <= hist[i]){
			 	s.push(i++); 
			}else{ 
				tp = s.peek(); 
				s.pop(); 
				area_with_top = hist[tp] * (s.empty() ? i : i - s.peek() - 1); 
				if (max_area < area_with_top) 
					max_area = area_with_top; 
			} 
		} 
	
		 
		while (s.empty() == false){ 
			tp = s.peek(); 
			s.pop(); 
			area_with_top = hist[tp] * (s.empty() ? i : i - s.peek() - 1); 
	
			if (max_area < area_with_top) 
				max_area = area_with_top; 
		} 
	
		return max_area; 

	} 
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int hist[] = new int[n];
		
		for(int i=0; i<n ; i++) {
			hist[i] = sc.nextInt();
		}
		System.out.println("Maximum area is " + getMaxArea(hist, hist.length)); 
	} 
} 