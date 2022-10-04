package a_test;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public int[] solution(String today, String[] terms, String[] privacies) {
		// 날짜를 숫자로 변경 
		String[] today_split = today.split(".");
		int today_y = Integer.parseInt(today_split[0]);
		int today_m = Integer.parseInt(today_split[1]);
		int today_d = Integer.parseInt(today_split[2]);

		// terms 약간 종류, 유효 기간을 구분
		int num = terms.length;
		String[][] t = new String[num][2];
		for(int i = 0 ; i < num; i++){
			String[] temp = terms[i].split(" ");
			t[i][0] = temp[0];
			t[i][1] = temp[1];
		}

		// privacies
		int tc = privacies.length;
		List<Integer> answer = new ArrayList<>();
		for(int i = 0; i < tc; i++) {
			String[] str = privacies[i].split(" ");
			String[] tdate = str[0].split(".");
			int y = Integer.parseInt(tdate[0]);
			int m = Integer.parseInt(tdate[1]);
			int d = Integer.parseInt(tdate[2]);

			// 만료 날짜 구하기
			int n = 0;
			for(int j = 0; j < num; j++) {
				if(t[j][0].equals(str[1])){
					n = Integer.parseInt(t[j][1]);
					break;

				}
			}

			d = d-1;
			if(d == 0) {
				d = 28;
				m = m -1;
			}
			m = m + n;
			if(m > 12) {
				m = m - n;
				y +=1;
			}

			// 계산
			if(y - today_y < 0) {
				// 파기해야하는 문서.
				answer.add(i+1);
			}
			else if(y-today_y == 0) {
				if(m-today_m < 0 ) {
					// 파기해야 하는 문서
					answer.add(i+1);
				}
				else if(m-today_m == 0) {
					if(d-today_d <= 0) {
						answer.add(i+1);
					}
				}
			}			
		}
		int[] result = new int[answer.size()];
		for(int j = 0; j < answer.size(); j++) {
			result[j] = answer.get(j);
		}
		return result;
	}
}
