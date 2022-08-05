package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_1920 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		// n 입력받기
		int N = Integer.parseInt(st.nextToken());
		
		//n_arr 입력받기
		st = new StringTokenizer(in.readLine());
		int[] N_arr = new int[N];
		for (int i=0; i < N ; i++) {
			N_arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(N_arr);
		
		// m 입력받기
		st = new StringTokenizer(in.readLine());
		int M = Integer.parseInt(st.nextToken());
		
		
		st = new StringTokenizer(in.readLine());
		int[] M_arr = new int[M];
		for (int i=0; i < M ; i++) {
			M_arr[i] = Integer.parseInt(st.nextToken());
		}

		for(int i : M_arr) {
			int max = N-1;
			int min = 0;
			int mid = 0;
			boolean find = false;
			while( min <= max) {
				
				mid = (max+min) / 2;
				
				if(i < N_arr[mid]) {
					max = mid-1;
				}
				else if ( i == N_arr[mid] ) {
					sb.append("1\n");
					find = true;
					break;
				}
				else {
					min = mid+1;
				}
			}
			if(!find) {
				sb.append("0\n");
			}
		}
		
		System.out.println(sb);
	}
}
