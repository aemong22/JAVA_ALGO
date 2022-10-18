import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S_2050 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] str = in.readLine().split("");
		
		for(String s : str) {
			System.out.print(s.charAt(0)-64 +" ");
		}
		
	}

}
