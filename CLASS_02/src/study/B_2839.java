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
		int a = n / 5;
		int x = n % 5;
		int b = x / 3;
		
		if( x % 3 == 0) {
			System.out.println(a+b);
		}
		else {
			if(n % 3 == 0) {
				System.out.println(n /3);
			}
			else {
			System.out.println(-1);
			}
		}
		

	}
}
