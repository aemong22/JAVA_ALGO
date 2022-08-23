package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class B_1389 {
	static int n;
	static int m;
	static int min = Integer.MAX_VALUE;
	static int[][] map;
	static int result;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		n = Integer.parseInt(st.nextToken()); // 사람 수
		m = Integer.parseInt(st.nextToken()); // 친구 연산 수
		

		map = new int[n+1][n+1];
		for(int i = 0 ; i < m ; i++) {
			st = new StringTokenizer(in.readLine());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			map[n1][n2] = 1;
			map[n2][n1] = 1;
		}
		result = 0;
		for(int i = 1; i<= n; i++) {
			bfs(i,1);
		}
		System.out.println(result);
		
		

	}
	
	private static void bfs(int start, int depth) {
		Queue<Integer>queue = new ArrayDeque<>();
		boolean[] visited = new boolean[n+1];
		int sum = 0;
		visited[start] = true;
		queue.offer(start);

		while (!queue.isEmpty()) {
			
			int current = queue.poll();

			// current 정점의 인접정점들에 큐에 넣어서 차후 탐색하도록 만들기
			for (int i = 0; i < n; i++) {
				if (!visited[i] && map[current][i] != 0) {  // 방문하지 않았으며 인접한 경우
					visited[i] = true;
					queue.offer(i);
				}
			}
			
			sum += queue.size() * depth++;
		}
		
		if(min > sum) {
			min = sum;
			result = start;
		}
	}

}
