package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_11047 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] coin = new int[n];
		for(int i = 0 ; i< n; i++) {
			coin[i] = Integer.parseInt(in.readLine());
		}
		
		Arrays.sort(coin);
		int count = 0;
		for(int i = n-1; i >=0 ; i--) {
			count += k / coin[i];
			k = k % coin[i];
			if(k == 0) {
				break;
			}
		}
		
		System.out.println(count);
	}

}
