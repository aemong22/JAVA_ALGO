import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class B_1043 {
	static int n;
	static int m;
	static int k;
	static int[][] visited;
	static boolean[] karr;
	
	static boolean[][] select;
	
	static boolean[] ans;
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(in.readLine());
		k = Integer.parseInt(st.nextToken());
		karr = new boolean[n+1];
		for(int i = 0; i < k; i++) {
			int t = Integer.parseInt(st.nextToken());
			karr[t] = true;
		}
		
		ans = new boolean[m];
		
		visited = new int[m][n+1];
		select = new boolean[m][n+1];
		
		for(int i = 0; i < m ; i++) {
			st = new StringTokenizer(in.readLine());
			int party = Integer.parseInt(st.nextToken());
			for(int j = 0; j < party ; j++) {
				int t = Integer.parseInt(st.nextToken());
				visited[i][t] = 1;
			}
		}
		
		bfs();
		
		int count = 0;
		for(boolean x : ans) {
			count = x ? count : count+1; 
		}
		System.out.println(count);
		

		
	}
	
	public static void bfs() {
		Queue<Integer> q = new ArrayDeque<>();
		for(int i = 1; i < n+1 ; i++) {
			if(karr[i]) q.offer(i);
		}
		
		while(!q.isEmpty()) {
			int c = q.poll();
			for(int i = 0; i < m; i++) {
				for(int j = 1; j <= n; j++) {
					if(visited[i][c] == 1 && visited[i][j] == 1 && !select[i][j]) {
						select[i][j] = true;
						ans[i] = true;
						q.offer(j);
					}
				}
			}
		}
	
	}
}
