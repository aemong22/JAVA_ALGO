package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class B_16928 {
	static int[] map;
	static int cnt;
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		map = new int[101];
		st = new StringTokenizer(in.readLine());
		int t = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(in.readLine());
			map[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
		}
		
		cnt = 0;
		bfs();
		System.out.println(cnt);

	}
	
	private static void bfs() {
		Queue<Integer> q = new ArrayDeque<>();
		boolean[] visited = new boolean[101];
		q.offer(1);
		visited[1] = true;
		boolean arrive = false;
		while(!q.isEmpty()) {
			int s = q.size();
			while(s-- > 0) {
				int c = q.poll();
				if(c == 100) {
					arrive = true;
					break;
				}
				for(int i = 1; i <= 6; i++) {
					if((c+i) <= 100 && !visited[c+i] && map[c+i] == 0) {
						visited[c+i] = true;
						q.offer(c+i);
					}
					else if((c+i) <= 100 && !visited[c+i]) {
						visited[c+i] = true;
						visited[map[c+i]] = true;
						q.offer(map[c+i]);
					}
					
				}
			}
			if(arrive) {
				break;
			}
			cnt++;
			
		}
		
		
	}

}
