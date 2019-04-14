package QuarterFinal;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author anarmammad
 **/

public class E_GameWithSwitches {
    static class Lamp {
        private int id;
        private boolean state;
        Lamp(int id) {
            state = false;
            this.id = id;
        }
        private void changeState() {
            this.state = !state;
        }
    }
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] phases = new int[t];
        Lamp lamps[] = new Lamp[t];
        for (int i = 0; i < t; i++) {
            phases[i] = Integer.parseInt(br.readLine());
            lamps[i] = new Lamp(phases[i]);
        }
        for (int i = 0; i < t; i++)
            System.out.println(findOut(lamps[i]));
    }
    private static int findOut(Lamp lamp){
        for (int i = 1; i <= lamp.id; i++)
            if(lamp.id%i==0) lamp.changeState();
        if(lamp.state) return 1;
        return 0;
    }
}
