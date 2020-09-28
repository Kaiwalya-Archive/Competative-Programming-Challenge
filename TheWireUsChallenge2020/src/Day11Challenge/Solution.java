/*
 * 
 *@author : Kaiwalya Koparkar
 *@date : 28 /9 /2020
 *@resource : https://thewireuschallenge.com  
 *@question : Convert the time from 12-Hour AM/PM format, to military(24-hour) time
 *
 */
package Day11Challenge;
import java.util.*;

public class Solution 
{ 
	static void ConvertTo24(String str) { 
	
	int h1 = (int)str.charAt(1) - '0'; 
	int h2 = (int)str.charAt(0) - '0'; 
	int hh = (h2 * 10 + h1 % 10); 

	
		if (str.charAt(8) == 'A') { 
			if (hh == 12) 
			{ 
				System.out.print("00"); 
				for (int i = 2; i <= 7; i++) 
					System.out.print(str.charAt(i)); 
			} 
			else
			{ 
				for (int i = 0; i <= 7; i++) 
					System.out.print(str.charAt(i)); 
			} 
		}else{ 
			if (hh == 12){ 
				System.out.print("12"); 
				for (int i = 2; i <= 7; i++) 
					System.out.print(str.charAt(i)); 
			} else{ 
				hh = hh + 12; 
				System.out.print(hh); 
				for (int i = 2; i <= 7; i++) 
					System.out.print(str.charAt(i)); 
			} 
		} 
	} 

 
	public static void main (String[] args) { 
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); 
		ConvertTo24(str);
		sc.close();
	} 
} 
 

