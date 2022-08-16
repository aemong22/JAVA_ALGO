package study;

// ctrl + shift + o => 자동으로 import
// 코드정렬 : ctrl + a 누른후 ctrl shift i

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B_1874 {
	
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		
		int t = Integer.parseInt(st.nextToken());
		Stack<Integer> stack = new Stack<>();
		int[] num = new int[t];
		for(int i = 0 ; i < t ; i++) {
			num[i] = Integer.parseInt(in.readLine());
		}
		int end = 1;
		for(int i = 0 ; i < t ; i ++) {
			int input = num[i];
			while(end <= input) {
				stack.push(end++);
				sb.append("+\n");
			}
			
			if(stack.peek() == input) {
				stack.pop();
				sb.append("-\n");
			}
			else
				break;
			
		}
		
		if(stack.isEmpty()) {
			System.out.println(sb);
		}
		else {
			System.out.println("NO");
		}
		
	}

}
