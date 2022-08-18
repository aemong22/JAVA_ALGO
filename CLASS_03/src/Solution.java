import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 시뮬레이션 + bfs
 * 87916kb/ 363ms
 * @author KimDaol
 *
 */
public class Solution {

	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	static int result; //서비스를 제공받을 집들의 수
	static int[][] map; 
	static boolean[][] visited; //bfs 탐색 중 방문 여부 확인을 위한 배열
	static int N, M;
	//집 혹은 지역 정보 클래스
	static class Point {
		int r,c;
		public Point(int r, int c) {
			this.r=r;
			this.c=c;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int test_case=1; test_case<=T; test_case++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken()); //도시의 크기 5<=N<=20
			M = Integer.parseInt(st.nextToken()); //지불 가능 비용  1<=M<=10
			map = new int[N][N];
			
			for(int i=0; i<N; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j<N;j++) {
					map[i][j] = Integer.parseInt(st.nextToken()); 
				}
			}

			result = Integer.MIN_VALUE;
			for(int i = 0; i<N; i++) {
				for(int j = 0; j<N; j++) {
					bfs(i,j); 
				}
			}

			System.out.println("#"+test_case+" "+result);
			
		}
		
	}
	
	static void bfs(int r, int c) {
		Queue<Point> queue = new LinkedList<>();
		visited = new boolean[N][N];
		visited[r][c]=true; 
		queue.offer(new Point(r, c)); 
		
		int homeCnt = 0;
		if(map[r][c] ==1) { 
			homeCnt++;
		}
		
		int depth = 1; 
		while(!queue.isEmpty()) {
			if(homeCnt*M >= cost(depth)){
				result= Math.max(result, homeCnt);
			}
			int qSize = queue.size();  
			while(qSize-- >0) { 
				Point front = queue.poll();
				
				for(int d = 0; d<4; d++) {
					int nr = front.r+dx[d];
					int nc = front.c+dy[d];
					if(0<=nr&&nr<N && 0<=nc&&nc<N && !visited[nr][nc]) {
						visited[nr][nc]= true;
						queue.offer(new Point(nr,nc));
						if(map[nr][nc] ==1) {
							homeCnt++;
						}
					}
				}
			}
			depth++; 
		}
		
	}

	/**
	 * 서비스 영역에 따른 운영비용 계산
	 * @param k : 서비스 영역 크기 
	 * @return 운영비용 리턴
	 */
	static int cost(int k) { 
		return k*k+(k-1)*(k-1);
	}
	


}