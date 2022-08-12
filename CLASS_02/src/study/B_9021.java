package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_9021 {

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int t = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < t ; i++) {
			String[] arr = in.readLine().split("");
			int result = 0;
			for(String x : arr ) {
				if(x.equals("(")) {
					result++;
				}
				else {
					result--;
					if(result < 0) {
						sb.append("NO\n");
						break;
					}
				}
			}
			
			if(result == 0) {
				sb.append("YES\n");
			}
			if(result > 0) {
				sb.append("NO\n");
			}
		}
		
		System.out.println(sb);
	}

}
