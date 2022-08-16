package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_11050 {

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int num = 1;
		int num2 = 1;
		for(int i = n; i > n-k; i--) {
			num *=i;
		}
		
		for(int i = 1; i <= k ; i++) {
			num2 *= i;
		}
		System.out.println(num / num2);
		
	}
	
	

}
