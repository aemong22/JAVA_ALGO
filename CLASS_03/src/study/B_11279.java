package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class B_11279 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> list = new PriorityQueue<>(Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(in.readLine());
		
		for(int tc = 0 ; tc < n; tc++) {
			int t = Integer.parseInt(in.readLine());
			
			if(t == 0) {
				if(list.isEmpty()) {
					sb.append(0).append("\n");
				}
				else {
					sb.append(list.poll()).append("\n");
				}
			}
			else {
				list.add(t);
			}
		}
		
		System.out.println(sb);

	}

}
