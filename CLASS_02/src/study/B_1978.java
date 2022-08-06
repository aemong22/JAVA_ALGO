package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1978 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int t = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[1001];
		arr[0] = 1; arr[1] = 1;
		
		for(int i=2; i*i< 1001; i++ ) {
			if(arr[i] == 1) continue;
			for(int j = 2; j *i < 1001; j++) {
				arr[j*i] = 1;
			}
		}

		int count = 0;
		st = new StringTokenizer(in.readLine());
		for(int i = 0; i<t; i++) {
			int x = Integer.parseInt(st.nextToken());
			if(arr[x] == 0) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
