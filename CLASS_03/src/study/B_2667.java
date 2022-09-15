package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class B_2667 {
	static int n;
	static int[][] map;
	static boolean[][] visited;
	static ArrayList<Integer> home;
	static int[] xx = {0,1,0,-1};
	static int[] yy = {-1,0,1,0};
	static int house;

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(in.readLine());
		
		map = new int[n][n];
		visited = new boolean[n][n];
		
		for(int y = 0; y < n; y++) {
			String[] str = in.readLine().split("");
			for(int x = 0; x < n; x++) {
				map[y][x] = Integer.parseInt(str[x]);
			}
		}
		
		house = 0;
		
		home = new ArrayList<>();
		for(int y = 0; y < n; y++) {
			for(int x = 0; x < n; x++) {
				if(map[y][x] == 1 && !visited[y][x]) {
					bfs(y,x);
				}
			}
		}
		Collections.sort(home);
		System.out.println(house);
		for(int idx = 0; idx < home.size(); idx++) {
			System.out.println(home.get(idx));
		}
		
	}
	
	private static void bfs(int y, int x) {
		Queue<Integer> dx = new ArrayDeque<>();
		Queue<Integer> dy = new ArrayDeque<>();
		visited[y][x] = true;
		dy.offer(y);
		dx.offer(x);
		int count = 1;
		house++;
		
		while(!dx.isEmpty()) {
			int curx = dx.poll();
			int cury = dy.poll();
			
			for(int i = 0; i < 4; i++) {
				int tx = curx + xx[i];
				int ty = cury + yy[i];
				if(tx >= 0 && tx < n && ty >= 0 && ty < n && !visited[ty][tx] && map[ty][tx] == 1) {
					visited[ty][tx] = true;
					dx.offer(tx);
					dy.offer(ty);
					count++;
					
				}
			}
		}
		
		home.add(count);
		
	}

}
