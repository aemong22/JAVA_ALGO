import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_2068 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("2068.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int t = Integer.parseInt(in.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			st = new StringTokenizer(in.readLine());
			int max = 0;
			for(int i = 0 ; i < 10; i++) {
				int num = Integer.parseInt(st.nextToken());
				max = max > num ? max : num;
			}
			
			sb.append("#"+tc+" "+max+"\n");
		}
		System.out.println(sb);
		
		
	}
}
