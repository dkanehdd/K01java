package quiz;

import java.util.Random;
import java.util.Scanner;

public class Puzzle {
	
	static Scanner s = new Scanner(System.in);
	static Random rd = new Random();
	static char[][] puzzle = {{'1','2','3'},{'4','5','6'},{'7','8','X'}};
	static char[][] puzzle1 = {{'1','2','3'},{'4','5','6'},{'7','8','X'}};
	
	static void showBoard() {
		for(int i=0 ; i<puzzle.length ; i++) {
			for(int j=0 ; j<puzzle[i].length ; j++) {
				System.out.print(puzzle[i][j]+" ");
			}
			System.out.println();
		}
	}
	static boolean end() {
		int cnt=0;
		for(int i=0 ; i<puzzle.length ; i++) {
			for(int j=0 ; j<puzzle[i].length ; j++) {
				if(puzzle[i][j]==puzzle1[i][j]) {
					cnt++;
				}
			}
		}
		if(cnt==9) {
			return true;
		}else
			return false;
	}
	static void Suffle() {
		for(int s=1 ; s<=100 ; s++) {
			int rdNum = rd.nextInt(4);
			String move ="";
			if(rdNum==0) {
				move="a";
			}else if(rdNum==1){
				move="s";
			}else if(rdNum==2) {
				move="d";
			}else if(rdNum==3) {
				move="w";
			}
			int x=-1, y=-1;
			for(int i=0 ; i<puzzle.length ; i++) {
				for(int j=0 ; j<puzzle[i].length ; j++) {
					if(puzzle[i][j]=='X') {
						x=i;
						y=j;
					}
				}
			}
			if(move.equalsIgnoreCase("d")) {
				if(y+1>2) {
				}
				else {
					puzzle[x][y]=puzzle[x][y+1];
					puzzle[x][y+1]='X';
				}
			}else if(move.equalsIgnoreCase("a")) {
				if(y-1<0) {
				}
				else {
					puzzle[x][y]=puzzle[x][y-1];
					puzzle[x][y-1]='X';
				}
			}else if(move.equalsIgnoreCase("s")) {
				if(x+1>2) {
				}
				else {
					puzzle[x][y]=puzzle[x+1][y];
					puzzle[x+1][y]='X';
				}
			}else if(move.equalsIgnoreCase("w")) {
				if(x-1<0) {
				}
				else {
					puzzle[x][y]=puzzle[x-1][y];
					puzzle[x-1][y]='X';
				}
				
			}
		}
	}
	static void Puzzle3_3() {
		Suffle();
		while(true) {
			
			
			showBoard();
			
			moveX();
			
			if(end()==true) {
				showBoard();
				System.out.println("성공!!");
				break;
			}
		}
		while(true) {
			System.out.println("종료하시려면 Y");
			String end = s.nextLine();
			if(end.equalsIgnoreCase("y")) {
				System.out.println("종료");
				break;
			}
			System.out.println("잘못 입력하셨습니다");
		}
		
	}
	static void moveX() {
		
		int x=-1, y=-1;
		for(int i=0 ; i<puzzle.length ; i++) {
			for(int j=0 ; j<puzzle[i].length ; j++) {
				if(puzzle[i][j]=='X') {
					x=i;
					y=j;
				}
			}
		}
		System.out.println("이동할키 입력");
		String move = s.nextLine();
		if(move.equalsIgnoreCase("d")) {
			if(y+1>2) {
				System.out.println("잘못 입력하셨습니다");
				moveX();
			}
			else {
				puzzle[x][y]=puzzle[x][y+1];
				puzzle[x][y+1]='X';
			}
		}else if(move.equalsIgnoreCase("a")) {
			if(y-1<0) {
				System.out.println("잘못 입력하셨습니다");
				moveX();
			}
			else {
				puzzle[x][y]=puzzle[x][y-1];
				puzzle[x][y-1]='X';
			}
		}else if(move.equalsIgnoreCase("s")) {
			if(x+1>2) {
				System.out.println("잘못 입력하셨습니다");
				moveX();
			}
			else {
				puzzle[x][y]=puzzle[x+1][y];
				puzzle[x+1][y]='X';
			}
		}else if(move.equalsIgnoreCase("w")) {
			if(x-1<0) {
				System.out.println("잘못 입력하셨습니다");
				moveX();
			}
			else {
				puzzle[x][y]=puzzle[x-1][y];
				puzzle[x-1][y]='X';
			}
			
		}else {
			System.out.println("잘못 입력하셨습니다");
			moveX();
		}
	}
	public static void main(String[] args) {
		Puzzle3_3();
	}

}
