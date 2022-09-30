package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;


// 3차원 배열 사용
public class B_1600 {
	static int k;
	static int w;
	static int h;
	static int[][] map;
	static boolean[][][] visited; 
	
	// 말이 이동할 수 있는 8방향
	static int[] hdy = {-2,-1,1,2,2,1,-1,-2};
	static int[] hdx = {1,2,2,1,-1,-2,-2,-1};
	
	// 원숭이가 이동할 수 있는 4방향
	static int[] dy = {-1,0,1,0};
	static int[] dx = {0,1,0,-1};
	
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		k = Integer.parseInt(in.readLine()); // 말처럼 움직일 수 있는 횟수
		st = new StringTokenizer(in.readLine());
		w = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());

		map = new int[h][w];
		visited = new boolean[h][w][k+1];
		// 맵 입력
		for(int y = 0 ; y < h ; y++) {
			st = new StringTokenizer(in.readLine());
			for(int x = 0; x < w; x++) {
				map[y][x] =  Integer.parseInt(st.nextToken());
			}
		}
		
		bfs(0,0);
		
		if(min == Integer.MAX_VALUE) {
			System.out.println(-1);
		}
		else {
			System.out.println(min);
		}
	}
	
	private static void bfs(int y , int x) {
		Queue<Node> q = new ArrayDeque<>();
		q.offer(new Node(y,x,0,k));
		visited[y][x][k] = true;
		int ans = -1;
		while(!q.isEmpty()) {
			Node c = q.poll();
			if(c.y == h-1 && c.x == w-1) {
				ans = c.count;
				break;
			}
			
			// 원숭이 이동 , 인접한 4방향
			for(int i = 0; i < 4; i++) {
				int cx = c.x + dx[i];
				int cy = c.y + dy[i];
				if(cx >= 0 && cy >= 0 && cx < w && cy < h && !visited[cy][cx][c.k] && map[cy][cx] == 0) {
					visited[cy][cx][c.k] = true;
					q.offer(new Node(cy,cx,c.count+1,c.k));
				}
			}
			
			// 말 처럼 이동
			if(c.k > 0) {
				for(int i = 0; i < 8; i++) {
					int cx = c.x + hdx[i];
					int cy = c.y + hdy[i];
					if(cx >= 0 && cy >= 0 && cx < w && cy < h && !visited[cy][cx][c.k-1] && map[cy][cx] == 0) {
						visited[cy][cx][c.k-1] = true;
						q.offer(new Node(cy,cx,c.count+1,c.k-1));
					}
				}
			}
			
		}
		
		if (ans >= 0) {
			min = Math.min(ans, min);
		}
	}
	
	public static class Node {
		int y;
		int x;
		int count;
		int k;
		
		public Node(int y, int x, int count, int k) {
			this.x = x;
			this.y = y;
			this.count = count;
			this.k = k;
		}
	}
}
