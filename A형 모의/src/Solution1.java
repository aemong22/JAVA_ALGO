import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Solution1 {
	static int n; // 낚시터 갯수
	static int[] map;
	static int[][] door = new int[3][2]; // 출입문 위치  및, 대기 인원 수
	static int min;
	static boolean[] visited; // 선택했는지.
	static int[] selected = new int[3];
	
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("sample_input.txt"));
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(in.readLine());
		
		for(int tc = 1; tc <= t; tc++) {
			
			n = Integer.parseInt(in.readLine());
			
			map = new int[n]; // 낚시터 갯수 초기화 
			
			for(int i = 0; i < 3 ;  i++) {
				String[] str = in.readLine().split(" ");
				door[i][0] = Integer.parseInt(str[0]);
				door[i][1] = Integer.parseInt(str[1]);
			}
			
			min = Integer.MAX_VALUE;
			visited = new boolean[3];
			dfs(0,0);
			sb.append("#" + tc + " "+min+"\n");
			
		}
		
		System.out.println(sb);
	}
	
	// 순열로 순서 정하기.
	public static void dfs(int cnt, int sum) {
		if(sum > min) {
			return;
		}
		
		if(cnt == 3) {
			min = Math.min(sum, min);
			return;
		}
		
		for(int i = 0 ; i < 3 ; i++) {
			if(visited[i]) continue;
			visited[i] = true;
			selected[cnt] = i;
			// 낚시꾼 배치 오른쪽 먼저
			dfs(cnt+1 ,sum+check(door[i][0]-1, door[i][1], true, i+1));
			
			// 낚시꾼 배치 초기화
			outFisher(i+1);
			
			// 낚시꾼 배치 왼쪽 먼저
			dfs(cnt+1 , sum+check(door[i][0]-1, door[i][1], false, i+1));
			
			// 낚시꾼 배치 초기화
			outFisher(i+1);
			
			visited[i] = false;
		}
	}
	
	public static int check(int gate, int member, boolean flag , int temp) {
		int fisher = 0;
		int idx = 0;
		int sum = 0;
		while(fisher < member) {
			if(gate-idx >=0 && gate+idx < n && map[gate-idx] == 0 && map[gate+idx] == 0) {
				sum+=idx+1;
				fisher++;
				// 오른쪽 선택
				if (flag) {
					map[gate+idx] = temp;
				}
				// 왼쪽 선택
				else {
					map[gate-idx] = temp;
				}
				
				
			} else if(gate-idx >=0 && map[gate-idx] == 0) {
				map[gate-idx] = temp;
				sum += idx+1;
				fisher++;
			} else if(gate+idx < n && map[gate+idx] == 0) {
				map[gate+idx] = temp;
				sum += idx+1;
				fisher++;
			}
			else {
				idx++; // 오른쪽 왼쪽 다 확인한 후 없으면 idx+1을 하여 더 넓은 거리 살펴보기.
			}
			
		}
		return sum;
	}
	
	public static void outFisher(int idx) {
		for(int i = 0 ; i < n ; i++){
			if(map[i] == idx) {
				map[i] = 0; 
			}
		}
	}

}
