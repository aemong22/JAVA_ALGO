package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class B_1260 {
	static int n;
	static int m;
	static int v;
	static int[][] map;
	static boolean[] visited; // dfs에서 사용할 방문 여부 체크 배열

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		
		map = new int[n][n];
		
		for(int i = 0 ; i < m ; i++) {
			st = new StringTokenizer(in.readLine());
			int from =  Integer.parseInt(st.nextToken());
			int to =  Integer.parseInt(st.nextToken());
			map[from-1][to-1] = 1;
			map[to-1][from-1] = 1;
			
		}
		visited = new boolean[n];
		dfs(v-1);
		System.out.println();
		bfs(v-1);
		
		
	}
	
	private static void dfs(int current) {
		visited[current] = true;
		System.out.print((current+1 + " "));
		
		for(int i = 0; i< n; i++) {
			if(!visited[i] && map[current][i] != 0) {
				dfs(i);
			}
		}
	}
	
	private static void bfs(int start) {
		Queue<Integer> queue = new ArrayDeque<>();
		boolean visited[] = new boolean[n];
		
		visited[start] = true;
		queue.offer(start);
		
		while( !queue.isEmpty()) {
			int current = queue.poll();
			System.out.print(current+1+" ");
			for(int i = 0; i < n; i++) {
				if(!visited[i] && map[current][i] != 0 ) {
					visited[i] = true;
					queue.offer(i);
				}
			}
		}
	}

}
