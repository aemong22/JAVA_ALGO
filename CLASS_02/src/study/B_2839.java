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
		int x = n / 5;
		int y = n % 5;
		int count = x;
		while(true) {
			if(y == 0) {
				
				break;
			}
			else {
				if(x >= 1) {
					if(y % 3 == 0) {
						count = x +  y / 3;
						break;
					}
					x = x - 1;
					int a = (5 + y) / 3;
					count += a-1 ;
					y = (y+5)  %  3;
				}
				else {
					if(n % 3 != 0) {
						count = -1;
						break;
					}
					else {
						count = n / 3;
						break;
					}
				}
			}
		}
		
		System.out.println(count);

	}
}
