package subject_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class B_3025 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] str = in.readLine().split(" ");

		int r = Integer.parseInt(str[0]);
		int c = Integer.parseInt(str[1]);

		// 보드판 정보 저장
		char[][] map  = new char[r][c];
		for(int y = 0; y < r ; y++) {
			String temp = in.readLine();
			for(int x = 0; x < c ; x++) {
				map[y][x] = temp.charAt(x); 
			}
		}

		// 돌 던지기!
		int n = Integer.parseInt(in.readLine());
		for(int i = 0; i < n ; i++) {
			int location  = Integer.parseInt(in.readLine()) - 1;

			for(int y = 0 ; y < r;  y++) {
				if(map[y][location] == 'X') {
					map[y-1][location] = 'O';
					break;
				}
				else if(map[y][location] == 'O') {
					if( location-1 >= 0 && map[y][location-1] == '.' && map[y-1][location-1] == '.') {
						location -= 1;
						y--;
					}
					else if( location+1 < c && map[y][location+1] == '.' && map[y-1][location+1] == '.') {
						location += 1;
						y--;
					}
					else {
						map[y-1][location] = 'O';
						break;
					}

				}
				
				if( y == r-1) {
					map[y][location] = 'O';
					break;
				}
			}
		}
		
		for(char[] x : map) {
			for(char y : x) {
				System.out.print(y);
			}
			System.out.println();
		}
	}

}
