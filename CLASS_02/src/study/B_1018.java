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
		
		String[][] arr2 = new String[M][N];
		
		for(int i = 0 ; i <	M;i++) {
			arr2[i] = in.readLine().split("");
		}
		
		List<Integer> result = new ArrayList<>();
		
		for(int i =0; i < (M-7); i++) {
			for(int j = 0; j< (N-7) ; j++) {
				int b_err = 0;
				int w_err = 0;
				for(int y = 0; y < 8; y++) {
					for(int x = 0; x < 8 ;x++) {
						
						if((x+y)%2==0) {
							//시작이 b 일때
							if(arr2[i+y][j+x].equals("W")) {
								b_err++;
							}
							// 시작이 w 일때
							if(arr2[i+y][x+j].equals("B")) {
								w_err++;
							}
							
						}
						else {
							if(arr2[y+i][x+j].equals("B")) {
								b_err++;
							}
							if(arr2[y+i][x+j].equals("W")) {
								w_err++;
							}
						}
						
						
						
					}
				}
				result.add(Math.min(b_err,w_err));
			}
		}
		System.out.println(Collections.min(result));

	}

}
