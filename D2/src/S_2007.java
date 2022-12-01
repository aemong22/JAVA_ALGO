import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S_2007 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(in.readLine().trim());
		
		for(int tc = 1; tc<= t; tc++) {
			String str = in.readLine().trim();
			int ans = 0;
			for(int i = 1; i < str.length(); i++) {
				String slice = str.substring(0, i);
				int re = 30 % i;
				String str2 = str.substring(0,str.length()-re);
				if(str.startsWith(slice+slice+slice)&& str2.endsWith(slice)) {
					ans = i;
					break;
				}
			}
			sb.append("#"+tc+" "+ans+"\n");
		}
		
		System.out.println(sb);
		

	}

}
