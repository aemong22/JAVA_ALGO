package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_6064 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		// 만약 x < m 이면 x' = x+1 아니면 x' = 1
		int t = Integer.parseInt(in.readLine());
		for(int tc = 0; tc < t; tc++) {
			st = new StringTokenizer(in.readLine());
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			int cnt = x;

			int max = 0;
			// 마지막 해 k번째 해
			int mm = m;
			while(true) {
				max+= m;
				if(mm % n == 0) {
					break;
				}
				else {
					mm+=m;
				}
			}
			int start = x;
			if(m == x && n == y) {
				System.out.println(max);
			}
			else {
				if(y == n) y = 0;
				while(cnt <= max) {
					if(start % n == y) {
						break;
					}
					else {
						start+=m;
						cnt+=m;
					}
				}

				if(cnt >= max) {
					System.out.println(-1);
				}
				else {
					System.out.println(cnt);
				}
			}

		}


	}

}
