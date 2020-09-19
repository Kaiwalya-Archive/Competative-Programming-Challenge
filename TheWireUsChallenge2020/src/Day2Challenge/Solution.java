/*
 * 
 *@author : Kaiwalya Koparkar
 *@date : 19 /9 /2020
 *@resource : https://thewireuschallenge.com  
 *@question : Seperate the camel cased sentence 
 *
 */
package Day2Challenge;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		for (String w : s.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])")) {
	        System.out.println(w);
	    }
		
	}
}
