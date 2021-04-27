package day2;

import java.util.Scanner;

public class Test2_3 {

	public static void main(String[] args) {
		/*
		 * 국어 성적을 입력받고 국어 과목을 패스했는지 안했는지 확인하는 코드를 작성하세요.
		 * 국어 성적이 60점 미만이라면 Fail, 국어 성적이 60점 이상이면 Pass
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt();
//		
//		String result = (num >= 60) ? "Pass" : "Fail";
//		System.out.println(result);
		
		/*
		 * 국어 성적이 A학점인지 아닌지를 판별하는 코드를 작성하세요.
		 * A학점은 90점 이상 100점 이하
		 * 
		 */
		int num = sc.nextInt();
		
		String result = (num >= 90 && num <= 100) ? "A학점" : "아님";
		System.out.println(result);
		
		sc.close();
	}

}
