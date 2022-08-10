package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2839 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int a1 = n / 5;
		int x = n % 5;
		int b1 = x / 3;
		int c1 = x % 3;
		
		int a2 = n / 3;
		int x2 = n % 3;
		int b2 = x2 / 5;
		int c2 = x2 % 5;
		
		if(c1 == 0 || c2 == 0) {
			if(c1 == 0 && c2 == 0) {
				int result = a1 + b1 > a2 + b2 ? a2+b2 : a1+b1;
				System.out.println(result);
			}
			else {
				int result = c1 == 0 ? a1+b1 : a2+ b2;
				System.out.println(result);
			}
		}
		else {
			System.out.println(-1);
		}
		

	}
}
