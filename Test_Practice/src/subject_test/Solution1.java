package subject_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution1 {

	public static void main(String[] args) throws Exception  {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		// 암호 저장
		String str = in.readLine();
		char[] pwd = new char[26];
		for(int i = 0; i < 26 ; i++) {
			pwd[i] = str.charAt(i);
		}
		
		// 암호화된 문장 입력받기.
		String temp = in.readLine();
		for(int i = 0; i < temp.length(); i++) {
			char c = temp.charAt(i);
			// 공백인지 아닌지 구분
			if(c == ' ') {
				sb.append(' ');
				continue;
			}
			
			if(Character.isUpperCase(c)) {
				sb.append(Character.toUpperCase(pwd[Character.toLowerCase(c)-97]));
			}
			else {
				sb.append(pwd[Character.toLowerCase(c)-97]);
			}
		}

		System.out.println(sb);
	}

}
