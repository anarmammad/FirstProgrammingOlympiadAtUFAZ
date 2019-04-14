package QuarterFinal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author anarmammad
 **/

public class D_MouseAndCorns {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(tk.nextToken());
        int n = Integer.parseInt(tk.nextToken());
        int[][] matrix = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            tk = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++)
                matrix[i][j] = Integer.parseInt(tk.nextToken());
        }
        for (int i = 1; i <= m; i++)
            for (int j = n - 1; j >= 0; j--)
                matrix[i][j] += matrix[i-1][j] > matrix[i][j+1] ? matrix[i-1][j]:matrix[i][j+1];
        int row = m;
        int col = 0;
        while(true){
            if(row == 1 && col==n - 1) break;
            if(row==1){
                while (col!=n-1){
                    System.out.print("R");
                    col++;
                }
                break;
            }
            if(col==n-1){
                while (row!=1){
                    System.out.print("F");
                    row--;
                }
                break;
            }
            if (matrix[row - 1][col] > matrix[row][col + 1]) {
                System.out.print("F");
                row--;
            } else {
                System.out.print("R");
                col++;
            }
        }
    }
}
