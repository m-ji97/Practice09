package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Goods> glist = new ArrayList<Goods>();
		//ArrayList 사용

		String name;
		int price =0;
		int num = 0;
		int count = 0;
		String e;

		System.out.println("상품을 입력해주세요(종료 q)");
		while(true){
			e = sc.nextLine();
			
			if(e.equals("q")) {
				System.out.println("[입력완료]");
				break;
			}
			String[] gArray = e.split(",");
			name = gArray[0];
			num = Integer.parseInt(gArray[1]);
			count = Integer.parseInt(gArray[2]);
			
			Goods goods = new Goods(name, num, count);
			glist.add(goods);
			
				price= count+count ;
		}
		System.out.println("===================");
		
		for(int i = 0; i<glist.size(); i++) {
			glist.get(i).showinfo();
		}
		
		System.out.println("모든 상품의 갯수는 "+price+ "개 입니다.");


					//상품 입력


					sc.close();  


			/*
			 * 1. ArrayList<goods>를 만들고
			 * 2. 스캐너를 선언한다
			 * 3. while반복을 무조건 true돌리고
			 * 4. 반복문안에다가 스캐너 한거를 nextline계속 돌거임
			 * 5. 도는과정에 스캐너 받은것중에서 q라는 애가 나오면 입력완료라고 뜨게하고
			 * 6. String[]배열써서 스캐너입력받은걸 넣고
			 * 7. split으로 ,콤마 구분 때리면
			 * 8. ['','',''] 이 형태가 만들어 질 거임
			 * 9. 변수가 3개 만들어서
			 * 10. 하나는 String[]만든거에 0번 상품명이 들어간다 이걸 두번한다
			 * 11. string형이라 형변환 해주어야함
			 * 12. Goods객체에다가 생성자 데이터를 넣어줌
			 * 13. 얘를 glist에다가 add때린다	
			 * 14. for반복문으로 glist의 크기만큼 돌리고
			 * 15. glist.get(i).showinfo하면 얘가 개수만큼 돌리면서 출력할거임	 * */
		}

	}
