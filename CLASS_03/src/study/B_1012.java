package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1012 {
	static int m ;
	static int n ;
	static int k ;
	
	static int check_x;
	static int check_y;
	
	static int[][] map;
	static boolean selected;
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int t = Integer.parseInt(st.nextToken());
		for(int i = 0 ; i < t ; i++ ) {
			st = new StringTokenizer(in.readLine());
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			
			map = new int[n][m]; 
			for(int j = 0; j < k; j++) {
				st = new StringTokenizer(in.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				map[y][x] = 1;
			}
			
			selected = false;
			int count = 0;
			for(int a = 0; a < n ; a++) {
				for(int b = 0; b < m ; b++) {
					check(a,b);
					if(selected) count++;
					selected = false;
				}
			}
			sb.append(count + "\n");
			
			
			
		}
		
		System.out.println(sb);
	}
	
	public static void check(int y, int x) {
		
		if(map[y][x] == 1) {
			selected = true;
			map[y][x] = 0;
			if( y+1 < n && map[y+1][x] == 1) check(y+1 , x);
			if( x+1 < m && map[y][x+1] == 1) check(y, x+1);
			if( y-1 >=0 && map[y-1][x] == 1) check(y-1,x);
			if( x-1 >=0 && map[y][x-1] == 1) check(y,x-1);
		}
		else
			return;
	}

}
