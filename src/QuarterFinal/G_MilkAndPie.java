package QuarterFinal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author anarmammad
 **/

public class G_MilkAndPie {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n_students = Integer.parseInt(br.readLine()), less30 = 0;
        double masses[] = new double[n_students];
        StringTokenizer tk = new StringTokenizer(br.readLine());
        for (int i = 0; i < n_students; i++) {
            masses[i] = Double.parseDouble(tk.nextToken());
            if (masses[i] < 30) less30++;
        }
        System.out.println((int)Math.ceil((double)(less30*200)/900)+" "+less30);
    }
}
