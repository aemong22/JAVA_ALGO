package a_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_17136 {
	
	static int[][] map = new int[10][10];
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for(int i = 0 ; i < 10 ; i++) {
			st = new StringTokenizer(in.readLine());
			for(int j = 0; j < 10 ; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		

	}

}
