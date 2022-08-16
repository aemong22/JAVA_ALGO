package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_15829 {

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int t = Integer.parseInt(st.nextToken());
		String[] abc = in.readLine().toUpperCase().split("");
		long result = 0;
		
		for(int i = 0; i < t ; i++) {
			long num = abc[i].charAt(0)-64;
			long x = 1;
			for(int j = 0; j < i ; j++) {
				x = (x * 31) % 1234567891;
			}
			result += x*num;
		}
		
		System.out.println(result % 1234567891);
		
	}

}
