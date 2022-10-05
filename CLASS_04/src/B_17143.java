import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_17143 {
	static int r;
	static int c;
	static int m;
	static int[][] shark;
	static boolean[] die;
	static int[][] map;

	static int ans;


	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(in.readLine());

		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		shark = new int[m][5];
		die = new boolean[m];
		
		map = new int[r+1][c+1];
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(in.readLine());
			for(int j = 0; j < 5; j++) {
				shark[i][j] = Integer.parseInt(st.nextToken());
			}
			map[shark[i][0]][shark[i][1]] = i+1;
		}

		ans = 0;
		for(int current = 1; current <= c; current++) {
			fish(current);
		}
		System.out.println(ans);
		




	}

	public static void fish(int current) {
		// 상어 잡기
		for(int i = 1; i <= r; i++) {
			if(map[i][current] != 0) {
				int ss = map[i][current]-1;
				ans+= shark[ss][4];
				die[ss] = true;
				break;
			}
		}

		// 상어 이동
		map = new int[r+1][c+1];
		for(int i = 0; i < m ; i++) {
			if(!die[i]) {
				boolean change = false;
				int t = shark[i][2];
				switch(shark[i][3]) {
				// 위
				case 1:
					while(t-- > 0) {
						if((shark[i][0] == r && change) || (shark[i][0] == 1 && !change)) {
							change = !change;
						}

						if(change) {
							shark[i][0]++;

						}
						else {
							shark[i][0]--;

						}
					}
					
					if(change) {
						shark[i][3] = 2;
					}
					check(i);
					break;


				case 2:
					while(t-- > 0) {
						if((shark[i][0] == r && !change) || (shark[i][0] == 1 && change)) {
							change = !change;
						}

						if(change) {
							shark[i][0]--;

						}
						else {
							shark[i][0]++;

						}
					}
					if(change) {
						shark[i][3] = 1;
					}
					check(i);
					break;
					
				case 3:
					while(t-- > 0) {
						if((shark[i][1] == c && !change) || (shark[i][1] == 1 && change)) {
							change = !change;
						}

						if(change) {
							shark[i][1]--;

						}
						else {
							shark[i][1]++;

						}
					}
					if(change) {
						shark[i][3] = 4;
					}
					check(i);
					break;	
					
				case 4:
					while(t-- > 0) {
						if((shark[i][1] == c && change) || (shark[i][1] == 1 && !change)) {
							change = !change;
						}

						if(change) {
							shark[i][1]++;

						}
						else {
							shark[i][1]--;

						}
					}
					if(change) {
						shark[i][3] = 3;
					}
					check(i);
					break;	
				}
			}
		}
		
	}

	public static void check(int i) {
		if(map[shark[i][0]][shark[i][1]] != 0) {
			int which = map[shark[i][0]][shark[i][1]]-1;
			if( shark[which][4] > shark[i][4] ) {
				die[i] = true;
			}
			else {
				die[which] = true;
				map[shark[i][0]][shark[i][1]]= i + 1;
			}
		}
		else {
			map[shark[i][0]][shark[i][1]]= i + 1;
		}

	}

}
