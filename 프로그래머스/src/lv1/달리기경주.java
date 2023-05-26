package lv1;

import java.util.*;

public class 달리기경주 {

    public String[] solution(String[] players, String[] callings) {
        
        //시간 초과를 줄이기 위해 배열 대신 map 사용
        Map<String, Integer> rank = new HashMap<>();
        
        for(int i = 0; i < players.length; i++) {
            rank.put(players[i], i);
        }
        
        for(String s : callings) {
            // 현재 등수 가져오기.
            int curRank = rank.get(s);
            
            // 이전 사람의 등수 + 1
            rank.put(players[curRank-1], curRank);
            // 현재 사람의 등수 -1
            rank.put(players[curRank], curRank-1);
            
            // players list에서 위치 바꾸기
            String temp = players[curRank-1];
            players[curRank-1] = s;
            players[curRank] = temp;
        }
        
        return players;
    }

}
