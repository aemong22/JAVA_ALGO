package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B_11650 {

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int t = Integer.parseInt(st.nextToken());
		int[][] num = new int[t][2];
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(in.readLine());
			num[i][0] = Integer.parseInt(st.nextToken());
			num[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(num, new Comparator<int[]>() {

			@Override
			public int compare(int[] n1, int[] n2) {
				if(n1[0] == n2[0]) {
					return n1[1] - n2[1];
				}
				return n1[0] - n2[0];
			}
			
		});
		
		for(int[] x : num) {
			sb.append(x[0]+" "+x[1]);
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
