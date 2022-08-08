package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2775 {

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int t = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(in.readLine());
			int floor = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(in.readLine());
			int room = Integer.parseInt(st.nextToken());
			
			int[] apt = new int[room];
			
			for(int j = 0; j < room ; j++) {
				apt[j] = j+1;
			}
			
			for(int j = 0; j < floor; j++) {
				for(int z = 1;  z < room ; z++ ) {
					apt[z] += apt[z-1];
				}
			}
			
			sb.append(apt[room-1]+"\n");
		}
		
		System.out.println(sb);
	
	}
	
	

}
