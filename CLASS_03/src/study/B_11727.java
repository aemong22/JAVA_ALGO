package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class B_11727 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int[] ans = new int[1001];
		ans[1] = 1;
		ans[2] = 3;
		ans[3] = 5;
		for(int i = 4 ; i <= 1000 ; i++) {
			ans[i] = (ans[i-1] + (ans[i-2] * 2)) % 10007;
		}
		
		int num = Integer.parseInt(in.readLine());
		System.out.println(ans[num]);

	}

}
