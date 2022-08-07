package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class B_2108 {

	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int t = Integer.parseInt(st.nextToken());
		List<Integer> arr = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		double sum = 0;
		for(int i = 0; i<t ; i++) {
			st = new StringTokenizer(in.readLine());
			int x = Integer.parseInt(st.nextToken());
			arr.add(x);
			map.put(x, map.containsKey(x) ? map.get(x)+1 : 1);
			sum += x;
		}
		Collections.sort(arr);
		
		// 최빈수 구하기
		int max = Collections.max(map.values());
		int max_num = 0;
		
		List<Integer> keyList = new ArrayList<>(map.keySet());
		Collections.sort(keyList);
		
		List<Integer> result = new ArrayList<>();
		for(int x : keyList) {
			if(map.get(x) == max) {
				result.add(x);
			}
			
			if(result.size() == 2) {
				break;
			}
		}
		
		if(result.size() > 1) {
			max_num = result.get(1);
		}
		else {
			max_num = result.get(0);
		}
		
		
		sb.append(Math.round(1.0 * sum/t) + "\n");
		sb.append(arr.get(t/2)+"\n");
		sb.append(max_num + "\n");
		sb.append(arr.get(t-1)-arr.get(0)+ "\n");
		
		System.out.println(sb);
	}

}
