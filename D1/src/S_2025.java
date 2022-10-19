import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S_2025 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		
		int a = 0;
		for(int i  = 1; i <=n;i++) {
			a+=i;
		}
		System.out.println(a);

	}

}
