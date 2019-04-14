package QuarterFinal;

import java.util.Scanner;

/**
 * @author anarmammad
 **/

public class H_TheSecondDigitOfTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.charAt(0)=='-'){
            System.out.println(input.charAt(2));
        }
        else{
            System.out.println(input.charAt(1));
        }
    }
}