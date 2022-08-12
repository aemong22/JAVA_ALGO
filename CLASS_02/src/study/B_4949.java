package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_4949 {

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String[] str = in.readLine().split("(|)|[|]|.");
			Stack<Integer> stack = new Stack<>();
			if(str.length == 1) {
				break;
			}
			for(String x : str) {
				if(x.contains("(")) {
					stack.push(1);
				}
				else if(x.contains("[")) {
					stack.push(2);
				}
				else if(x.contains(")")) {
					if(!stack.isEmpty() && stack.peek() == 1) stack.pop();
					else {
						stack.push(3);
						break;
					}
				}
				else if(x.contains("]")) {
					if(!stack.isEmpty() && stack.peek() == 2) stack.pop();
					else {
						stack.push(3);
						break;
					}
				}
			}
			
			if (!stack.isEmpty()) sb.append("no\n");
			else sb.append("yes\n");
				
		}
		
		System.out.println(sb);

	}

}
