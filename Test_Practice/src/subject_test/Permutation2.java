package subject_test;

public class Permutation2 {

	static int[] arr; // 배열
	static int n; // 배열의 크기
	static int r ;// 뽑을 갯수
	static int[] answer;
	public static void main(String[] args) {
		arr = new int[] {1,2,3};
		n = arr.length;
		r = 2;
		answer = new int[r];
		permutation(0);
	}
	
	public static void permutation(int cnt) {
		if(cnt == r) {
			for(int x : answer) {
				System.out.print(x+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i < n ; i++) {
			answer[cnt] = arr[i];
			permutation(cnt+1);
		}

	}

}
