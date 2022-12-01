import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_1928 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st ;

		int t = Integer.parseInt(in.readLine().trim());

		for(int tc = 1; tc <= t; tc++) {
			int n = Integer.parseInt(in.readLine());
			String str = "";
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(in.readLine());
				String s = st.nextToken(); 
				int k = Integer.parseInt(st.nextToken());
				for(int j = 0; j < k; j++) {
					str +=s;
				}
				
				
			}
		}
	}
}


