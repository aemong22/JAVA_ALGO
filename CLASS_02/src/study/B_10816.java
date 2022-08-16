package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class B_10816 {

		public static void main(String[] args) throws Exception {
			StringBuilder sb = new StringBuilder();
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(in.readLine());
			int t = Integer.parseInt(st.nextToken());
			
			int[] num = new int[20000001];
			st = new StringTokenizer(in.readLine());
			for(int i = 0; i < t; i ++) {
				num[Integer.parseInt(st.nextToken())+10000000]++;
			}
			
			st = new StringTokenizer(in.readLine());
			int t2 =  Integer.parseInt(st.nextToken());
			int[] result = new int[t2];
			st = new StringTokenizer(in.readLine());
			for(int i = 0; i < t2; i++) {
				int num2 = Integer.parseInt(st.nextToken());
				sb.append(num[num2+10000000]).append(" ");
			}
			System.out.println(sb);
	}

}
