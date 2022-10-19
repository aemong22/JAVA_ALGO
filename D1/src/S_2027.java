
public class S_2027 {
	public static void main(String[] args) {
		int a = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(a == j) System.out.print("#");
				else System.out.print("+");
			}
			System.out.println();
			a++;
		}
	}
}
