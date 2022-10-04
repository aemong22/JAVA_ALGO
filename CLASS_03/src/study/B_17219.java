package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 비밀번호 찾기

public class B_17219 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		HashMap<String, String> pwd = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(in.readLine());
			pwd.put(st.nextToken(), st.nextToken());
		}
		
		for(int i = 0; i < m; i++) {
			sb.append(pwd.get(in.readLine())).append("\n");
		}
		System.out.println(sb);
		
	
	}
}
