import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S_1983 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st ;
		
		int t = Integer.parseInt(in.readLine());
		String[] result = {"A+", "A0","A-","B+","B0","B-","C+","C0","C-","D0"};
		for(int i = 1; i <= t ; i++) {
			st = new StringTokenizer(in.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			// 학생들 성적 list
			double[][] arr = new double[n][2];
			for(int j = 0; j < n; j++) {
				arr[j][0] = j;
				st = new StringTokenizer(in.readLine());
				double score = 0;
				score = Integer.parseInt(st.nextToken())*0.35 +  Integer.parseInt(st.nextToken()) *0.45 + Integer.parseInt(st.nextToken())*0.2;
				arr[j][1] = score;
			}
			
			Arrays.sort(arr, (o1, o2)  -> {
				 return Double.compare(o2[1], o1[1]);
			});
			int y = 0;
			int x = 1;
			for(int idx = 0; idx < n; idx++) {
				if((int)arr[idx][0] == k-1) {
					sb.append("#"+i+" ");
					sb.append(result[y]+"\n");
					break;
				}
				x++;
				if(x > n/10) {
					x = 1;
					y++;
				}
			}

		}
		System.out.println(sb);
		

	}

}
