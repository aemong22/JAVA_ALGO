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
			List<Integer> prior = new ArrayList<>();
			for(int i = 0; i < k ; i++) {
				st = new StringTokenizer(in.readLine());
				if(st.nextToken().equals("I")) {
					int temp = Integer.parseInt(st.nextToken());
					prior.add(temp);
				}
				else {
					Collections.sort(prior);
					if(st.nextToken().equals("-1")) {
						if(!prior.isEmpty())prior.remove(0);
					}
					else {
						if(!prior.isEmpty())prior.remove(prior.size()-1);
					}
				}
			}
			if(prior.isEmpty()) {
				sb.append("EMPTY\n");
			}
			else {
				sb.append(prior.get(prior.size()-1)).append(" ").append(prior.get(0));
			}
		}
		System.out.println(sb);


	}

}
