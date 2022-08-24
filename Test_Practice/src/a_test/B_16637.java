package a_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_16637 {
	static int n;
	static String[] cal;
	// 괄호안에는 연산자 하나. 
	// 연산자 우선순위는 모두 동일해서 수식을 계산할때는 왼쪽부터 ( 괄호는 예외 )
	// 추가하는 괄호 개수는 제한 x 없어도 됨.
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(in.readLine());
		cal = in.readLine().split("");
	}
	
	public static void check() {
		
		
	}

}
