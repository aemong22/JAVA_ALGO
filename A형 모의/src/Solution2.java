import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution2 {
	static int n;
	static int map[][]; // 맵 
	static int cnt;
	static boolean visited[];
	static int min;
	static int[] selected;
	
	static int[][] target; // 몬스터 및 고객 위치 저장
	
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample_input2.txt"));
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// 테스트 케이스 수 입력
		int t = Integer.parseInt(in.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			// 맵 크기 입력
			n =  Integer.parseInt(in.readLine());
			
			cnt = 0 ; // 몬스터 및 고객 수
			target = new int[8][2];
			map = new int[n][n];
			for(int y = 0 ; y < n ; y++) {
				String[] str = in.readLine().split(" ");
				for(int x = 0; x < n; x++) {
					map[y][x] = Integer.parseInt(str[x]);
					if(map[y][x] != 0) {
						target[cnt][0] = y;
						target[cnt][1] = x;
						cnt++;
					}
				}
			}
			
			visited = new boolean[cnt];
			selected = new int[cnt];
			min = Integer.MAX_VALUE;
			perm(0);
			sb.append("#"+tc+" "+min+"\n");
		}
		System.out.println(sb);
	}
	
	public static void perm(int count) {
		if(count == cnt) {
			check();
			return;
		}
		for(int i = 0 ; i < cnt; i++) {
			if(visited[i]) continue;
			visited[i] = true;
			selected[count] = i;
			perm(count+1);
			visited[i] = false;
		}
	}
	
	public static void check() {
		ArrayList<Integer> monster = new ArrayList<>();
		int dx = 0;
		int dy = 0;
		int sum = 0;
		boolean success = true;
		for(int i : selected) {
			if(map[target[i][0]][target[i][1]] > 0) {
				monster.add(map[target[i][0]][target[i][1]]);
				sum += Math.abs(dy - target[i][0]) + Math.abs(dx - target[i][1]);
				dy = target[i][0];
				dx = target[i][1];
			}
			else if(map[target[i][0]][target[i][1]] < 0 && monster.contains(Math.abs(map[target[i][0]][target[i][1]]))) {
				sum += Math.abs(dy - target[i][0]) + Math.abs(dx - target[i][1]);
				dy = target[i][0];
				dx = target[i][1];
			}
			else {
				success = false;
			}
		}
		
		if(success) {
			min = Math.min(min, sum);
		}
	}
}
