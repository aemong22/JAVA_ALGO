import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_1986 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] sum = new int[11];
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) sum[i] = sum[i-1]-i;
			else sum[i] = sum[i-1] + i;
		}
		
		int t = Integer.parseInt(in.readLine());
		for(int tc = 1; tc <=t ; tc++) {
			int n = Integer.parseInt(in.readLine());
			sb.append("#" + tc+ " "+sum[n]+"\n");
		}
		System.out.println(sb);

	}

}
