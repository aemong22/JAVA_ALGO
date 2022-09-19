package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_9095 {

	public static void main(String[] args) throws Exception  {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] memory = new int[11+1];
		
		memory[1] = 1;
		memory[2] = 2;
		memory[3] = 4;
		
		for(int i = 4; i <=11; i++) {
			memory[i] = memory[i-1] + memory[i-2] + memory[i-3];
		}
		
		int t = Integer.parseInt(in.readLine());
		for(int tc = 0; tc < t; tc++) {
			int n = Integer.parseInt(in.readLine());
			sb.append(memory[n]).append("\n");
		}
		System.out.println(sb);
		

	}

}
