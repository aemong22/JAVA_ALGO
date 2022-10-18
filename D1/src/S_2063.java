import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S_2063 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("2063.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int n = Integer.parseInt(in.readLine());
		int[] num = new int[n];
		st = new StringTokenizer(in.readLine());
		for(int tc = 0; tc < n; tc++) {
			num[tc] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(num);
		System.out.println(num[n/2]);
	}
}
