package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요.");
		int input=sc.nextInt();
		
		String result;
		
		if(input<0) {
			result = "양수만 입력해주세요.";
		}else if(input % 2 == 0) {
			result = "짝수입니다.";
		}else {
			result = "홀수입니다.";
		}
		System.out.println(result);
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		
		double avg = sum / 3.0;
		
		
		if(math < 40 || eng < 40 || kor < 40 || avg < 60) {
			System.out.println("불합격입니다.");
		}else {
			System.out.printf("국어 : %d\n수학 : %d\n영어 : %d\n합계 : %d\n평균 : %.1f\n합격입니다." 
					, kor, math, eng, sum, avg);
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12사이의 정수 입력 : ");
		int input = sc.nextInt();
		
		switch(input) {
		
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			System.out.println(input + "월은 31일까지 있습니다.");break;
		case 2 :
			System.out.println(input + "월은 28일까지 있습니다.");break;
		case 4 : case 6: case 9 : case 11 :
			System.out.println(input + "월은 30일까지 있습니다.");break;
		default :
			System.out.println(input + "월은 잘못 입력된 달입니다.");
			
		}
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요. : ");
		double tall = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요. : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (tall * tall);
		
		if(bmi < 18.5) {
			System.out.printf("BMI 지수 : %f\n저체중" , bmi);
		}else if(bmi < 23) {
			System.out.printf("BMI 지수 : %f\n정상체중" , bmi);
		}else if(bmi < 25) {
			System.out.printf("BMI 지수 : %f\n과체중" , bmi);
		}else if(bmi < 30) {
			System.out.printf("BMI 지수 : %f\n비만" , bmi);
		}else {
			System.out.printf("BMI 지수 : %f\n고도 비만" , bmi);
		}
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수(20) : ");
		int test1 = sc.nextInt();
		
		System.out.print("기말 고사 점수(30) : ");
		int test2 = sc.nextInt();
		
		System.out.print("과제 점수(30) : ");
		int score1 = sc.nextInt();
		
		System.out.print("출석 점수(20) : ");
		int score2 = sc.nextInt();
		
		double avg1 = test1 * (20/100);
		double avg2 = test2 * (30/100);
		double avg3 = score1 * (30/100);
		double sum = avg1 + avg2 + avg3 + score2;
		
		if(sum < 70) {
			
			System.out.printf("중간 고사 점수(20) : %.1f\n" , avg1);
			System.out.printf("기말 고사 점수(30) : %.1f\n" , avg2);
			System.out.printf("과제 점수(30) : %.1f\n" , avg3 );
			System.out.printf("출석 점수(20) : %.1f\n" , score2);
			System.out.printf("총점 : %.1f\n", sum);
			System.out.println("Fail [점수 미달]");
			
		}else if(score2 <= 6) {
			System.out.printf("Fail [출석 횟수 부족 (%d/20)", score2);
			
		}else if(score2 <=6 && sum > 70) {
			System.out.print("Fail [출석 횟수 부족, 점수 미달]");
			
		}else {
			System.out.printf("중간 고사 점수(20) : %.1f\n" , avg1);
			System.out.printf("기말 고사 점수(30) : %.1f\n" , avg2);
			System.out.printf("과제 점수(30) : %.1f\n" , avg3 );
			System.out.printf("출석 점수(20) : %.1f\n" , score2);
			System.out.printf("총점 : %.1f\n", sum);
			System.out.println("PASS");
		}
		
			
	}

}
