package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B_1463 {
	static int num;
	static int min = Integer.MAX_VALUE;
	static int count;

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		num = Integer.parseInt(st.nextToken());
		int[] result = new int[1000001];
		result[2] = 1;
		result[3] = 1;
		
		for(int i = 4; i < 1000001 ; i++) {
			int temp = 1 + result[i-1];
			if(i % 2 == 0) {
				int temp2 = result[i/2] + 1;
				if( temp2 < temp) {
					temp = temp2;
				}
			}
			if( i % 3 == 0) {
				int temp3 = result[i/3] + 1;
				if( temp3 < temp) {
					temp = temp3;
				}
			}
			
			result[i] = temp;
		}
		System.out.println(result[num]);
	}

}


