package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		
		ArrayList<Friend> flist = new ArrayList<Friend>();
		
		String friend;
		String[] fArray;
		
		System.out.println("친구를 3명 등록해 주세요");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			friend = sc.nextLine();
			fArray = friend.split(" ");
			Friend f = new Friend(fArray[0], fArray[1], fArray[2]);
			flist.add(f);
		}
		for(int i = 0; i<flist.size(); i++) {
			flist.get(i).draw();
		}
		sc.close();
	}

}
