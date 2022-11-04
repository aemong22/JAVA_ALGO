import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_1945 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st ;
		
		int t = Integer.parseInt(in.readLine().trim());
		for(int tc = 1; tc <= t; tc++) {
			long n = Integer.parseInt(in.readLine());
			int[] arr = {2,3,5,7,11};
			
			sb.append("#" + tc +" ");
			for(int i : arr) {
				int cnt = 0;
				while(true) {
					if(n%i == 0) {
						n = n / i;
						cnt++;
					}
					else {
						break;
					}
				}
				
				sb.append(cnt+" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);

	}
	
	

}
