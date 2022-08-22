package a_test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_2819 {

	static int[][] map;
	static boolean[] num;
	static int[] output;
	static int count ;
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample_input.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(in.readLine());
		for(int tc = 1; tc <= t ; tc++) {
			map = new int[4][4];
			num = new boolean[10000000];
			output = new int[7];
			count = 0;
			// 맵 저장
			for(int i = 0; i < 4; i++) {
				StringTokenizer st = new StringTokenizer(in.readLine());
				map[i][0] = Integer.parseInt(st.nextToken());
				map[i][1] = Integer.parseInt(st.nextToken());
				map[i][2] = Integer.parseInt(st.nextToken());
				map[i][3] = Integer.parseInt(st.nextToken());
			}
			for(int dy = 0; dy < 4; dy++) {
				for(int dx = 0; dx< 4; dx++) {
					check(0,dy,dx);
				}
			}
			System.out.printf("#%d %d\n",tc,count);

		}

	}

	public static void check(int cnt, int y, int x) {
		if(cnt == 7) {
			String temp ="";
			for(int w : output) {
				temp += Integer.toString(w);
			}
			if (!num[Integer.parseInt(temp)]) {
				count++;
				num[Integer.parseInt(temp)]  = true;
			}
			return;
		}
		
		output[cnt] = map[y][x];
		if(y+1 < 4) check(cnt+1,y+1,x);
		if(x+1 < 4) check(cnt+1,y,x+1);
		if(x-1 >= 0) check(cnt+1,y,x-1);
		if(y-1 >= 0) check(cnt+1,y-1,x);
	}




}
