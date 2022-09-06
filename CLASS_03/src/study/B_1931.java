package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B_1931 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());

		int[][] time = new int[n][2];
		StringTokenizer st;

		for(int t = 0 ; t < n; t++) {
			st = new StringTokenizer(in.readLine());
			time[t][0] = Integer.parseInt(st.nextToken());
			time[t][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(time, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					return o1[0]-o2[0];
				}
				return o1[1]-o2[1];
			}

		});
		
		int end = time[0][1];
		int cnt = 1;
		for(int i = 1; i < n; i++) {
			if(end <= time[i][0]) {
				cnt++;
				end = time[i][1];
			}
		}
		

		
		System.out.println(cnt);

	
	}
	
	

}
