import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class B_9205 {
	static int n;
	static int[] house = new int[2];
	static int[] party = new int[2];
	static int[][] store;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int  t = Integer.parseInt(in.readLine());
		for(int tc = 0 ; tc < t; tc++ ) {
			n = Integer.parseInt(in.readLine());
			st = new StringTokenizer(in.readLine());
			house[0] = Integer.parseInt(st.nextToken());
			house[1] = Integer.parseInt(st.nextToken());

			store = new int[n][2];
			visited = new boolean[n];
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(in.readLine());
				int y = Integer.parseInt(st.nextToken());
				int x = Integer.parseInt(st.nextToken());
				store[i][0] = y;
				store[i][1] = x;
			}

			st = new StringTokenizer(in.readLine());
			int y = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			party[0] = y;
			party[1] = x;
			bfs();
		}
		System.out.println(sb);
	}

	public static void bfs() {
		Queue<User> q = new ArrayDeque<>();
		q.offer(new User(house[0],house[1]));
		boolean success = false;
		while(!q.isEmpty()) {
			User u = q.poll();
			int distance = Math.abs(u.y - party[0]) + Math.abs(u.x-party[1]);
			if(distance <= 1000) {
				success = true;
				q.clear();
				break;
			}
			else {
				// 편의점 들리기.
				for(int i = 0; i < n; i++) {
					// 편의점까지 거리
					int dis_store = Math.abs(u.y - store[i][0]) + Math.abs(u.x - store[i][1]);
					if(dis_store <= 1000 && !visited[i]) {
						visited[i] = true;
						q.offer(new User(store[i][0],store[i][1]));
						
					}
				}	
			}
		}
		
		if(success) {
			sb.append("happy").append("\n");
		}
		else {
			sb.append("sad").append("\n");
		}


	}
	
	private static class User{
		int y;
		int x;
		
		public User(int a, int b) {
			this.y = a;
			this.x = b;
		}
		
	}


}

