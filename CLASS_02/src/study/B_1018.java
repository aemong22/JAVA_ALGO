package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class B_1018 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arr = in.readLine().split(" ");
		int M = Integer.parseInt(arr[0]);
		int N = Integer.parseInt(arr[1]);
		
		String[][] arr2 = new String[N][];
		
		for(int i = 0 ; i <	N;i++) {
			arr2[i] = in.readLine().split("");
		}
		
		List<Integer> result = new ArrayList<>();
		
		for(int i =0; i < (N-7); i++) {
			for(int j = 0; j< (M-7) ; j++) {
				for(int y = 0; y < 8; y++) {
					for(int x = 0; x < 8 ;x++) {
						//시작이 b 일때
						
						
						// 시작이 w 일때
						
					}
				}
			}
			
			
		}
		

	}

}
