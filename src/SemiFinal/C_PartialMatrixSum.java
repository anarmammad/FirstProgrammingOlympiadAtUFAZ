package SemiFinal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * @author anarmammad
 **/

public class C_PartialMatrixSum {
    public static void main(String args[]) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tk.nextToken());
        int m = Integer.parseInt(tk.nextToken());
        int[][] matrix = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            tk = new StringTokenizer(br.readLine());
            for (int j = 1; j <= m; j++)
                matrix[i][j] = Integer.parseInt(tk.nextToken());
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++)
                matrix[i][j] += matrix[i][j -1] + matrix[ i - 1 ][j] - matrix[i-1][j-1];
        }
//        printing
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++)
                if(j!=m)
                    bw.write(matrix[i][j]+" ");
                else
                    bw.write(matrix[i][j]+"");
            bw.newLine();
        }
        bw.flush();
    }
}
