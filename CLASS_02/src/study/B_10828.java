package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class B_10828 {

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int t = Integer.parseInt(st.nextToken());
		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i< t; i++) {
			 st = new StringTokenizer(in.readLine());
			 String a = st.nextToken();
			 if( a.equals("push")) {
				 stack.push(Integer.parseInt(st.nextToken()));
			 }
			 else if(a.equals("top")) {
				 if(stack.isEmpty())sb.append(-1 +"\n");
				 else sb.append(stack.peek() +"\n" );
			 }
			 else if( a.equals("size")) {
				sb.append(stack.size() + "\n");
			 }
			 else if(a.equals("empty")) {
				 if(stack.isEmpty()) sb.append("1\n");
				 else sb.append("0\n");
			 }
			 else if( a.equals("pop")) {
				 if(stack.isEmpty()) sb.append("-1\n");
				 else sb.append(stack.pop()+"\n");
			 }
		}
		
		System.out.println(sb);
		
	}

}
