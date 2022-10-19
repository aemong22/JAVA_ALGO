import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S_1936 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		if(a==3 && b==1) {
			System.out.println("B");
		}
		else if(a > b ||  (a==1 && b == 3)) {
			System.out.println("A");
		}
		else {
			System.out.println("B");
		}
		
	}
}
