import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_2072 {
	// 10개의 수 입력 받아 그 중 홀 수만 더한 값을 출력
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("2072.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(in.readLine());
		
		for(int tc = 1; tc <= t ; tc++) {
			int ans = 0;
			st = new StringTokenizer(in.readLine());
			for(int i = 0; i < 10; i++) {
				int num = Integer.parseInt(st.nextToken());
				if(num % 2 == 1) ans+=num;
			}
			
			sb.append("#"+tc+" "+ans+"\n");
		}
		System.out.println(sb);
		

	}

}
