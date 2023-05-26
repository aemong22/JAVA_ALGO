package lv1;

import java.util.*;

public class 완주하지못한선수2 {

	// Hash함수 활용
    public String solution(String[] participant, String[] completion) {
        
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for(String s : participant) {
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }
        for(String s : completion) {
            hm.put(s, hm.getOrDefault(s, 0) - 1);
        }
        
        for(String s: hm.keySet()) {
            if(hm.get(s) != 0) {
                answer = s;
                break;
            }
        }
        
        
        
        return answer;
    }
}
