package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class B_1966 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int t = Integer.parseInt(st.nextToken());
		for(int i =0 ;i < t; i++) {
			st = new StringTokenizer(in.readLine());
			int file = Integer.parseInt(st.nextToken());
			int target = Integer.parseInt(st.nextToken())-1;
			st = new StringTokenizer(in.readLine());
			Deque<Integer> deque = new LinkedList<>();
			for(int idx = 0; idx < file ; idx++) {
				deque.offer(Integer.parseInt(st.nextToken()));
			}
			
			int count = 0;
			while(deque.size()>0) {
				int Max = Collections.max(deque);
				count++;
				if (Max == deque.getFirst()) {
					if (target == 0) {
						break;
					}
					deque.poll();
				}
				else {
					int a = deque.poll();
					deque.offer(a);
				}
				target--;
				if(target<0) {
					target = deque.size();
				}
			}
			
			sb.append(count+"\n");
		}
		System.out.println(sb);

	}

}
