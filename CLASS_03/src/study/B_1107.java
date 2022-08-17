package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1107 {

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int channel = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(in.readLine());
		int t = Integer.parseInt(st.nextToken());
		
		boolean[] num = new boolean[5000001];
		st = new StringTokenizer(in.readLine());
		for(int i = 0; i < t ; i++) {
			String temp = st.nextToken();
			for(int j = 0; j < 5000001 ; j++) {
				if(Integer.toString(j).contains(temp)) num[j] = true;
			}
		}
		
		long min = channel== 100 ? 0 : 10000000;
		// 완전탐색??
		for(int i = 0; i < 5000001; i++) {
			if(!num[i]) {
				long temp= Math.abs(i-channel);
				long temp2 = i == 0 ? 1 : (int)(Math.log10(i)+1);
				if( temp+temp2 < min) {
					min = temp + temp2;
				}
			}
		}
		
		System.out.println(min);
		
	}

}
