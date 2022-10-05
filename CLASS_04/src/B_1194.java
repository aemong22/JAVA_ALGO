import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class B_1194 {
	static int n;
	static int m;
	static String[][] map;
	static boolean[][][] visited;

	static int[] dy = {-1,0,1,0};
	static int[] dx = {0,1,0,-1};

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		map = new String[n][m];
		visited = new boolean[64][n][m];

		for(int i = 0; i < n; i++) {
			String[] str = in.readLine().split("");
			map[i] = str.clone();
		}

		bfs();
	}



	public static void bfs() {
		Queue<user> q = new ArrayDeque<>();

		loop:
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					if(map[i][j].equals("0")){
						q.offer(new user(i,j,0));
						visited[0][i][j] = true;
						break loop;
					}
				}
			}
	

		boolean exit = false;
		int count = 0;

		while(!q.isEmpty()) {
			int size = q.size();
			
			while(size-- > 0 && !exit) {
				user u = q.poll();

				for(int i = 0; i < 4; i++) {
					int cy = u.yy + dy[i];
					int cx = u.xx + dx[i];

					if(cy >= 0 && cx >= 0 && cy < n && cx < m && !map[cy][cx].equals("#") && !visited[u.key][cy][cx] ) {
						
						// 일반 길일 때
						if(map[cy][cx].equals(".") || map[cy][cx].equals("0")){
							ArrayList<Integer> temp = new ArrayList<>();
							q.offer(new user(cy,cx,u.key));
						}
						// 열쇠 일때
						else if(map[cy][cx].charAt(0) >= 97 ) {
							int newKey = 1 << (map[cy][cx].charAt(0) - 'a');
							newKey = newKey | u.key;
							q.offer(new user(cy,cx, newKey));

						}

						// 문 일때
						else if(map[cy][cx].charAt(0) >= 65) {
							int door = 1 << (map[cy][cx].charAt(0) - 'A');
							if((u.key & door) > 0) {
								q.offer(new user(cy,cx,u.key));
							}
							
						}

						// 도착했을 때
						else if(map[cy][cx].equals("1")) {
							exit = true;
							q.clear();
							break;
							
						}

						visited[u.key][cy][cx] = true;


					}
				}
			}
			count++;
		}

		if(exit) {
			System.out.println(count);
		}
		else {
			System.out.println(-1);
		}


	}

	private static class user {
		int yy;
		int xx;
		int key;

		public user(int a, int b,int c) {
			this.yy = a;
			this.xx = b;
			this.key = c;
		}


	}

}
