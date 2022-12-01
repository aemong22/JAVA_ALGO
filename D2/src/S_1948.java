import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_1948 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st ;

		int t = Integer.parseInt(in.readLine().trim());
		int[] month= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		for(int tc = 1; tc <= t; tc++) {
			st = new StringTokenizer(in.readLine());
			int m = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());
			
			int mm = Integer.parseInt(st.nextToken());
			int dd = Integer.parseInt(st.nextToken());
			
			int ans = 0;
			if(m == mm) ans = dd-d+1;
			else {
				for(int i = m; i < mm; i++) {
					ans+=month[i];
				}
				ans += dd +1  - d;
			}
			
			sb.append("#"+tc+" "+ans+"\n");
		}
		
		System.out.println(sb);

	}

}
