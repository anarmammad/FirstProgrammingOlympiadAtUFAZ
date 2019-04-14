package SemiFinal;

import java.util.Scanner;

/**
 * @author anarmammad
 **/

public class G_ThePointOnTheInterval {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double alfa = sc.nextDouble();
        System.out.printf("%.2f", (alfa*x2 + x1)/(alfa+1));
        System.out.printf(" %.2f",(alfa*y2 + y1)/(alfa+1));
    }
}
