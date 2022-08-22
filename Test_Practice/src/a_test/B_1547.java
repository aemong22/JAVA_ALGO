package a_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class B_1547 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(in.readLine());
		int current = 1;
		for(int i = 0; i < m ; i++) {
			String[] str = in.readLine().split(" ");
			int cup1 = Integer.parseInt(str[0]);
			int cup2 = Integer.parseInt(str[1]);
			
			if(cup2 == current) {
				current = cup1;
			}
			else if ( cup1 == current) {
				current = cup2;
			}
		}
		
		System.out.println(current);
		

	}

}
