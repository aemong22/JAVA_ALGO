package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class B_1620 {

	static int n; // 도감에 수록되어 있는 포켓몬의 수
	static int m; // 내가 맞춰야 하는 문제의 개수
	static Map<String,String> book; // 도감
	static Map<String,String> book2;
	
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] str = in.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		book = new HashMap<>();
		book2 = new HashMap<>();
		
		for(int i = 1; i <= n ; i++) {
			String temp = Integer.toString(i);
			String str1 = in.readLine().trim();
			book.put(str1,temp);
			book2.put(temp, str1);
		}
		
		for(int i = 0 ; i < m ; i++ ) {
			String temp = in.readLine().trim();
			String result = book.get(temp);
			if(result == null) {
				sb.append(book2.get(temp));
			}
			else {
				sb.append(result);
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}
	
}
