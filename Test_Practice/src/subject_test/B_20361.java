package subject_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_20361 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		// n개의 컵  - 두 컵의 위치 바꾸기 k 번  - 공이 몇번째에 있는지 알려주는 프로그램
		int n = Integer.parseInt(st.nextToken()); // 컵의 개수
		int x =  Integer.parseInt(st.nextToken()); // 처음 공의 위치
		int k = Integer.parseInt(st.nextToken()); // k번 컵 바꿈.
		
		for(int i = 0 ; i < k ; i++) {
			 st = new StringTokenizer(in.readLine());
			 int cup1 = Integer.parseInt(st.nextToken());
			 int cup2 = Integer.parseInt(st.nextToken());
			 
			 if(cup1 == x){
				 x = cup2;
			 }
			 else if(cup2 == x) {
				 x= cup1;
			 }
		}
		
		System.out.println(x);
		
		
	
	}

}
