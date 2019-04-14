package SemiFinal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author anarmammad
 **/

public class H_Subprojects {
    public static void main(String[] args) throws Exception{
        PrintStream pr = new PrintStream(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < a; i++) {
            StringTokenizer tk = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(tk.nextToken());
            int p = Integer.parseInt(tk.nextToken());
            int array[] = new int[p];
            for (int j = 0; j < p; j++) {
                array[j] = Integer.parseInt(tk.nextToken());
            }
            Arrays.sort(array);
            int sum = 0;
            for (int j = p - 1; j >= 0 && t > 0; j--, t--) {
                sum+=array[j];
            }
            pr.print(sum+"\n");
        }
        pr.flush();
    }
}
