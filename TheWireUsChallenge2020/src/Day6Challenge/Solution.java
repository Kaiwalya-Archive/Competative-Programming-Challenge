/*
 * 
 *@author: Kaiwalya Koparkar
 *@date: 23/ 9/ 2020
 *@resource : https://thewireuschallenge.com
 *@question: remove the consecutive duplicates and replace by *  
 * 
 */
package Day6Challenge;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] res = new char[s.length()];
		sc.close();
		Stack<Character> st = new Stack<>();
		
		//using stack to perform the task
		for(int i=0; i<s.length(); i++) {
			if(st.isEmpty()==true) {
				st.push(s.charAt(i));
				
			}else if(s.charAt(i)==st.peek()){
				st.push('*');
				
			}else {
				st.push(s.charAt(i));
			}
			
		}
		
		//converting the stack elements to the string
		for(int i=res.length-1;i>=0; i--) {
			res[i]=st.peek();
			st.pop();
		}
		
		//printing the final answer
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i]);
		}
		
		
	}
}
