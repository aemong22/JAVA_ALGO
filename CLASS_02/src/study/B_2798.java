package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2798 {
	private static int n;
	private static int m;
	private static int[] card;
	private static int r = 3;
	private static int[] result;
	private static int answer;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		//n과 m 입력
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		// 카드 배열 생성
		st = new StringTokenizer(in.readLine());
		card = new int[n];
		result = new int[3];
		answer = -1;
		for(int i = 0 ; i < n; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		comb(0,0);
		
		sb.append(answer);
		System.out.println(sb);
		
	}

	private static void comb(int cnt, int start) {
		if(cnt == r) {
			int sum = 0;
			for(int j = 0; j < r ; j++) {
				sum +=result[j];
			}
			
			if(sum > answer && sum <= m) {
				answer = sum;
			}
			
			
		}
		else {
			for(int i = start; i < n; i++) {
				result[cnt] = card[i];
				comb(cnt+1, i+1);
			}
		}
	}

}
