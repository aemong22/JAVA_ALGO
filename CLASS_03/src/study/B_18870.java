package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class B_18870 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(in.readLine());
		int[] num = new int[n];
		Map<Integer,Integer> map = new HashMap<>();
		
		st = new StringTokenizer(in.readLine());
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] sort = num.clone();
		Arrays.sort(sort);
		
		int idx = 0;
		for(int a : sort) {
			if(!map.containsKey(a)) {
				map.put(a, idx++);
			}
		}
		for(int a: num) {
			sb.append(map.get(a)).append(" ");
		}
		System.out.println(sb);
	}
}
