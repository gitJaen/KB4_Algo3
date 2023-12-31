package Day9.B11047_동전0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11047_동전0_염혜정 {
    static int N, K, cnt;
    static int[] coin;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        coin = new int[N];
        for(int i = 0; i<N; i++) coin[i] = Integer.parseInt(br.readLine());
        br.close();

        cnt = 0;

        for(int i = N-1; i>=0; i--){
            if(K%coin[i]>=K) continue;
            cnt += K/coin[i];
            K %= coin[i];
            if(K==0) break;
        }

        System.out.println(cnt);
    }
}
