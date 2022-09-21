package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_11399 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		int [] t = new int[n];
		int answer = 0;
		StringTokenizer st = new StringTokenizer(in.readLine());
		for(int i = 0; i < n; i++) {
			t[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(t);
		for(int i = 0; i < n; i++) {
			answer += t[i]*(n-i);
		}
		System.out.println(answer);
	}

}
