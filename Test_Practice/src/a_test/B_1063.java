package a_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_1063 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = in.readLine().split(" ");
		
		int king_x = str[0].charAt(0)- 65;
		int king_y = str[0].charAt(1)-'0';
		int stone_x = str[1].charAt(0)-65;
		int stone_y = str[1].charAt(1)-'0';
		
		int n = Integer.parseInt(str[2]);

		for(int i = 0; i < n ; i++) {
			String temp = in.readLine();
			switch(temp) {
			case "R":
				if(king_x+1 == stone_x && king_y == stone_y) {
					if(stone_x+1 < 8) {
						stone_x +=1;
						king_x+=1;
					}
					else {
						continue;
					}
				}
				else if(king_x+1 <8) {
					king_x+=1;
				}
				break;
			case "L":
				if(king_x-1 == stone_x && king_y == stone_y) {
					if(stone_x-1 >= 0) {
						stone_x -=1;
						king_x -=1;
					}
					else {
						continue;
					}
				}
				else if(king_x-1 >= 0 ) {
					king_x -=1;
				}
				break;
			
			case "B":
				if(king_y-1 == stone_y && king_x == stone_x) {
					if(stone_y-1 >= 1) {
						stone_y -=1;
						king_y -=1;
					}
					else {
						continue;
					}
				}
				else if(king_y-1 >= 1 ) {
					king_y -=1;
				}
				break;
				
			case "T":
				if(king_y+1 == stone_y && king_x == stone_x) {
					if(stone_y+1 <=8) {
						stone_y +=1;
						king_y +=1;
					}
					else {
						continue;
					}
				}
				else if(king_y+1 <=8 ) {
					king_y +=1;
				}
				break;
			
			case "RT":
				if(king_y+1 == stone_y && king_x+1 == stone_x) {
					if(stone_y+1 <=8 && stone_x+1 < 8) {
						stone_y ++; stone_x++; king_y++; king_x++;
					}
					else {
						continue;
					}
				}
				else if(king_y+1 <=8 && king_x+1 < 8 ) {
					king_y ++;
					king_x++;
				}
				break;
			case "LT":
					if(king_y+1 == stone_y && king_x-1 == stone_x) {
						if(stone_y+1 <=8 && stone_x-1 >= 0) {
							stone_y++; stone_x--; king_y++; king_x--;
						}
						else {
							continue;
						}
					}
					else if(king_y+1 <=8 && king_x-1>=0) {
						king_y++;
						king_x--;
					}
					break;
			case "RB":
				if(king_y-1 == stone_y && king_x+1 == stone_x) {
					if(stone_y-1 >=1 && stone_x+1 < 8) {
						stone_y--; stone_x++; king_y--; king_x++;
					}
					else {
						continue;
					}
				}
				else if(king_y-1 >=1 && king_x+1 < 8) {
					king_y--;
					king_x++;
				}
				break;
			case "LB":
				if(king_y-1 == stone_y && king_x-1 == stone_x) {
					if(stone_y-1 >=1 && stone_x-1 >=0) {
						stone_y--; stone_x--; king_y--; king_x--;
					}
					else {
						continue;
					}
				}
				else if(king_y-1 >=1 && king_x-1 >= 0) {
					king_y--;
					king_x--;
				}
				break;
			}
			
		}
		
		System.out.print((char)(king_x+65));
		System.out.print(king_y+"\n");
		System.out.print((char)(stone_x+65));
		System.out.print(stone_y+"\n");
	}

}
