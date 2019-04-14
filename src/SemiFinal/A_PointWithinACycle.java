package SemiFinal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author anarmammad
 **/

public class A_PointWithinACycle {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int xR = Integer.parseInt(tk.nextToken());
        int yR = Integer.parseInt(tk.nextToken());
        int R = Integer.parseInt(tk.nextToken());
        tk = new StringTokenizer(br.readLine());

        int xA = Integer.parseInt(tk.nextToken());
        int yA = Integer.parseInt(tk.nextToken());

        if(Math.hypot((yA - yR), (xA-xR)) <= R){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
