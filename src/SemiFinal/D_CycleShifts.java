package SemiFinal;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author anarmammad
 **/

public class D_CycleShifts {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String string = Integer.toBinaryString(n);
        int largest = 0;
        for (int i = 0; i < string.length() ; i++) {
            if(Integer.parseInt(string, 2) > largest){
                largest = Integer.parseInt(string, 2);
            }
            string = string.charAt(string.length() -1) + string.substring(0, string.length() - 1);
        }

        System.out.println(largest );
    }
}
