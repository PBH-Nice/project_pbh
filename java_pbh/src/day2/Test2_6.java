package day2;

import java.util.Scanner;

public class Test2_6 {

	public static void main(String[] args) {
		/*
		 * 성적을 입력받아 입력받은 성적을 출력하는 코드를 작성하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		if(num < 0 || num > 100) {
			System.out.println("잘못된 성적입니다.");
		} else if(num >= 90) {
			System.out.println("A");
		} else if(num >= 80) {
			System.out.println("B");
		} else if(num >= 70) {
			System.out.println("C");
		} else if(num >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
