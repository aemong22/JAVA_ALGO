package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1541 {

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine(),"-|\\+", true );
		int sum = 0;
		
		boolean temp = false;
		while(st.hasMoreTokens()) {
			String x = st.nextToken();
			if(x.equals("-")) {
				temp = true;
			}
			
			if(!x.equals("-") && !x.equals("+")) {
				if(temp) {
					sum -= Integer.parseInt(x);
				}
				else {
					sum +=Integer.parseInt(x);
				}

			}	
		}
		
		System.out.println(sum);
		
	}

}
