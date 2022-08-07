package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2609 {

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		int small = num1 > num2 ? num2 : num1;
		int big = num1 > num2 ? num1 : num2;
		num1 = big;
		num2 = small;
		
		while(small > 0) {
			int x = big % small;
			big = small;
			small = x;
		}
		
		// 최대 공약수
		int max = big;
		sb.append(max + "\n");
		// 최소 공배수
		// 두 수의 곱을 최대공약수로 나누어주면 그 값이 최소공배수
		int min = num1 * num2 / max;
		
		sb.append(min + "\n");
		
		System.out.println(sb);
	}

}
