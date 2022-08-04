package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_1436 {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(in.readLine());
		int count = 0;
		int num = 666;
		while(count<input) {
			String num2 = Integer.toString(num);
			if(num2.contains("666")) {
				count++;
			}
			num++;
		}
		System.out.println(num-1);
	}

}
