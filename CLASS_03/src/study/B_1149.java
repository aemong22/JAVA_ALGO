package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1149 {
	static int[][] price;
	static int[][] total;
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(in.readLine());
		
				
		// 1번 집의 색은 2번 집의 색과 달라야 한다.
		// n번 집의 색은 n-1번 집의 색과 같지 않아야 한다.
		// i( 2 <= i <= n-1 )번 집의 색은 i-1번 집의 색과 같지 않아야 한다.
		
		// 빨 , 초 , 파랑
		price = new int[n][3];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(in.readLine());
			price[i][0] = Integer.parseInt(st.nextToken());
			price[i][1] = Integer.parseInt(st.nextToken());
			price[i][2] = Integer.parseInt(st.nextToken());
		}
		
		// 비용의 최솟값
		total = new int[n][3];
		total[0][0] = price[0][0]; total[0][1] = price[0][1]; total[0][2] = price[0][2];
		for(int i = 1; i < n; i++) {
			total[i][0] = price[i][0] + Math.min(total[i-1][1], total[i-1][2]);
			total[i][1] = price[i][1] + Math.min(total[i-1][0], total[i-1][2]);
			total[i][2] = price[i][2] + Math.min(total[i-1][1], total[i-1][0]);
		}
		
		int min = Math.min(Math.min(total[n-1][0], total[n-1][1]),total[n-1][2]);
		System.out.println(min);
		
		
		
	}
}
