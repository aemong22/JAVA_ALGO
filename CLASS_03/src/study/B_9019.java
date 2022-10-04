package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;


public class B_9019 {
	static int a;
	static int b;
	static String str;
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(in.readLine());
		for(int tc = 1; tc <= t; tc++) {
			st = new StringTokenizer(in.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());

			str = "";
			bfs();
			sb.append(str);
			sb.append("\n");
		}

		System.out.println(sb);
	}


	// 메모리초과가 나지 않도록 Queue에 방문체크된 애들은 넣지 않는다. (방문체크를 필수로 해야된다.)
	private static void bfs() {
		Queue<ans> q = new ArrayDeque<>();
		boolean[] visited = new boolean[10000];
		visited[a] = true;

		q.offer(new ans(a,""));

		while(!q.isEmpty()) {
			ans answer = q.poll();

			if(answer.cal == b) {
				str = answer.result;
				break;
			}

			// D 계산
			int t1 = answer.cal * 2;
			if(t1 > 9999) {
				t1 = t1 % 10000;
			}
			if(!visited[t1]) {
				visited[t1] = true;
				q.offer(new ans(t1,answer.result+"D"));
			}

			// S 계산
			int t2 = answer.cal -1;
			if(answer.cal == 0) {
				t2 = 9999;
			}
			if(!visited[t2]) {
				visited[t2] = true;
				q.offer(new ans(t2,answer.result+"S"));
			}

			String temp = Integer.toString(answer.cal);
			int size = temp.length();

			for(int i = 0; i < 4-size; i++) {
				temp = "0" + temp;
			}

			// L 계산
			String t3 = temp.substring(1) + temp.substring(0,1);
			int tt3 = Integer.parseInt(t3);
			if(!visited[tt3]) {
				visited[tt3] = true;
				q.offer(new ans(tt3, answer.result+"L"));
			}

			// R 계산
			String t4 = temp.substring(3) + temp.substring(0,3);
			int tt4 = Integer.parseInt(t4);
			if(!visited[tt4]) {
				visited[tt4] = true;
				q.offer(new ans(tt4, answer.result+"R"));
			}
		}


	}

	public static class ans {
		int cal;
		String result;

		public ans(int c, String s) {
			this.cal = c;
			this.result = s;
		}
	}

}
