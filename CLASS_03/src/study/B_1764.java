package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class B_1764 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> name = new HashSet<>();
		ArrayList<String> answer = new ArrayList<>();
		String[] str = in.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		for(int i = 0; i < n ; i++) {
			name.add(in.readLine());
		}
		
		for(int i = 0; i < m; i++) {
			String temp = in.readLine();
			if(name.contains(temp)) {
				answer.add(temp);
			}
		}
		
		Collections.sort(answer);
		System.out.println(answer.size());
		for(String x : answer) {
			System.out.println(x);
		}
	}
	
	
	
}
