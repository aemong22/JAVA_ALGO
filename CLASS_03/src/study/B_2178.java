package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class B_2178 {
	static int n;
	static int m;
	static int[][] map;
	static int min;
	static int[] dx = {0,1,0,-1};
	static int[] dy = {-1,0,1,0};
	static boolean[][] visited;

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] nm = in.readLine().split(" ");
		n = Integer.parseInt(nm[0]);
		m = Integer.parseInt(nm[1]);

		// map 리스트 생성 및 입력
		map = new int[n][m];
		visited = new boolean[n][m];
		for(int i = 0; i < n ; i++) {
			String[] num = in.readLine().split("");
			for(int j = 0; j<m; j++) {
				map[i][j] = Integer.parseInt(num[j]);
			}
		}

		min = 0;
		visited[0][0] = true;
		//dfs(0,0,0);
		bfs();
		System.out.println(min+1);

	}

	//	private static void dfs(int y, int x, int cnt) {
	//		
	//		if(y == n-1 && x == m-1) {
	//			if(min > cnt) {
	//				min = cnt;
	//				return;
	//			}
	//		}
	//		
	//		for(int i = 0 ; i < 4; i++) {
	//			int xx = x + dx[i];
	//			int yy = y + dy[i];
	//			if(xx >= 0 && yy >= 0 && xx < m && yy < n && map[yy][xx] == 1 && !visited[yy][xx]) {
	//				visited[yy][xx] = true;
	//				dfs(yy,xx,cnt+1);
	//				visited[yy][xx] = false;
	//			}
	//		}
	//
	//	}

	private static void bfs() {
		Queue<Integer> queueX = new ArrayDeque<>();
		Queue<Integer> queueY = new ArrayDeque<>();

		queueX.offer(0);
		queueY.offer(0);
		boolean arrive = false;
		while(!queueX.isEmpty()) {
			int size = queueX.size();
			min++;
			while(size-->0) {
				int x = queueX.poll();
				int y = queueY.poll();
				if(x == m-1 && y == n-1) {
					arrive = true;
					break;
				}

				for(int i = 0 ; i < 4; i++) {
					int xx = x + dx[i];
					int yy = y + dy[i];
					if(xx >= 0 && yy >= 0 && xx < m && yy < n && map[yy][xx] == 1 && !visited[yy][xx]) {
						visited[yy][xx] = true;
						queueX.offer(xx);
						queueY.offer(yy);
					}
				}
			}
			
			if(arrive) {
				min--;
				break;
			}

		}
	}

}
