package QuarterFinal;

import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 * @author anarmammad
 **/

// PLEASE DON'T ASK ME WHY IT WORKS

public class F_RomanNumerals {
    interface Converter{
        String toRoman(int n);
        int toDec(String roman);
    }
    public static void main(String[] args){
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");

        StringTokenizer tk = new StringTokenizer(new Scanner(System.in).next());

        Converter converter = new Converter() {
            @Override
            public String toRoman(int n) {
                int l =  map.floorKey(n);
                if ( n == l )
                    return map.get(n);
                return map.get(l) + toRoman(n-l);
            }
            @Override
            public int toDec(String roman) {
                if(roman == null || roman.length()==0) return 0;
                if(roman.length()!=1)
                    for (Map.Entry<Integer, String> entry: map.entrySet())
                        if(roman.substring(0, 2).equals(entry.getValue()))
                            return entry.getKey()+toDec(roman.substring(2));
                for (Map.Entry<Integer, String> entry: map.entrySet())
                    if(roman.substring(0, 1).equals(entry.getValue()))
                        return roman.length()==1 ? entry.getKey():entry.getKey()+toDec(roman.substring(1));
                return 0;
            }
        };
        System.out.println(converter.toRoman(converter.toDec(tk.nextToken("+"))+converter.toDec(tk.nextToken("+"))));
    }
}
