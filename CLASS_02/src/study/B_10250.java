package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_10250 {

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int t = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[t][3];
		int[] result = new int[t];
		
		for(int i = 0 ; i < t ; i++) {
			st = new StringTokenizer(in.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < t ; i++) {
			int room = arr[i][2] % arr[i][0] == 0 ?  arr[i][2] / arr[i][0] : arr[i][2] / arr[i][0] + 1;
			int floor = arr[i][2] % arr[i][0] == 0 ?  arr[i][0] : arr[i][2] % arr[i][0];
			int length = (int)(Math.log10(arr[i][1])+1);
			int answer =floor*100 + room ;
			result[i] = answer;
		}
		
		for(int i : result) {
			System.out.println(i);
		}

	}

}
