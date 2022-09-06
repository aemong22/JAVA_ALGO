package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1780 {
	static int n; // 크기
	static int[][] map; // nxn 크기의 종이
	static boolean[][] visited;
	static int zero;
	static int one;
	static int minus;
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(in.readLine());

		n = Integer.parseInt(st.nextToken());
		map = new int[n][n];
		visited = new boolean[n][n];
		for(int y = 0 ; y < n ; y++) {
			st = new StringTokenizer(in.readLine());
			for(int x = 0; x < n; x++) {
				map[y][x] = Integer.parseInt(st.nextToken());
			}
		}

		one= 0; minus= 0; zero = 0;
		cut(0,0,n);
		System.out.println(minus);
		System.out.println(zero);
		System.out.println(one);

	}
	// r: 탐색 시작지점의 행, c: 탐색 시작지점의 열, size: 탐색 영역 한 변의 길이
	private static void cut(int r, int c, int size) {
		int check = map[r][c];
		boolean result = true;
		for (int i = r; i < r + size; i++) {
			if(!result) break;
			for (int j = c; j < c + size; j++) {
				if(check != map[i][j]) {
					result = false;
					break;
				}
			}
		}
		
		if(result) {
			if(check == 0) {
				zero++;
			}
			if (check == 1) {
				one++;
			}
			if(check == -1) {
				minus++;
			}
			
		}
		else {
			// 9개로 나누기
			int resize = size / 3;
			cut(r,c,resize);
			cut(r,c+resize,resize);
			cut(r,c+resize*2,resize);
			
			cut(r+resize,c,resize);
			cut(r+resize,c+resize,resize);
			cut(r+resize,c+resize*2,resize);
			
			cut(r+resize*2,c,resize);
			cut(r+resize*2,c+resize,resize);
			cut(r+resize*2,c+resize*2,resize);
		}
	}

}
