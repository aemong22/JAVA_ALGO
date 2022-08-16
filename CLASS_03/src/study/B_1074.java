package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B_1074 {
	static int n;
	static int r;
	static int c;
	static int size;
	static int result;

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		n = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());

		size = (int) Math.pow(2, n);
		result = 0;
		check(0,0,size);
		System.out.println(result);

	}

	public static void check(int y , int x, int size) {
		if(size == 1) {
			return;
		}
		// 1사분면
		if( r < y+(size/2) && c <x+(size/2)) check(y , x , size/2);
		
		// 2사분면
		if( r < y+(size/2) && c >= x + (size/2)) {
			result += 1 * (int) Math.pow(size/2, 2);
			check(y,x+(size/2), size/2);
		}
		
		// 3사분면
		if( r >= y+(size/2) && c < x + (size/2)) {
			result += 2 * (int) Math.pow(size/2, 2);
			check(y+(size/2),x,size/2);
		}
		
		// 4사분면
		if( r >= y+(size/2) && c >= x + (size/2)) {
			result += 3 * (int) Math.pow(size/2, 2);
			check(y+(size/2),x+(size/2),size/2);
		}
		
		
	}
}


