package QuarterFinal;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author anarmammad
 **/

public class A_Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger(), B = sc.nextBigInteger();
        switch (A.compareTo(B)){
            case 0:
                System.out.println("=");
                break;
            case -1:
                System.out.println("<");
                break;
            default:
                System.out.println(">");
                break;
        }
    }
}
