package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1107 {
	static int channel;
	static int t;
	static boolean[] all;

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		channel = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(in.readLine());
		t = Integer.parseInt(st.nextToken());
		all = new boolean[1000000];
		int min = Math.abs(channel-100);
		if(t > 0) {
			 st = new StringTokenizer(in.readLine());
			 for(int i = 0; i < t; i++) {
				 check(st.nextToken());
			 }
		}
		
		for(int i = 0; i < 1000000 ; i++) {
			if(!all[i]) {
				int cal = Math.abs(i - channel);
				int put = i !=0 ? (int)(Math.log10(i)+1): 1;
				
				min = min > cal+put ? cal+put : min;
			}
		}
		
		System.out.print(min);
		
	}
	
	public static void check(String a) {
		for(int j = 0 ; j < 1000000 ; j++) {
			String temp = Integer.toString(j);
			if(temp.contains(a)) {
				all[j] = true;
			}
		}
	}


}
