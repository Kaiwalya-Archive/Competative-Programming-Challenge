/*
 * 
 *@author : Kaiwalya Koparkar
 *@date : 21 /9 /2020
 *@resource : https://thewireuschallenge.com  
 *@question : write a program that inserts between each pair of characters the difference between their 
 *            ascii codes and prints the answer.
 *
 */
package Day4Challenge;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		
		for(int i=0; i<s.length(); i++) {
			int a = (int)s.charAt(i);
			if(i+1==s.length()-1) {
				int b = (int)s.charAt(i+1);
				int c=b-a;
				System.out.print(s.charAt(i));
				System.out.print(c);
				System.out.println(s.charAt(i+1));
				break;
			}
			int b = (int)s.charAt(i+1);
			int c=b-a;
			System.out.print(s.charAt(i));
			System.out.print(c);
			
		}
		
	}
	
}
