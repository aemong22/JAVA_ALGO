package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_5525 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(in.readLine());
		int m = Integer.parseInt(in.readLine());
		String s = in.readLine().trim();
		
		String p = "IOI" ;
		
		// 몇군데 포함되어있는지 출력
		
		int ans = 0;
		int cnt = 0;
		for(int i = 2; i <m; i++) {
			String temp = s.substring(i-2,i+1);
			if(temp.equals("IOI")) {
				cnt++;
				i++;
			}
			else {
				cnt = 0;
			}

			if(cnt >= n) {
				ans++;
			}
		}

		System.out.println(ans);

	}

}
