package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class B_1085 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = in.readLine().split(" ");
		List<Integer> result = new ArrayList<>();
		int x = Integer.parseInt(arr[0]);
		int y = Integer.parseInt(arr[1]);
		int w = Integer.parseInt(arr[2]);
		int h = Integer.parseInt(arr[3]);
		
		result.add(y);
		result.add(x);
		result.add(h-y);
		result.add(w-x);
		System.out.println(Collections.min(result));
	}

}
