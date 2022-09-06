package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class B_1927 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		
		PriorityQueue<Integer> list = new PriorityQueue<>();
		
		for(int t = 0 ; t < n ; t++) {
			int temp = Integer.parseInt(in.readLine());
			if(temp == 0) {
				int output = list.isEmpty() ? 0 : list.poll();
				System.out.println(output);
			}
			else {
				list.offer(temp);
			}
		}

	}

}
