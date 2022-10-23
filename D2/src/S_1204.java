import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S_1204 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(in.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(in.readLine());
			int[] score = new int[101];
			st = new StringTokenizer(in.readLine());
			for(int i = 0; i < 1000; i++) {
				int num = Integer.parseInt(st.nextToken());
				score[num]++;
			}
			
			int max = Arrays.stream(score).max().getAsInt();
			int ans = 0;
			for(int i = 100; i >= 1; i--) {
				if(score[i] == max) {
					ans = i; 
					break;
				}
			}
			
			sb.append("#"+n+" "+ans+"\n");
		}
		System.out.println(sb);

	}

}
