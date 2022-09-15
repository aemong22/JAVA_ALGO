package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2630 {
	static int size;
	static int map[][] ;
	static int blue;
	static int white;
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		size = Integer.parseInt(in.readLine());
		map = new int[size][size];
		
		for(int i = 0; i < size; i++) {
			st = new StringTokenizer(in.readLine());
			for(int j = 0 ; j < size; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		blue = 0;
		white = 0;
		div(0,0,size);
		System.out.println(white);
		System.out.println(blue);
		
			
	}
	
	private static void div(int y, int x, int size) {
		int sum = 0;
		
		for(int dy = y; dy < y+size; dy++) {
			for(int dx = x; dx < x+size; dx++) {
				sum += map[dy][dx];
			}
		}
		
		if(sum == 0) { 
			white++;
		}
		else if(sum == size*size) {
			blue++;
		}
		else {
			// 1번
			int half = size / 2;
			div(y,x,half);
			// 2번
			div(y,x+half,half);
			// 3번
			div(y+half,x,half);
			// 4번
			div(y+half,x+half,half);
		}
	}

}
