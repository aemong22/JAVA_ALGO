package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class B_2751 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int t = Integer.parseInt(st.nextToken());
		List<Integer> num = new ArrayList<>();
		for(int i = 0; i< t ; i++) {
			st = new StringTokenizer(in.readLine());
			num.add((Integer.parseInt(st.nextToken())));
		}
		
		// sort 사용 x -> 시간초과
		/*
		for(int j = 1; j < t ; j++) {
			for(int i = 1; i < t; i++) {
				if( num[i-1] > num[i] ) {
					int a = num[i-1];
					num[i-1] = num[i];
					num[i] = a;
				}
			}
		}
		*/
		
		// sort 사용 -> 시간초과
		// Arrays.sort(num);
		
		// 스택 사용 -> 시간초과
		/*
		for(int i = 0; i< t; i++) {
			int a = Collections.min(num);
			result.push(a);
			num.remove(Integer.valueOf(a));
			
		}
		*/
		
		
		// collections.sort 사용
		Collections.sort(num);
		
		for(int x : num) {
			sb.append(x + "\n");
		}
		
		System.out.println(sb);
	}

}
