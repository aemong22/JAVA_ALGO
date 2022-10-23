import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S_1859 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(in.readLine());
		
		for(int tc = 1; tc<=t; tc++) {
			int n = Integer.parseInt(in.readLine());
			int[] cost = new int[n];
			st = new StringTokenizer(in.readLine());
			for(int i = 0; i < n; i++) {
				cost[i] = Integer.parseInt(st.nextToken());
			}
			long income = 0;
			// 최대값
			int max = Arrays.stream(cost).max().getAsInt();
			for(int i = 0; i < n; i++) {
				if(max!=cost[i]) {
					income += (max-cost[i]);
				}
				else if(max == cost[i]) {
					cost[i] = 0;
					max = Arrays.stream(cost).max().getAsInt();
				}
				
				cost[i] = 0;
			}
			
			sb.append("#"+tc+" "+income+"\n");
			
		}
		
		System.out.println(sb);

	}

}
