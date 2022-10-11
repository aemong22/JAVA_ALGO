import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class B_17472 {
	static int r;
	static int c;
	static int[][] map;

	static int[] dy = {-1,0,1,0,0};
	static int[] dx = {0,1,0,-1,0};
	static int island_num;

	static int g;
	static int[][] graph;

	static int[] parent;
	// 최종적으로 연결된 최소 신장 트리 연결 비용.

	static int[][] bridge;
	static int ans;
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());

		map = new int[r][c];

		for(int rr = 0; rr < r; rr++) {
			st = new StringTokenizer(in.readLine());
			for(int cc = 0; cc < c; cc++) {
				map[rr][cc] = Integer.parseInt(st.nextToken());
			}
		}

		// 섬 번호 짓기
		island_num = 2;
		for(int rr = 0; rr < r; rr++) {
			for(int cc = 0; cc < c; cc++) {
				if(map[rr][cc] == 1) {
					num_bfs(rr,cc);
					island_num++;
				}
			}
		}
		

		g = 0;
		// 섬 다리 짓기
		bridge = new int[island_num-2][island_num-2];
		for(int rr = 0; rr < r; rr++) {
			for(int cc = 0; cc < c; cc++) {
				if(map[rr][cc] != 0) {
					bridge_bfs(rr,cc);
				}
			}
		}
		
		

		// 일단 출력해보자잇
		int idx = 0;
		graph = new int[g][3];
		for(int i = 0; i < island_num-2; i++) {
			for(int j = 0; j < island_num-2; j++) {
				if(bridge[i][j] != 0) {
					graph[idx][0] = i;
					graph[idx][1] = j;
					graph[idx][2] = bridge[i][j];
					idx++;
				}
			}
		}
		
		
		parent = new int[island_num-2];
		Arrays.sort(graph, (o1, o2) -> Integer.compare(o1[2], o2[2]));

		for (int i = 0; i < island_num-2; i++) {
			parent[i] = i;
		}
		

		ans = 0;
		// 낮은 비용부터 크루스칼 알고리즘 진행
		for (int i = 0; i < g; i++) {
			// 사이클이 존재하지 않는 경우에만 간선을 선택한다(여기서는 최종 비용만 고려하도록 하겠다).
			if (find(graph[i][0]) != find(graph[i][1])) {
				union(graph[i][0], graph[i][1]);
				ans += graph[i][2];
				continue;
			}
		}
		
		for (int i = 0; i < island_num-2; i++) {
			find(i);
		}
		for(int i = 1; i < island_num-2; i++) {
			if(parent[i] != parent[i-1]) {
				ans = -1;
				break;
			}
		}
		
		if(g == 0) {
			System.out.println(-1);
		}
		else {
			System.out.println(ans);
		}

	}





	private static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if (a > b) {
			parent[a] = b;
		} else {
			parent[b] = a;
		}
	}

	private static int find(int x) {
		if (parent[x] == x)
			return x;
		else
			return parent[x] = find(parent[x]);
	}
	public static void num_bfs(int rr, int cc) {
		Queue<island> q = new ArrayDeque<>();
		q.offer(new island(rr,cc));

		while(!q.isEmpty()) {
			island land = q.poll();

			for(int i = 0; i < 5; i++) {
				int cy = land.y + dy[i];
				int cx = land.x + dx[i];
				if(cy >=0 && cx >= 0 && cy < r && cx < c && map[cy][cx] == 1) {
					map[cy][cx] = island_num;
					q.offer(new island(cy,cx));
				}
			}
		}
	}

	public static void bridge_bfs(int rr, int cc) {
		Queue<island> q = new ArrayDeque<>();
		q.offer(new island(rr,cc));
		boolean[][] visited = new boolean[r][c];
		visited[rr][cc] = true;

		while(!q.isEmpty()) {
			island land = q.poll();

			for(int i = 0; i < 4; i++) {
				int cy = land.y + dy[i];
				int cx = land.x + dx[i];
				if(cy >=0 && cx >= 0 && cy < r && cx < c && map[cy][cx] == map[rr][cc] && !visited[cy][cx]) {
					q.offer(new island(cy,cx));
					visited[cy][cx] = true;
				}
				else if(cy >=0 && cx >= 0 && cy < r && cx < c && map[cy][cx] == 0) {
					int cnt = 1;
					int y = cy;
					int x = cx;
					while(true) {
						y = y + dy[i];
						x = x + dx[i];
						if(y < 0 || x < 0 || y >= r || x >= c) {
							break;
						}
						if(map[y][x] != 0) {
							if(cnt < 2) {
								break;
							}
							if(map[rr][cc] > map[y][x]) {
								break;
							}
							int temp = bridge[map[rr][cc]-2][map[y][x]-2];
							bridge[map[rr][cc]-2][map[y][x]-2] = temp == 0 ? cnt : Math.min(temp, cnt);
							g++;
							break;
						}
						cnt++;
					}
				}
			}

		}



	}

	public static class island{
		int y;
		int x;

		public island(int a, int b) {
			this.y = a;
			this.x = b;
		}
	}
}
