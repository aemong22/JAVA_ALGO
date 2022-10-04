package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_11724 {
	static int n;
	static int m;
	static int map[][];
	static boolean visited[];
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[n+1][n+1];
		visited = new boolean[n+1];
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(in.readLine());
			int y = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			map[y][x] = 1;
			map[x][y] = 1;

		}
		
		int cnt = 0;
		for(int j = 1; j <= n; j++) {
			if(!visited[j]) {
				dfs(j);
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
	
	
	private static void dfs(int current) {
		visited[current] = true;
		
		for(int i = 1; i <= n; i++) {
			if(!visited[i] && map[current][i] != 0) {
				dfs(i);
			}
		}
	}

}
