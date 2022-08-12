package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B_10773 {

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int t = Integer.parseInt(st.nextToken());
		Stack<Integer> stack = new Stack<>();
		for(int i = 0 ; i < t; i++) {
			st = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(st.nextToken());
			if(a == 0) {
				stack.pop();
			}
			else {
				stack.push(a);
			}
		}
		int sum = 0;
		for(int x : stack) {
			sum+=x;
		}
		
		System.out.println(sum);
		
	}

}
