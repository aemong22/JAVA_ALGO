package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class B_5430 {

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		for(int tc = 0; tc < t; tc++) {
			// 함수 입력
			String[] p = in.readLine().trim().split("");
			ArrayList<String> answer = new ArrayList<>();
			// 배열 크기 입력
			int n = Integer.parseInt(in.readLine());
			
			String str = in.readLine();
			str = str.substring(1,str.length()-1);
			Deque<String> dq = new ArrayDeque<>(Arrays.asList(str.split(",")));
			boolean end = false;
			boolean err = false;
			for(int i = 0; i < p.length; i++) {
				switch (p[i]) {
				case "R":
					end = !end;
					break;

				case "D":
					if(n == 0 || dq.isEmpty()) {
						err = true;
						break;
					}
					else {
						String temp = end ? dq.pollLast()  : dq.pollFirst();
					}
					break;
				}
				if(err) break;
			}
			
			if(err) {
				sb.append("error\n");
			}
			else {
				sb.append("[");
				int temp = dq.size();
				for(int i = 0; i < temp; i++) {
					sb.append(end ? dq.pollLast() : dq.pollFirst());
					if(i != temp-1) {
						sb.append(",");
					}
					
				}
				sb.append("]\n");
				
			}
			
		}
		
		System.out.println(sb);
		
	}

}
