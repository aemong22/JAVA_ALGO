import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class B_16234 {
	static int n;
	static int l;
	static int r;
	static int[][] map;
	static boolean[][] visited;

	static int[] dy = {-1,0,1,0};
	static int[] dx = {0,1,0,-1};
	static boolean stop;

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		n = Integer.parseInt(st.nextToken()); // 땅 크기
		l = Integer.parseInt(st.nextToken()); //  L
		r = Integer.parseInt(st.nextToken()); // R

		map = new int[n][n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(in.readLine());
			for(int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		stop = false;
		int ans = 0;
		while(!stop) {
			visited = new boolean[n][n];
			stop = true;
			for(int y = 0; y < n; y++) {
				for(int x = 0; x < n; x++) {
					if(!visited[y][x]) {
						bfs(y,x);
					}
				}
			}
			ans++;
		}
		
		System.out.println(ans-1);

	}

	public static void bfs(int a, int b) {
		Queue<country> q = new ArrayDeque<>();
		Queue<country> q2 = new ArrayDeque<>();
		q.offer(new country(a,b));
		q2.offer(new country(a,b));
		visited[a][b] = true;
		int total_pop = map[a][b];
		int count = 1;

		while(!q.isEmpty()) {
			country c = q.poll();
			for(int i = 0; i < 4; i++) {
				int cy = c.y + dy[i];
				int cx = c.x + dx[i];
				if(cy >= 0 && cx >= 0 && cy < n && cx < n && !visited[cy][cx]) {
					int diff = Math.abs(map[cy][cx] - map[c.y][c.x]);
					if(diff <= r && diff >= l) {
						visited[cy][cx] = true;
						total_pop += map[cy][cx];
						count++;
						q.offer(new country(cy,cx));
						q2.offer(new country(cy,cx));
					}
				}
			}
		}
		if(count > 1) {
			stop = false;
		}
		int change = total_pop / count;


		while(!q2.isEmpty()) {
			country c = q2.poll();
			map[c.y][c.x] = change;
		}
		q2.clear();

	}

	public static class country {
		int y;
		int x;

		public country(int a, int b) {
			this.y = a;
			this.x = b;
		}
	}

}
