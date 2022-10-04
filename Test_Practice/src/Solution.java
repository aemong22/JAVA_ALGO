import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	private static int n;
	private static int m;
	private static int x;
	private static int y;
	private static int r;
	private static int c;
	private static int k;
	private static String[] temp;
	private static int[] dx = {0,1,0,-1};
	private static int[] dy = {-1,0,1,0};
	private static List<String> answer;

	public static void main(String[] args) throws Exception {
		n = 3;
		m = 4;
		x = 2-1;
		y = 3-1;
		r = 3-1;
		c = 1-1;
		k = 5;

		temp = new String[k];
		answer = new ArrayList<>();
		dfs(y,x,k);
		String result = "";

		if(answer.size() == 0){
			result = "impossible";
		}
		else{
			Collections.sort(answer);
			result = answer.get(0);
		}

	}
	private static void dfs(int yy, int xx, int kk) {
		if(kk == k){
			if(yy == c && xx == r){
				String word = "";
				for(String x : temp){
					word+=x;
				}
				answer.add(word);
				System.out.println("여기");
			}
			return;
		}

		for(int i = 0; i < 4 ; i++){
			System.out.println("여기");
			yy = yy + dy[i];
			xx = xx + dx[i];
			if(yy >= 0 && yy < m && xx >= 0 && xx < n ){
				if(i == 0) { 
					temp[kk] = "u";
					dfs(yy,xx,kk+1);
				}
				if(i == 1){
					temp[kk] = "r";
					dfs(yy,xx,kk+1);
				}
				if(i == 2){
					temp[kk] = "d";
					dfs(yy,xx,kk+1);
				}
				if(i == 3){
					temp[kk] = "l";
					dfs(yy,xx,kk+1);
				}
			}
		}

	}
}
