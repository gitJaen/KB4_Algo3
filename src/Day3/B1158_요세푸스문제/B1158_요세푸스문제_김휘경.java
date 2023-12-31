package Day3.B1158_요세푸스문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


/**
 * 원형큐
 */
public class B1158_요세푸스문제_김휘경 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        sb.append("<");

        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        for(int i = 1; i <= n; i++) {
            q.offer(i);
        }

        int count = 1;
        while(!q.isEmpty()){
            if(count == k){
                if(q.size() == 1){
                    sb.append(q.poll());

                }else {
                    sb.append(q.poll()).append(", ");
                }
                count = 1;

            }else{
                int target = q.poll();
                q.offer(target);
                count += 1;
            }

        }

        sb.append(">");

        System.out.println(sb);


    }
}