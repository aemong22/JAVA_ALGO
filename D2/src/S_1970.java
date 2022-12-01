import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_1970 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st ;

		int t = Integer.parseInt(in.readLine().trim());

		for(int tc = 1; tc <= t; tc++) {
			int money = Integer.parseInt(in.readLine().trim());
			int[] arr2 = {50000,10000,5000,1000,500,100,50,10};
			sb.append("#"+tc+"\n");
			for(int i = 0; i < 8; i++) {
				sb.append(money/arr2[i]+" ");
				money = money % arr2[i];
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
