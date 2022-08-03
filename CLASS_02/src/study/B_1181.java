package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class B_1181 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		List<String> word = new ArrayList<>();
		List<Integer> length = new ArrayList<>();
		int t = Integer.parseInt(in.readLine());
		for(int i = 0 ; i < t ; i++) {
			String w = in.readLine();
			if(!word.contains(w)){
				word.add(w);
				if(!length.contains(w.length())) {
					length.add(w.length());
				}
			}
		}
		
		Collections.sort(length);
		for(int z : length) {
			List<String> test = new ArrayList<>();
			for(String a: word) {
				if(a.length() == z) {
					test.add(a);
				}
			}
			Collections.sort(test);
			for(String w : test) {
				System.out.println(w);
			}
			
		}
		
		
		
	}

}
