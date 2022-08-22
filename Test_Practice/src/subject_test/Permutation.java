package subject_test;

public class Permutation {
	static int[] arr; // 뽑고자 하는 배열
	static int n = 3; // 배열 크기
	static int r = 2; // 뽑을 갯수
	static int[] answer =  new int[2]; // 뽑을 숫자를 담을 배열
	static boolean[] visited = new boolean[n]; // 배열의 방문 여부 체크

	public static void main(String[] args) {
		arr = new int[] {1,2,3};
		permutation(0);

	}
	
	private static void permutation(int cnt) {
		if(cnt == 2) {
			for(int x : answer) {
				System.out.print(x+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i < n; i++ ) {
			if(!visited[i]) {
				visited[i] = true;
				answer[cnt]  = arr[i];
				permutation(cnt+1);
				visited[i] = false;
				
			}
		}
	}

}
