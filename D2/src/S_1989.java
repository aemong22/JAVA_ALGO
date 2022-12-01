import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S_1989 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(in.readLine());
		for(int tc = 1; tc<=t ; tc++) {
			String str = in.readLine().trim();
			String rts = "";
			for(int i = str.length()-1; i >= 0; i-- ) {
				rts += str.charAt(i);
			}
			
			if(str.equals(rts)) sb.append("#"+tc+" "+1+"\n");
			else sb.append("#"+tc+" "+0+"\n");
		}
		System.out.println(sb);
	}

}
