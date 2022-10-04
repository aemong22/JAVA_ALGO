package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B_11723 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		HashSet<Integer> hashset = new HashSet<>();
		HashSet<Integer> basic = new HashSet<>();

		for(int i = 1; i <= 20; i++) {
			basic.add(i);
		}

		int n = Integer.parseInt(in.readLine());

		for(int i = 0; i< n; i++) {
			st = new StringTokenizer(in.readLine());
			String method = st.nextToken();
			int num = 0;
			switch(method) {
			case "add":
				num = Integer.parseInt(st.nextToken());
				hashset.add(num);
				break;

			case "remove":
				num = Integer.parseInt(st.nextToken());
				hashset.remove(num);
				break;

			case "check":
				num = Integer.parseInt(st.nextToken());
				sb.append(hashset.contains(num) ? 1 : 0);
				sb.append("\n");
				break;

			case "toggle":
				num = Integer.parseInt(st.nextToken());
				if(hashset.contains(num)) {
					hashset.remove(num);
				}
				else {
					hashset.add(num);
				}
				break;

			case "all":
				hashset.addAll(basic);
				break;

			case "empty":
				hashset.clear();
				break;
			}
		}
		System.out.println(sb);
	}
}
