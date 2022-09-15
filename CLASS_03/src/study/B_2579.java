package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class B_2579 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		
		int[] num = new int[300];
		int[] memory = new int[300];
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(in.readLine());
		}
		
		memory[0] = num[0];
		memory[1] = num[0] + num[1];
		memory[2] = Math.max(num[2]+num[0], num[1]+num[2]);
		
		for(int i = 3; i < n; i++) {
			memory[i] = Math.max(num[i]+num[i-1]+memory[i-3], num[i]+memory[i-2]);
		}
		
		System.out.println(memory[n-1]);

	}
}
