package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_17070 {
	static int n;
	static int[][] map;
	static int[][] result;
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(in.readLine());
		
		map = new int[n][n];
		result = new int[n][n];
		
		// 맵 입력
		for(int y = 0; y < n; y++) {
			st = new StringTokenizer(in.readLine());
			for(int x = 0; x < n; x++) {
				map[y][x] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 연산
		dfs(0,1,0);
		System.out.println(result[n-1][n-1]);
		
	}
	
	// dir == 0 : 가로 , dir == 1 : 대각선 , dir == 2 : 세로
	private static void dfs (int cy, int cx, int dir) {
		// 파이프 가로
		if(dir == 0) {
			// 대각선
			if(cy+1 < n && cx+1 < n && map[cy+1][cx+1] == 0 && map[cy+1][cx] == 0 && map[cy][cx+1] == 0) {
				result[cy+1][cx+1]++;
				dfs(cy+1,cx+1,1);
			}
			// 가로
			if(cx+1 < n && map[cy][cx+1] == 0) {
				result[cy][cx+1]++;
				dfs(cy,cx+1,0);
			}
		}
		
		// 파이프 대각선
		if(dir == 1) {
			// 대각선
			if(cy+1 < n && cx+1 < n && map[cy+1][cx+1] == 0 && map[cy+1][cx] == 0 && map[cy][cx+1] == 0) {
				result[cy+1][cx+1]++;
				dfs(cy+1,cx+1,1);
			}
			// 세로
			if(cy+1 < n && map[cy+1][cx] == 0) {
				result[cy+1][cx]++;
				dfs(cy+1,cx,2);
			}
			// 가로
			if(cx+1 < n && map[cy][cx+1] == 0) {
				result[cy][cx+1]++;
				dfs(cy,cx+1,0);
			}
		}
		
		// 파이프 세로
		if(dir == 2) {
			// 대각선
			if(cy+1 < n && cx+1 < n && map[cy+1][cx+1] == 0 && map[cy+1][cx] == 0 && map[cy][cx+1] == 0) {
				result[cy+1][cx+1]++;
				dfs(cy+1,cx+1,1);
			}
			
			// 세로
			if(cy+1 < n && map[cy+1][cx] == 0) {
				result[cy+1][cx]++;
				dfs(cy+1,cx,2);
			}
		}
	}
}
