package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
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
		long Max = Arrays.stream(num).max().getAsInt();
		long Min = 1;
		
		//만든 랜선 갯수

		while(Min <= Max) {
			int count = 0;
			long mid = (Max+Min)/2;
			for(int i : num) {
				count += i/mid;
			}
			
			if(count >=  n) {
				Min = mid+1;
			}
			else { 
				Max = mid-1;
			}
		}
		
		System.out.println(Max);
		
	}

}
