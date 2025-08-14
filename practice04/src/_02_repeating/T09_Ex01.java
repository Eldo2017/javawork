package _02_repeating;

import java.util.Scanner;

public class T09_Ex01 {

	public static void main(String[] args) {
		// 1. 사용자로부터 국어, 영어, 수학 점수를 입력받아 
		// 세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어, 영어, 수학 점수 : ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		int avg = (kor + eng + math) / 3;
		System.out.println("총점 : " + (kor + eng + math));
		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		
		System.out.println("---------------------------");
		
		// 2. id와 비밀번호를 변수에 저장하고
		// 사용자로부터 아이디와 비밀번호를 입력 받아
		// 아이디와 비밀번호가 모두 맞으면 "로그인 성공"출력
		// 아이디가 틀렸으면 "아이디가 틀렸습니다"출력
		// 비밀번호가 틀렸으면 "비밀번호가 틀렸습니다"출력
		
		String id1 = "Eldorado";
		String passwd1 = "Caries6201";
		
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String passwd = sc.next();
		
		if(id.equals(id1) && passwd.equals(passwd1)) {
			System.out.println("로그인 성공");
		}
		else if(!id.equals(id1)) {
			System.out.println("아이디가 틀렸습니다");
		}
		else if(!passwd.equals(passwd1)) {
			System.out.println("비밀번호가 틀렸습니다");
		}
		
		System.out.println("---------------------------");
		
		/*
		 * 3. 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 
		 * 따라 저체중/정상체중/과체중/비만을 출력하세요.
		 * 
		 * - BMI = 몸무게 / (키(m) * 키(m))
		 * 
		 * BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중 
		 * BMI가 23이상 25미만일 경우 과체중 / 25이상
		 * 30미만일 경우 비만 BMI가 30이상일 경우 고도 비만
		 */
		
		System.out.print("키, 몸무게 : ");
		
		double height = sc.nextDouble();
		double weight = sc.nextDouble();
		
		// cm -> m
		double height2 = height / 100.0;
		
		double BMI = weight / (height2 * height2);
		
		System.out.println("당신의 체중 BMI : " + BMI);
		if(BMI < 18.5) System.out.println("저체중");
		else if(BMI >= 18.5 && BMI < 23) System.out.println("정상체중");
		else if(BMI >= 23 && BMI < 25) System.out.println("과체중");
		else if(BMI >= 25 && BMI < 30) System.out.println("비만");
		else if(BMI >= 30) System.out.println("고도 비만");
		
		System.out.println("---------------------------");
		
		
		/**
		 * 4. 중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력 평가 비율은 중간고사 20%, 기말고사 30%,
		 * 과제 30%, 출석 20%로 이루어져 있고 이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산.
		 * 70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력
		 * 
		 * ex) 1. 중간고사 점수 : 80 기말고사 점수 : 30 과제 점수 : 70 출석 회수 : 18 ============= 결과
		 * ============ 중간 고사 점수(20) : 16.0 기말 고사 점수(30) : 9.0 과제 점수(30) : 18.0 출석
		 * 점수(20) : 18.0 총점 : 61.0 Fail [점수 미달]
		 * 
		 * ex) 2. 중간고사 점수 : 80 기말고사 점수 : 90 과제 점수 : 50 출석 회수 : 15 ============= 결과
		 * ============ 중간 고사 점수(20) : 16.0 기말 고사 점수(30) : 27.0 과제 점수(30) : 15.0 출석
		 * 점수(20) : 15.0 총점 : 73.0 Pass
		 * 
		 * ex) 3. 중간고사 점수 : 100 기말고사 점수 : 80 과제 점수 : 40 출석 회수 : 10 ============= 결과
		 * ============ Fail [출석 횟수 부족(10/20)]
		 */
		
		System.out.print("중간고사 점수 : ");
		int midterm = sc.nextInt();
		System.out.print("기말고사 점수 : ");
		int finterm = sc.nextInt();
		System.out.print("과제 점수 : ");
		int task = sc.nextInt();
		System.out.print("출석 횟수 : ");
		int attendence = sc.nextInt();
		
		System.out.println("=============== 결과 ================");
		double final_mid = (double)midterm * 0.2; // 100점 만점에 20점 만점
		double final_fin = (double)finterm * 0.3; // 100점 만점에 30점 만점
		double final_task = (double)task * 0.3; // 100점 만점에 30점 만점
		double final_attd = (double)attendence; // 20회 만점에 1회당 1점 누적
		
		double total = final_mid + final_fin + final_task + final_attd;
		
		
		
		if(attendence < 14) System.out.print("Fail [출석 횟수 부족(" + attendence +"/20)]");
		else {
			System.out.printf("중간고사 점수(20) : %.1f\n", final_mid);
			System.out.printf("기말고사 점수(30) : %.1f\n", final_fin);
			System.out.printf("과제 점수(30) : %.1f\n",  final_task);
			System.out.printf("출석 점수(20) : %d\n", final_attd);
			
			System.out.printf("총점 : %.1f" , total);
			if(total < 70) System.out.println("Fail [점수 미달]");
			
			else System.out.println("Pass");
		}
	}
}
