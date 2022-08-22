package subject_test;

public class Combination {
	static int[] arr; // 배열
	static int n = 5; // 배열의 크기
	static int r = 3; // 뽑을 수
	static int[] answer; // 뽑은 수를 넣을 배열
	
	public static void main(String[] args) {
		arr = new int[]{1,2,3,4,5};
		answer = new int[r];
		combination(0,0);

	}
	
	static void combination(int cnt, int start) {
		
		if(cnt == r) {
			for(int x : answer) {
				System.out.print(x+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i = start; i < n; i++) {
			answer[cnt] = arr[i];
			combination(cnt+1, i+1);
		}
	}
}
