package SemiFinal;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author anarmammad
 **/

public class E_FavoriteGame {
    private static int largestIndex = -1;
    private static int maxValue = 0;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            StringTokenizer tk = new StringTokenizer(br.readLine());
            int index = Integer.parseInt( tk.nextToken());
            int time = Integer.parseInt(tk.nextToken());
            if(map.containsKey(index)){
                map.put(index, map.get(index)+time);
            }
            else
            map.put(index, time);
        }

        map.forEach((Integer key, Integer value) ->{
                if (value > maxValue){
                    maxValue =value;
                    largestIndex = key;
                }
        });
        System.out.println(largestIndex);
    }
}
