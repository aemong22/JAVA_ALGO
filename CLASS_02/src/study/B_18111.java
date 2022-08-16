package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_18111 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(st.nextToken()); // 세로
		int m = Integer.parseInt(st.nextToken()); // 가로
		int b = Integer.parseInt(st.nextToken()); // 인벤토리 블록수

		int[][] map = new int[n][m];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		// map 입력
		for(int y = 0; y < n ; y++) {
			st = new StringTokenizer(in.readLine());
			for(int x = 0; x < m ; x++) {
				map[y][x] = Integer.parseInt(st.nextToken());
				if (min > map[y][x]) {
					min = map[y][x];
				}
				
				if(max < map[y][x]) {
					max = map[y][x];
				}
			}
		}

		int min_time = Integer.MAX_VALUE;
		int min_height = 0;
		for(int i = max; i >= min ; i--) {
			int time = 0;
			int temp_B = b;
			for(int y = 0 ; y < n ; y++) {
				for(int x = 0; x < m ; x++) {
					if ( map[y][x] > i ) {
						int temp = map[y][x]-i; // 깍아야 하는 땅 높이
						time += 2*temp;
						temp_B += temp;
					}
					else {
						int temp = i - map[y][x];
						time += 1*temp;
						temp_B -= temp;
					}
				}
			}
			
			if(temp_B >= 0 ) {
				if(min_time > time) {
					min_time = time;
					min_height = i;
				}
			}

		}
		
		System.out.println(min_time+ " "+min_height);
	}

}
