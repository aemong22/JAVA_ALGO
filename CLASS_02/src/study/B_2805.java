package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
import java.util.StringTokenizer;

public class B_2805 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		
		 st = new StringTokenizer(in.readLine());
		 List<Integer> tree = new ArrayList<>();
		 for(int i = 0; i < n ; i++) {
			 tree.add(Integer.parseInt(st.nextToken()));
		 }

		 Collections.sort(tree);
		 
		 long max = 2000000000;
		 long min = 0;
		 while( min <= max) {
			 long mid = ( max + min) / 2;
			 
			 long sum = 0;
			 for(int i = n-1; i >= 0 ; i--) {
				 if ( tree.get(i) > mid ) {
					 sum+= tree.get(i) - mid;
				 }
				 else {
					 break;
				 }
			 }
			 
			 if(sum > m) {
				 min = mid+1;
				 
			 }
			 else if (sum == m) {
				 max =mid;
				 break;
			 }
			 else {
				 max = mid-1;
				 
			 }
		 }
		 System.out.print(max);
	}

}
