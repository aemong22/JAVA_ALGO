import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		String[] arr = new String[n-m+1];
		int start = m;
		for(int i = 0; i < n-m+1; i++) {
			arr[i] = Integer.toString(start++);
		}
		
		Arrays.sort(arr, new Comparator<String>(){
			@Override
			public int compare(String n1, String n2) {
				String[] s1 = n1.split("");
				String[] s2 = n2.split("");
				String str1 = "";
				String str2 = "";
				for(int i = 0; i <s1.length; i++) {
					if(s1[i].equals("0")) str1+="zero";
					if(s1[i].equals("1")) str1+="one";
					if(s1[i].equals("2")) str1+="two";
					if(s1[i].equals("3")) str1+="three";
					if(s1[i].equals("4")) str1+="four";
					if(s1[i].equals("5")) str1+="five";
					if(s1[i].equals("6")) str1+="six";
					if(s1[i].equals("7")) str1+="seven";
					if(s1[i].equals("8")) str1+="eight";
					if(s1[i].equals("9")) str1+="nine";
				}
				for(int i = 0; i <s2.length; i++) {
					if(s2[i].equals("0")) str2+="zero";
					if(s2[i].equals("1")) str2+="one";
					if(s2[i].equals("2")) str2+="two";
					if(s2[i].equals("3")) str2+="three";
					if(s2[i].equals("4")) str2+="four";
					if(s2[i].equals("5")) str2+="five";
					if(s2[i].equals("6")) str2+="six";
					if(s2[i].equals("7")) str2+="seven";
					if(s2[i].equals("8")) str2+="eight";
					if(s2[i].equals("9")) str2+="nine";
				}
				return str1.compareTo(str2);
			}

		});
		
		for(int i = 0; i < n-m+1; i++) {
			if(i != 0 && i % 10 == 0) {
				System.out.println();
			}
			System.out.print(arr[i]+" ");
		}
		
	}

}
