package day1;

public class Test1_1 {

	public static void main(String[] args) {
		//사과 갯수 5개를 변수에 저장 하려고 한다
		
		int apple = 5;
		System.out.println("사과의 갯수는??");
		System.out.println(apple + "개");
		
		// 수학, 국어, 영어 성적을 저장하려 한다.
		// 단, 성적은 0~100점 사이이고, 소수점은 없다
		int math = 100; 
		int national = 40; 
		int english = 50; 
		System.out.println("점수들");
		System.out.println("수학점수" + math + "점");
		System.out.println("국어점수" + national +"점");
		System.out.println("영어점수" + english + "점");
		
		// 수학, 국어, 영어 성적의 평균을 저장하려 한다.
		double average;
		System.out.println("평균은?" + math + national + english / 3);
		
		// 학생 이름을 저장하기 위한 변수를 선언하세요.
		
		String studentName;
		
		// 과학 성적의 학점을 저장하기 위한 변수를 선언하세요.
		// 단 성적은 A, B, C, D, F만 입력 사용
		
		char Science;
		
		
		// 음악 과목의 이수 여부를 확인하기 위한 변수를 선언하세요.
		
		boolean passMusic;
	}

}
