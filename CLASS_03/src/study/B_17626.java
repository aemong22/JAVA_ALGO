package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_17626 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		int[] num = new int[50001];
		num[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			num[i] = 5;
		}
		
		for(int i = 2 ; i <= n ; i++) {
			for(int j = 1; j*j <= i; j++) {
				num[i] = Math.min(num[i],num[i-(j*j)] + 1);
				if(j*j == i) {
					num[i] = 1;
				}
			}
		}
		
		

		System.out.println(num[n]);
		
	}

}
