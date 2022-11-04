import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_1946 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st ;
		
		int t = Integer.parseInt(in.readLine().trim());
		for(int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(in.readLine().trim());
			String ans = "";
			int cnt  = 1;
			sb.append("#"+tc+"\n");
			for(int i = 0; i < n;i++) {
				st = new StringTokenizer(in.readLine().trim());
				String s = st.nextToken();
				int c = Integer.parseInt(st.nextToken());
				for(int j = 0; j < c; j++) {
					sb.append(s);
					cnt++;
					if(cnt > 10) {
						cnt = 1;
						sb.append("\n");
					}
				}
			}
			if(cnt != 1) {
				sb.append("\n");
			}
			
		}
		
		System.out.println(sb);


	}

}
