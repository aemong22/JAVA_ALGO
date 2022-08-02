package first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1330번 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = in.readLine().split(" ");
		int num1 = Integer.parseInt(arr[0]);
		int num2 = Integer.parseInt(arr[1]);
		
		if(num1 == num2) {
			System.out.println("==");
		}
		else if(num1 > num2) {
			System.out.println(">");
		}
		else {
			System.out.println("<");
		}
		
	}

}
