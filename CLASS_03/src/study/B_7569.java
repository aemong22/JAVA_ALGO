package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

// 3차원 배열 사용
public class B_7569 {
	
	static int m; // 가로
	static int n; // 세로
	static int h; // 상자 개수
	static int[][][] map;
	
	// 상 우 하 좌
	static int[] dx = {0,1,0,-1};
	static int[] dy = {-1,0,1,0};
	
	static int ans;
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(in.readLine());
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		
		map = new int[h][n][m];
		
		// 토마토 입력 받기
		for(int z = 0 ; z < h ; z++ ) {
			for(int y = 0; y < n; y++) {
				st = new StringTokenizer(in.readLine());
				for(int x = 0; x < m; x++) {
					map[z][y][x] = Integer.parseInt(st.nextToken());
				}
			}
		}
		
		// 계산
		ans = 0;
		bfs();
		boolean success = true;
		for(int z = 0 ; z < h ; z++ ) {
			for(int y = 0; y < n; y++) {
				for(int x = 0; x < m; x++) {
					if(map[z][y][x] == 0) {success = false; break;}
				}
			}
		}
		
		if(success) {
			System.out.println(ans-1);
		}
		else {
			System.out.println(-1);
		}
		
		

	}
	
	private static void bfs() {
		Queue<tomato> q = new ArrayDeque<>();
		
		// 토마토 익은 곳 q에 넣기
		for(int z = 0 ; z < h ; z++ ) {
			for(int y = 0; y < n; y++) {
				for(int x = 0; x < m; x++) {
					if(map[z][y][x] == 1) {
						q.offer(new tomato(z,y,x));
					}
				}
			}
		}
		while(!q.isEmpty()) {
			int cnt = q.size();
			ans++;
			while(cnt-- > 0) {
				tomato c = q.poll();
				// 주변으로 퍼지기
				for(int i = 0 ; i < 4; i++) {
					int cx = c.x + dx[i];
					int cy = c.y + dy[i];
					if(cx >= 0 && cy >= 0 && cx < m && cy < n && map[c.z][cy][cx] == 0) {
						map[c.z][cy][cx] = 1;
						q.offer(new tomato(c.z,cy,cx));
					}
				}
				
				// 다른 상자로 퍼지기
				// 위
				if(c.z + 1 < h && map[c.z+1][c.y][c.x] == 0) {
					map[c.z+1][c.y][c.x] = 1;
					q.offer(new tomato(c.z+1,c.y,c.x));
				}
				// 아래
				if(c.z - 1 >= 0 && map[c.z-1][c.y][c.x] == 0) {
					map[c.z-1][c.y][c.x] = 1;
					q.offer(new tomato(c.z-1,c.y,c.x));
				}
				
			}
		}
		
		
		
	}
	
	public static class tomato {
		int z; // 상자 번호
		int y; // y
		int x; // x
		
		public tomato(int a , int b, int c) {
			this.z = a;
			this.y = b;
			this.x = c;
		}
		
	}

}
