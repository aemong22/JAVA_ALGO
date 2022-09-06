package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B_1676 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		BigInteger n = new BigInteger(in.readLine());
		BigInteger sub = new BigInteger("1");
		BigInteger result = BigInteger.valueOf(1);
		
		while(n.compareTo(sub) >= 0) {
			result = result.multiply(n);
			n = n.subtract(sub);
		}

		String str = result.toString();
		int cnt = 0;
		for(int i = str.length()-1 ; i >= 0 ; i--) {
			if ( str.charAt(i) == '0') {
				cnt++;
			}
			else {
				break;
			}
		}
		
		System.out.print(cnt);

	}

}
