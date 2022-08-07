package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2292 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int room = Integer.parseInt(st.nextToken());
		int count = 1;
		int end = 1;
		while(true) {
			if(room <= end) {
				break;
			}
			else {
				end += 6*count;
				count++;
			}
		}
		
		System.out.println(count);

	}

}
