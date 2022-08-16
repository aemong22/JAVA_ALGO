package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_1003 {

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		int[][] map = new int[41][2];
		map[0][0] = 1;
		map[1][1] = 1;
		for(int i = 2; i < 41; i++) {
			map[i][0] = map[i-1][0] + map[i-2][0];
			map[i][1] = map[i-1][1] + map[i-2][1];
		}
		for(int i = 0 ; i < t ; i ++) {
			int x = Integer.parseInt(in.readLine());
			int zero = map[x][0];
			int one = map[x][1];
			sb.append(zero+" "+one+"\n");
		}
		System.out.println(sb);

		
	}
	

}
