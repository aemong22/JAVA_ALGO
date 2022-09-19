package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class B_9375 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(in.readLine());

		for(int tc = 0; tc < t; tc++) {
			int n = Integer.parseInt(in.readLine()); // 의상의 수
			HashMap<String,Integer> clothes = new HashMap<>();
			for(int i = 0; i < n; i++) {
				String[] str = in.readLine().split(" ");
				if(clothes.containsKey(str[1]))
				{
					clothes.put(str[1],clothes.get(str[1])+1);
				}
				else {
					clothes.put(str[1], 2);
				}
			}
			int result = 1;
			for(int val : clothes.values()) {
				result *= val;
				
			}
			System.out.println(result-1);
		}
	}

}
