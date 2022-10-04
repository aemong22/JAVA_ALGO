package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_14500 {
	static int n;
	static int m;
	static int[][] map;
	
	static int min = Integer.MAX_VALUE;
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(in.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		for(int y = 0; y < n; y++) {
			st = new StringTokenizer(in.readLine());
			for(int x = 0; x < m ; x++) {
				map[y][x] = Integer.parseInt(st.nextToken());
			}
		}
	}
	
	
	private static void dfs() {
		
		
	}
}
