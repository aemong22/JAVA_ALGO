import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S_1545 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for(int i  = n; i >=0 ;i--) {
			System.out.print(i+" ");
		}
	}

}
