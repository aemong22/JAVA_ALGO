import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class S_1966 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st ;

		int t = Integer.parseInt(in.readLine().trim());
		for(int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(in.readLine());
			String[] arr = in.readLine().split(" ");
			
			Arrays.sort(arr, new Comparator<String>() {
				@Override
				public int compare(String i1, String i2) {
					return Integer.parseInt(i1) - Integer.parseInt(i2);
				}
			});
			sb.append("#"+tc+" ");
			for(String a:arr) {
				sb.append(a+" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);

	}

}
