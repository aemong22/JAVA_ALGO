package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class BB_1389 {
	static int n;
	static int[][] map;
	static int min;
	static int answer;
	
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		map = new int[n][n];
		
		for(int i = 0 ; i < m ; i++) {
			st = new StringTokenizer(in.readLine());
			int user = Integer.parseInt(st.nextToken())-1;
			int user2 = Integer.parseInt(st.nextToken())-1;
			map[user][user2] = 1;
			map[user2][user] = 1;
		}
		
		answer = -1;
		min = Integer.MAX_VALUE;
		
		for(int idx = 0; idx < n ; idx ++) {
			bfs(idx);
		}
		
		System.out.println(answer+1);
		
	}
	
	public static void bfs(int start) {
		Queue<Integer> queue = new ArrayDeque<>();
		boolean visited[] = new boolean [n];
		
		visited[start] = true;
		queue.offer(start);
		
		int cnt = 1;
		int result = 0;
		while(!queue.isEmpty()) {
			int size = queue.size();
			result += cnt*size;
			while(size-- > 0) {
				int current = queue.poll();
				
				for(int i = 0; i < n ; i++) {
					if(!visited[i] && map[current][i] != 0) {
						visited[i] = true;
						queue.offer(i);
					}
				}
			}
			cnt++;
		}
		
		if(min > result) {
			min = result;
			answer = start;
		}
	}
}
