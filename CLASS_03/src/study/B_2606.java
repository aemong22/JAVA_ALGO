package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class B_2606 {
	static int com;
	static int[][] map;
	static int count;

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// 컴퓨터 수
		com = Integer.parseInt(in.readLine());
		map = new int[com+1][com+1];
		
		int t = Integer.parseInt(in.readLine());
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(in.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			map[from][to] = 1;
			map[to][from] = 1;
		}
		
		bfs();
		System.out.println(count);
		

	}
	
	private static void bfs() {
		boolean[] visited = new boolean[com+1];
		visited[1] = true;
		Queue<Integer> queue = new ArrayDeque<>();
		queue.offer(1);
		count = 0;
		while(!queue.isEmpty()) {
			int cur = queue.poll();
			for(int i = 1; i <= com; i++) {
				if(!visited[i] && map[cur][i] != 0) {
					visited[i] = true;
					queue.offer(i);
					count++;
				}
			}
		}
	}

}
