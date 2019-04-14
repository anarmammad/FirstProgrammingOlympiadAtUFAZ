package SemiFinal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author anarmammad
 **/

public class F_Thylacine {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(tk.nextToken());
        }
        System.out.println(solve(array, n));
    }
    private static int solve(int[] array, int size){
        if (size == 0 || array == null) return -1;
        int maxValue, sum;
        maxValue = sum = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > sum + array[i]) sum = array[i];
            else sum = sum + array[i];

            if (sum > maxValue) maxValue = sum;
        }
        return maxValue;
    }
}
