package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class B_14502 {
	static int n;
	static int m;
	static int[][] map;
	
	static int[] dy = {-1,0,1,0};
	static int[] dx = {0,1,0,-1};
	static int max = 0;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(in.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		
		for(int i = 0; i < n ; i++) {
			st = new StringTokenizer(in.readLine());
			for(int j = 0 ; j < m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		makewall(0);
		System.out.println(max);
		
	}
	
	public static void makewall(int make) {
		if(make == 3) {
			bfs();
			return;
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(map[i][j] == 0) {
					map[i][j] = 1;
					makewall(make+1);
					map[i][j] = 0;
				}
			}
		}
	}
	
	public static void bfs() {
		Queue<ans> q = new ArrayDeque<>();
		int[][] map2 = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			map2[i] = map[i].clone();
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(map2[i][j] == 2) q.offer(new ans(i,j));
			}
		}
		
		while(!q.isEmpty()) {
			ans a = q.poll();
			
			for(int i = 0; i < 4; i++) {
				int yy = a.y + dy[i];
				int xx = a.x + dx[i];
				
				if(yy >= 0 && xx >= 0 && yy < n && xx < m && map2[yy][xx] == 0) {
					map2[yy][xx] = 2;
					q.offer(new ans(yy,xx));
				}
			}
		}
		
		// 안전 영역
		int temp = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(map2[i][j] == 0) temp++;
			}
		}
		
		max = temp > max ? temp : max; 
		
		
		
		
		
	}
	
	public static class ans {
		int y; // y
		int x; // x
		
		public ans(int b, int c) {
			this.y = b;
			this.x = c;
		}
		
	}

}
