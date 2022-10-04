package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_11403 {
	static int n; //
	static int map[][] ;
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(in.readLine());
		map = new int[n][n];
		
		for(int i = 0; i < n ; i++) {
			st = new StringTokenizer(in.readLine());
			for(int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// k : 중간 정점이 될 부분.
		for(int k = 0; k < n ; k++) {
			for(int y = 0; y < n; y++) {
				for(int x = 0; x < n; x++) {
					map[y][x] = map[y][k]  > 0 && map[k][x] > 0 ? 1 : map[y][x]; 
				}
			}
		}
		
		// 출력
		for(int y = 0; y < n; y++) {
			for(int x = 0; x < n; x++) {
				System.out.print(map[y][x]+" ");
			}
			System.out.println();
		}
		
		
	}

}
