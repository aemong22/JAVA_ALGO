package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.*;
import java.util.StringTokenizer;

public class B_7662 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(in.readLine());

		for(int tc = 0; tc < t ;tc++) {
			int k = Integer.parseInt(in.readLine());
			// 낮은 숫자 순
			PriorityQueue<Integer> p1 = new PriorityQueue<>();

			// 높은 숫자 순
			PriorityQueue<Integer> p2 = new PriorityQueue<>(Collections.reverseOrder());

			int size = 0;

			for(int i = 0; i < k ; i++) {
				st = new StringTokenizer(in.readLine());
				if(st.nextToken().equals("I")) {
					int temp = Integer.parseInt(st.nextToken());
					p1.add(temp);
					p2.add(temp);
					size++;
				}
				else {
					if(st.nextToken().equals("-1")) {
						if(size > 0) {
							p1.poll();
							size--;
						}
					}
					else {
						if(size > 0) {
							p2.poll();
							size--;
						}

					}
				}
			}
			if(size == 0) {
				sb.append("EMPTY\n");
			}
			else {
				sb.append(p2.poll() +" " +p1.poll()+"\n");
 			}
		}
		System.out.println(sb);


	}

}
