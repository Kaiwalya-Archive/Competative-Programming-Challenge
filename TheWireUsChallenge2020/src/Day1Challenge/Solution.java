package Day1Challenge;

import java.io.*;
import java.util.*;

public class Solution{

public static void main(String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    
    int row = sc.nextInt();
    int column = sc.nextInt();
    int matrix[][] = new int[row][column];
    for(int i=0; i<row; i++){
        for(int j=0; j<column; j++){
            matrix[i][j] = sc.nextInt();
        }
    }
    sc.close();
    
    for (int j = 0; j < column; j++) {
         if (j % 2 == 0) {
            for (int i = 0; i < row; i++) {
               System.out.println(matrix[i][j]);
            }
         } else {
            for (int i = row - 1; i >= 0; i--) {
               System.out.println(matrix[i][j]);
            }
         }
    }
    
 }

}
