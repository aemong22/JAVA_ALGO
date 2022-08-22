package subject_test;

public class Subset {
	static int n = 3 ; // 배열의 크기
	static boolean[] isSelected = new boolean[n]; 
	static int[] arr;

	public static void main(String[] args) {
		arr = new int[] {1,2,3};
		subset(0);
	}
	
	private static void subset(int idx) {
		if(idx == n) {
			for(int i = 0; i < n; i++) {
				if(isSelected[i]) {
					System.out.print(arr[i]+" ");
				}
			}
			System.out.println();
			return;
		}
		
		// 원소 선택시
		isSelected[idx] = true;
		subset(idx+1);
		
		// 원소 미 선택시
		isSelected[idx] = false;
		subset(idx+1);
	}

}
