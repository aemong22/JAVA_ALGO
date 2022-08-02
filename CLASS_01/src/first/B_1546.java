package first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1546 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		String[] arr =  in.readLine().split(" ");
		double [] arr2 = new double[n];
		double sum = 0;
		int max = 0;
		for(String i : arr) {
			if (Integer.parseInt(i) > max) {
				max = Integer.parseInt(i);
			};
		}
		for(int i = 0; i<n;i++) {
			arr2[i] = (1.0*Integer.parseInt(arr[i])/max*100);
			sum+=arr2[i];
		}
		System.out.println(1.0*sum/n);
		System.out.println(max);
		
	}

}
