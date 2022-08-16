package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.*;
import java.util.StringTokenizer;

public class B_10845 {

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int t = Integer.parseInt(st.nextToken());
		Deque<Integer> deque = new ArrayDeque<>();
		for(int i = 0; i< t; i++) {
			 st = new StringTokenizer(in.readLine());
			 String a = st.nextToken();
			 if(a.equals("push")) {
				 deque.offer(Integer.parseInt(st.nextToken()));
			 }
			 if(a.equals("front")) {
				 if(deque.isEmpty()) sb.append("-1\n");
				 else sb.append(deque.peek()+"\n");
			 }
			 if(a.equals("back")) {
				 if(deque.isEmpty()) sb.append("-1\n");
				 else sb.append(deque.peekLast()+"\n");
			 }
			 if(a.equals("size")) {
				 sb.append(deque.size()+"\n");
			 }
			 if(a.equals("empty")) {
				if(deque.isEmpty()) sb.append("1\n");
				else sb.append("0\n");
			 }
			 if(a.equals("pop")) {
				if(deque.isEmpty()) sb.append("-1\n");
				else sb.append(deque.pollFirst()+"\n");
			 }
		}
		
		System.out.println(sb);
	}

}
