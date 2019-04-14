package QuarterFinal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author anarmammad
 **/
/*should be modified: not the best way*/
public class C_TheWordOfSponsor {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tk.nextToken());
        int m = Integer.parseInt(tk.nextToken());
        int k = Integer.parseInt(tk.nextToken());
        int[] prizers = new int[m];
        int[][] time_matrix = new int[n][n];
        int a, b;
        tk = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            prizers[i] = Integer.parseInt(tk.nextToken()) - 1;
        }
        for (int i = 0; i < k; i++) {
            tk = new StringTokenizer(br.readLine());
            a = Integer.parseInt(tk.nextToken()) - 1;
            b = Integer.parseInt(tk.nextToken()) - 1;
            time_matrix[a][b] = Integer.parseInt(tk.nextToken());
            time_matrix[b][a] = time_matrix[a][b];
            if(time_matrix[a][b]==0){
                System.out.println("The good sponsor!\n0");
                return;
            }
        }
        int from = Integer.parseInt(br.readLine()) - 1;
        int dist[] = new int[n];
        Boolean sptSet[] = new Boolean[n];
        for (int i = 0; i < n; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }
        dist[from] = 0;
        for (int count = 0; count < n-1; count++) {
            int u = minDistance(dist, sptSet, n);
            sptSet[u] = true;
            for (int v = 0; v < n; v++)
                if (!sptSet[v] && time_matrix[u][v]!=0 && dist[u] != Integer.MAX_VALUE && dist[u]+time_matrix[u][v] < dist[v])
                    dist[v] = dist[u] + time_matrix[u][v];
        }
        int largest = 0;
        for (int i = 0; i < m; i++) {
            if(dist[prizers[i]]==Integer.MAX_VALUE ){
                System.out.println("It is not fault of sponsor...");
                return;
            }
            if(dist[prizers[i]] > largest){
                largest = dist[prizers[i]];
            }
        }
        System.out.println("The good sponsor!\n"+largest);
    }
    private static int minDistance(int dist[], Boolean sptSet[], int n) {
        int min = Integer.MAX_VALUE, min_index=-1;
        for (int v = 0; v < n; v++)
            if (!sptSet[v] && dist[v] <= min){
                min = dist[v];
                min_index = v;
            }
        return min_index;
    }
}