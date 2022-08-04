package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.IntStream;

public class B_1654 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int[] num = new int[k];
		
		for(int i = 0; i<k;i++) {
			st = new StringTokenizer(in.readLine());
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		// 랜선 최대 길이
		int Max = IntStream.of(num).sum()/n;
		
		//만든 랜선 갯수
		int count = 0;

		while(true) {
			for(int i : num) {
				count += i/Max;
			}
			
			if(count >= n) {
				break;
			}
			else {
				Max--;
				count = 0;
			}
		}
		
		System.out.println(Max);
		
	}

}
