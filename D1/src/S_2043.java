import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_2043 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int p = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		if(p >= k) {
			System.out.println(p-k+1);
		}
		else {
			System.out.println(1000-k+p+1);
		}

	}

}
