package first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B_1157 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine().toUpperCase();
		int[] arr = new int[130];
		for(int i : str.toCharArray()) {
			arr[i] += 1;
		}
		
		int max = Arrays.stream(arr).max().getAsInt();
		int count = 0;
		for(int i : arr) {
			if(i == max) {
				count++;
			}
		}
		
		if(count > 1) {
			System.out.println("?");
		}
		else {
			for(int i = 65; i<=90;i++) {
				if(arr[i] == max) {
					System.out.println((char)i);break;
				}
			}
		}
		

	}

}
