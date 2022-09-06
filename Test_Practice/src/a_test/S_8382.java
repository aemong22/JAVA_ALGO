package a_test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class S_8382 {
	static int startX;
	static int startY;

	static int endX;
	static int endY;

	public static void main(String[] args)  throws Exception {
		System.setIn(new FileInputStream("sample_input2.txt"));
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(in.readLine());

		for(int tc= 1; tc <= t ; tc++) {
			sb.append("#"+tc+" ");

			String[] str = in.readLine().split(" ");
			startX = Integer.parseInt(str[0]);
			startY = Integer.parseInt(str[1]);
			endX = Integer.parseInt(str[2]);
			endY = Integer.parseInt(str[3]);

			int count = 0;
			int x = Math.abs(startX-endX);
			int y = Math.abs(startY-endY);

			if( Math.abs(x - y) == 0) {
				count = x+y;
			}
			else if( Math.abs(x - y) == 1) {
				count = x+y;
			}
			else if ( Math.abs(x - y) % 2 == 0 ) { 
				int temp = Math.abs(x - y);
				count = x > y ? (x - temp) * 2 : (y - temp) * 2;
				count += temp*2;
			}
			else if ( Math.abs(x - y) % 2 == 1 ) { 
				int temp = Math.abs(x - y);
				count = x > y ? (x - temp) * 2 : (y - temp) * 2;
				count += temp*2 -1;
			}
			
			sb.append(count+"\n");

		}
		
		System.out.println(sb);

	}

}
