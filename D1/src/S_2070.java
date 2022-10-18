import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_2070 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("2070.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int t = Integer.parseInt(in.readLine());
		for(int tc = 1; tc<= t; tc++) {
			st = new StringTokenizer(in.readLine());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			sb.append("#"+tc+" ");
			if(n1-n2 > 0) {
				sb.append(">"+"\n");
			}
			else if(n1 - n2 == 0) {
				sb.append("="+"\n");
			}
			else {
				sb.append("<"+"\n");
			}
		}
		System.out.println(sb);
	}
}
