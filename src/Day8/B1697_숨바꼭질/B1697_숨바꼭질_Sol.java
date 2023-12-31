package Day8.B1697_숨바꼭질;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class B1697_숨바꼭질_Sol {

	static int N;
	static int K;
	static int maxValue = 100001;
	static int ans = 0;
	static int [] time;


	// time 배열 초기값 = -1 (정답)
	public static void searchBFS() {

		Queue<Integer> que = new ArrayDeque<>();
		time = new int [maxValue];
		Arrays.fill(time , -1);

		que.add(N);
		time[N] = 0;

		while(!que.isEmpty()) {
//			System.out.println(Arrays.toString(Arrays.copyOf(time, 10)));
			int now = que.poll();
			if(now == K) return;

			// 3). X*2 연산
			if( (now*2) >= 0 && (now*2) < maxValue && time[now * 2] == -1) {
				que.add(now*2);

				time[now*2] = time[now] + 1;
			}

			// 1). X + 1 
			if( (now + 1) >= 0 && (now + 1) < maxValue && time[now + 1] == -1 ) {
				que.add(now + 1);
				time[now + 1] = time[now] + 1;
			}

			// 2). X - 1
			if( (now - 1) >= 0 && (now - 1) < maxValue && time[now - 1] == -1) {
				que.add(now - 1);
				time[now - 1] = time[now] + 1;
			}


		}
	}


	// time 배열 초기값 = 0 인 경우 (오답)
	public static void searchBFS2() {

		Queue<Integer> que = new ArrayDeque<>();
		time = new int [maxValue];

		que.add(N);
		time[N] = 0;

		while(!que.isEmpty()) {
<<<<<<< HEAD
			System.out.println(Arrays.toString(Arrays.copyOf(time, 10)));
=======
//			System.out.println(Arrays.toString(Arrays.copyOf(time, 10)));
>>>>>>> 4dcbe1c1477d9771d26381e922dce68f6d0303e4
			int now = que.poll();
			if(now == K) return;
			
			// 3). X*2 연산
			if( (now*2) >= 0 && (now*2) < maxValue && time[now * 2] == 0) {
				que.add(now*2);
				time[now*2] = time[now] + 1;
			}
			
			// 1). X + 1 
			if( (now + 1) >= 0 && (now + 1) < maxValue && time[now + 1] == 0 ) {
				que.add(now + 1);
				time[now + 1] = time[now] + 1;
			}

			// 2). X - 1
			if( (now - 1) >= 0 && (now - 1) < maxValue && time[now - 1] == 0) {
				que.add(now - 1);
				time[now - 1] = time[now] + 1;
			}

		}
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();

<<<<<<< HEAD
		searchBFS2();
=======
		searchBFS();
>>>>>>> 4dcbe1c1477d9771d26381e922dce68f6d0303e4
		
		System.out.println(time[K]);

	}
}
