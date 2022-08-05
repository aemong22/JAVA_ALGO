package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1929 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		int[]arr = new int[end+1];
		arr[0] = 1; arr[1] = 1;
		for(int s = 2 ; s*s<= end;s++) {
			if(arr[s] == 0) {
				for(int i = 2; i*s <= end; i++) {
					arr[i*s] = 1;
				}
			}
		}
		for(int x = start; x<=end; x++) {
			if(arr[x] == 0) sb.append(x+"\n");
		}

		System.out.println(sb);


	}
}
