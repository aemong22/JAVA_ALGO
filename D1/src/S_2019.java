import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S_2019 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		int a = 1;
		for(int i = 0; i <= n; i++) {
			System.out.print(a+" ");
			a*=2;
		}
	}
}
