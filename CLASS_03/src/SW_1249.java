import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class SW_1249 {
	static int n;
	static int[][] map;
	static int min;

	static int[][] ans;

	// 상 우 하 좌
	static int[] dx = {0,1,0,-1};
	static int[] dy = {-1,0,1,0};

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(in.readLine());
		for(int tc = 1; tc <= t ; tc++) {
			n = Integer.parseInt(in.readLine());
			map = new int[n][n];
			min = Integer.MAX_VALUE;
			ans = new int[n][n];

			for(int i = 0; i < n; i++) {
				String[] str = in.readLine().split("");
				for(int j = 0; j < n; j++) {
					map[i][j] = Integer.parseInt(str[j]);
				}
			}

			bfs(0,0);
			System.out.println("#"+tc+" "+min);

		}

	}

	private static void bfs(int yy,int xx) {
		Queue<Integer> qx = new ArrayDeque<>();
		Queue<Integer> qy = new ArrayDeque<>();

		boolean[][] visited = new boolean[n][n];
		visited[0][0] = true;
		ans[0][0] = map[0][0];
		qx.offer(xx);
		qy.offer(yy);

		while(!qx.isEmpty()) {
			int cy = qy.poll();
			int cx = qx.poll();

			for(int i = 0; i < 4; i++) {
				int y = cy + dy[i];
				int x = cx + dx[i];
				if(y >= 0 && x >= 0 && x < n && y < n && !visited[y][x]) {
					visited[y][x] = true;
					ans[y][x] = ans[cy][cx] + map[y][x];
					qx.offer(x);
					qy.offer(y);
				}
				else if(y >= 0 && x >= 0 && x < n && y < n && visited[y][x] && ans[y][x] > ans[cy][cx] + map[y][x]) {
					ans[y][x] =  ans[cy][cx] + map[y][x];
					qx.offer(x);
					qy.offer(y);
				}
			}
		}
		min = ans[n-1][n-1];


	}

}



//1. ans배열에서 값을 집어넣을 때 앞으로 집어넣을거와 현재 있는 값을 비교
//2. 방문체크를 하게 되면 한번 방문한 것은 다시 비교를 안함..

