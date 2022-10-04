package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class B_2239 {
	static int map[][] = new int[9][9];
	static boolean success = false;

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		for(int y = 0; y < 9; y++) {
			String[] str = in.readLine().split("");
			for(int x = 0; x < 9; x++) {
				map[y][x] = Integer.parseInt(str[x]);
			}
		}

		check(0,0);

		for(int i = 0; i <9; i++) {
			for(int j = 0; j < 9; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}

	}

	public static void check(int dy, int dx) {
		
		int ny = dx + 1 >=  9 ?  dy + 1 : dy;
		int nx = dx + 1 >= 9 ? 0 : dx + 1;
		if(dy > 8) {
			success = true;
			return;
		}

		if(map[dy][dx] != 0) {
			check(ny,nx);
		}
		else if(map[dy][dx]==0) {
			int[] chk = new int[10];
			// 가로 줄 검사
			for(int i = 0; i < 9; i++) {
				chk[map[dy][i]]++;
			}


			// 세로줄 검사
			for(int i = 0; i < 9; i++) {
				chk[map[i][dx]]++;
			}
			
			// 정사각형 검사
			int yy = 0;
			int xx = 0;
			if( dy >= 3 ) yy+=3;
			if( dy >= 6 ) yy+=3;
			if( dx >= 3 ) xx+=3;
			if( dx >=6 ) xx+=3;

			for(int i = yy; i < yy+3; i++) {
				for(int j = xx; j < xx+3; j++) {
					chk[map[i][j]]++;
				}
			}


			for(int i = 1 ; i <= 9; i++) {
				if(chk[i] == 0) {
					map[dy][dx] = i;
					check(ny,nx);
					if(success) return;
					map[dy][dx] = 0;
				}
			}

		}

	}


}
