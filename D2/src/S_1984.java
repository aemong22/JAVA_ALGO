import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S_1984 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(in.readLine().trim());
		
		for(int tc = 1; tc <= t; tc++) {
			int[] num = new int[10];
			st = new StringTokenizer(in.readLine());
			for(int i = 0; i < 10; i++) {
				num[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(num);
			int total = 0;
			for(int i = 1; i < 9; i++) {
				total+= num[i];
			}
			int ans = (int)Math.round(total / (double) 8);
			sb.append("#"+tc+" "+ans+"\n");
		}
		System.out.println(sb);
	}

}
