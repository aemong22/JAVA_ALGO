package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_10814 {
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int t = Integer.parseInt(st.nextToken());
	
		String[][] member = new String[t][2];
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(in.readLine());
			member[i][0] = st.nextToken();
			member[i][1] = st.nextToken();
		}
		
		Arrays.sort(member,((o1,o2) -> {
			return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
		}));
		
		for(String[] m : member) {
			for(String n : m) {
				sb.append(n +" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		
		
		
		
	}
}
