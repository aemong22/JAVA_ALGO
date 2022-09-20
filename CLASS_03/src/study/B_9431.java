package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 오버플로우
public class B_9431 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		long[] map = new long[101];
		map[1] = 1; map[2] = 1; map[3] = 1;
		
		for(int i = 4; i < 101; i++) {
			map[i] = map [i-2]+ map[i-3];
		}
		
		int t = Integer.parseInt(in.readLine());
		for(int tc = 0; tc < t; tc++) {
			int n = Integer.parseInt(in.readLine());
			sb.append(map[n]).append("\n");
		}
		System.out.println(sb);
	}

}
