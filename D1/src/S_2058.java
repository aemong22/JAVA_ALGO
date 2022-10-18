import java.io.BufferedReader;
import java.io.InputStreamReader;

public class S_2058 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = in.readLine().split("");
		int total = 0;
		for(String s : str) {
			total+= Integer.parseInt(s);
		}
		System.out.println(total);

	}

}
