package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class B_10989 {

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		
		int[] num = new int[t];
		for(int i = 0; i < t; i++) {
			num[i] = Integer.parseInt(in.readLine());
			
		}
		
		Arrays.sort(num);
		
		for(int x : num) {
			sb.append(x + "\n");
		}
		
		System.out.print(sb);
	}

}
