package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B_4153 {

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			int[] num = new int[3];
			num[0] = Integer.parseInt(st.nextToken());
			num[1] = Integer.parseInt(st.nextToken());
			num[2] = Integer.parseInt(st.nextToken());
			
			
			if(num[0] == 0 && num[1] == 0 && num[2]== 0) {
				break;
			}
			
			Arrays.sort(num);
			int x = (int) (Math.pow(num[0], 2) + Math.pow(num[1], 2));
			int y = (int) Math.pow(num[2], 2);
			
			if( x == y ) {
				sb.append("right\n");
			}
			else {
				sb.append("wrong\n");
			}
		}
		
		System.out.println(sb);

	}

}
