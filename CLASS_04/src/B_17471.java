import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class B_17471 {
	static int n;
	static int[] pop;
	static int[][] map;
	static int min = 99999;
	
	static boolean[] select; // 부분집합을 할 때 사용
	static int[] a; // 집합 a
	static int[] b; // 집합 b
	static boolean success; // success 했을 때 min 구하기
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(in.readLine());
		
		pop = new int[n];
		st = new StringTokenizer(in.readLine());
		for(int i = 0; i < n; i++) {
			pop[i] = Integer.parseInt(st.nextToken());
		}
		
		map = new int[n][n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(in.readLine());
			int t = Integer.parseInt(st.nextToken());
			for(int tc = 0; tc < t; tc++) {
				int end = Integer.parseInt(st.nextToken())-1;
				map[i][end] = 1;
				map[end][i] = 1;
			}
		}
		
		select = new boolean[n];
		subset(0,0);
		System.out.println(min > 90000 ? -1  : min);
	}
	
	public static void subset(int idx, int cnt) {
		if(idx == n) {
			if(cnt != n && cnt != 0) {
				a = new int[cnt];
				b = new int[n-cnt];
				int ai = 0;
				int bi = 0;
				int a_sum = 0;
				int b_sum = 0;
				for(int i = 0; i < n; i++) {
					if(select[i]) {
						a[ai++] = i;
						a_sum += pop[i];
					}
					else {
						b[bi++] = i;
						b_sum += pop[i];
					}
				}
				
				success = false;
				success = bfs(a) && bfs(b);
				int ans = Math.abs(a_sum - b_sum);
				if(success && ans < min) {
					min = ans;
				}
			}
			return;
		}
		
		select[idx] = true;
		subset(idx+1, cnt+1);
		
		select[idx] = false;
		subset(idx+1, cnt);
		
	}
	
	public static boolean bfs(int[] arr) {
		Queue<Integer> q = new ArrayDeque<>();
		boolean[] visited = new boolean[n];
		q.add(arr[0]);
		visited[arr[0]] = true;
		int cnt = 0;
		while(!q.isEmpty()) {
			int c = q.poll();
			cnt++;
			for(int i : arr) {
				if (!visited[i] && map[c][i] == 1) {
					visited[i] = true;
					q.offer(i);
				}
			}
		}
		
		if(cnt == arr.length) {
			return true;
		}
		return false;
		
		
		
		
	}
}
