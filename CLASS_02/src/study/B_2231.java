package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2231 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int result = 0;
		int num = Integer.parseInt(st.nextToken());
		for(int i = 1; i <=num; i++) {
			int answer = 0;
			String s = Integer.toString(i);
			for(int j = 0; j < s.length(); j++) {
				answer+=Integer.parseInt(s.substring(j,j+1));
			}
			answer += i;
			if(answer == num) {
				result = i;
				break;
			}
		}
		System.out.println(result);
		
	}

}
