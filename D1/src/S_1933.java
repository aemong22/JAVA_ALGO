import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S_1933 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		
		for(int i = 1; i <= n; i++) {
			if(n%i == 0) {
				System.out.print(i+" ");
			}
		}
	}
}
