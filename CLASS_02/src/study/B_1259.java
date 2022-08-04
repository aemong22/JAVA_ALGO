package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_1259 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			boolean result = true;
			String[] num = in.readLine().split("");
			
			int length = num.length;
	
			if (num.length == 1) {
				if(num[0].equals("0")) {
					break;
				}
			}
			for(int i = 0; i < length/2; i++) {
				if(!num[i].equals(num[length-i-1])) {
					result = false;
					break;
				}
			}
			if(result) {
				sb.append("yes\n");
			}
			else {
				sb.append("no\n");
			}
		}
		
		System.out.println(sb);

	}

}
