package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_7568 {

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int t = Integer.parseInt(st.nextToken());
		
		int[][] person = new int[t][2];
		
		for(int i = 0; i < t ; i++) {
			st = new StringTokenizer(in.readLine());
			person[i][0] = Integer.parseInt(st.nextToken());
			person[i][1] = Integer.parseInt(st.nextToken());
		}
		
		int[] result = new int[t];
		for(int i = 0; i < t ; i++) {
			int count = 1;
			for(int j = 0; j < t ; j++) {
				if(person[i][0] < person[j][0] && person[i][1] < person[j][1] ) {
					count++;
				}
			}
			result[i] = count;
		}
		for(int i : result) {
			System.out.print(i+" ");
		}
		
	}

}
