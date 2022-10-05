import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class B_2636 {

	static int r;
	static int c;
	static int[][] map;
	static boolean[][] visited;

	static int[] dy = {-1,0,1,0};
	static int[] dx = {0,1,0,-1};

	static int hour;
	static int size;
	static int ans;
	static Queue<cheese> q;

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(in.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());

		map = new int[r][c];

		for(int i = 0; i < r; i++) {
			st = new StringTokenizer(in.readLine());
			for(int j = 0; j < c; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());				
			}
		}

		size = 0;

		// 치즈 개수 세기
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				if(map[i][j] == 1) size++; 		
			}
		}

		hour = 0;
		
		while(size > 0) {
			hour++;
			ans = size;
			bfs();
		}
		
		System.out.println(hour);
		System.out.println(ans);


	}

	public static void bfs() {
		q = new ArrayDeque<>();
		q.offer(new cheese(0,0));
		visited = new boolean[r][c];
		visited[0][0] = true;

		while(!q.isEmpty()) {
			cheese chs = q.poll();
			for(int i = 0; i < 4; i++) {
				int ty = chs.y + dy[i];
				int tx = chs.x + dx[i];

				if(ty >= 0 && tx >= 0 && ty < r && tx < c && !visited[ty][tx] ) {
					if(map[ty][tx] == 1) {
						size--;
						map[ty][tx] = 0;
					}
					else if(map[ty][tx] == 0) {
						q.offer(new cheese(ty,tx));
					}
					visited[ty][tx] = true;
				}
			}

		}




	}


	public static class cheese {
		int y;
		int x;

		public cheese(int a, int b) {
			this.y = a;
			this.x = b;
		}
	}

}
