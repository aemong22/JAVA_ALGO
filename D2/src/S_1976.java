import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_1976 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st ;
		
		int t = Integer.parseInt(in.readLine().trim());
		
		for(int tc = 1; tc <= t; tc++) {
			st = new StringTokenizer(in.readLine().trim());
			int h = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int ch = Integer.parseInt(st.nextToken());
			int cm = Integer.parseInt(st.nextToken());
			
			//분 계산
			if(m + cm >= 60) {
				h++;
				m = m+cm - 60;
			}
			else {
				m = m+cm;
			}
			
			// 시 계산
			if(h+ch > 12) {
				h = (h+ch) % 12;
			}
			else {
				h +=ch;
			}
			
			sb.append("#"+tc+" "+h+" "+m+"\n");
			
		}
		System.out.println(sb);
		
	}
}
