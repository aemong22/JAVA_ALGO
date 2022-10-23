import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
	static int n; // 추의 개수
	static int[] arr;// 추의 무게
	static int m; // 구슬 개수
	static int[] marble; // 구슬 무게
	static boolean[][] result;
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(in.readLine());
		
		arr = new int[n];
		st = new StringTokenizer(in.readLine());
		for(int i = 0; i< n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		m = Integer.parseInt(in.readLine());
		marble = new int[m];
		st = new StringTokenizer(in.readLine());
		for(int i = 0; i<m; i++) {
			marble[i]  = Integer.parseInt(st.nextToken());
		}
		
		result = new boolean[n+1][40001];
		subset(0,0);
		for(int i : marble) {
			if(result[n][i]) System.out.print("Y");
			else System.out.print("N");
			System.out.print(" ");
		}
		
	}
	
	public static void subset(int idx, int total) {
		if(total >= 0 && result[idx][total]) return;
		if(total >= 0) result[idx][total] =true;
		if(idx == n) {
			return;
		}
		subset(idx+1, total+arr[idx]);
		subset(idx+1, total-arr[idx]);
		subset(idx+1, total);
	}

}
