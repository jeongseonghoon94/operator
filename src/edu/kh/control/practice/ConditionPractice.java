package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �� �� �Է��ϼ���.");
		int input=sc.nextInt();
		
		String result;
		
		if(input<0) {
			result = "����� �Է����ּ���.";
		}else if(input % 2 == 0) {
			result = "¦���Դϴ�.";
		}else {
			result = "Ȧ���Դϴ�.";
		}
		System.out.println(result);
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� : ");
		int kor = sc.nextInt();
		
		System.out.print("�������� : ");
		int math = sc.nextInt();
		
		System.out.print("�������� : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		
		double avg = sum / 3.0;
		
		
		if(math < 40 || eng < 40 || kor < 40 || avg < 60) {
			System.out.println("���հ��Դϴ�.");
		}else {
			System.out.printf("���� : %d\n���� : %d\n���� : %d\n�հ� : %d\n��� : %.1f\n�հ��Դϴ�." 
					, kor, math, eng, sum, avg);
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12������ ���� �Է� : ");
		int input = sc.nextInt();
		
		switch(input) {
		
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			System.out.println(input + "���� 31�ϱ��� �ֽ��ϴ�.");break;
		case 2 :
			System.out.println(input + "���� 28�ϱ��� �ֽ��ϴ�.");break;
		case 4 : case 6: case 9 : case 11 :
			System.out.println(input + "���� 30�ϱ��� �ֽ��ϴ�.");break;
		default :
			System.out.println(input + "���� �߸� �Էµ� ���Դϴ�.");
			
		}
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű(m)�� �Է��� �ּ���. : ");
		double tall = sc.nextDouble();
		
		System.out.print("������(kg)�� �Է��� �ּ���. : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (tall * tall);
		
		if(bmi < 18.5) {
			System.out.printf("BMI ���� : %f\n��ü��" , bmi);
		}else if(bmi < 23) {
			System.out.printf("BMI ���� : %f\n����ü��" , bmi);
		}else if(bmi < 25) {
			System.out.printf("BMI ���� : %f\n��ü��" , bmi);
		}else if(bmi < 30) {
			System.out.printf("BMI ���� : %f\n��" , bmi);
		}else {
			System.out.printf("BMI ���� : %f\n�� ��" , bmi);
		}
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�߰� ��� ����(20) : ");
		int test1 = sc.nextInt();
		
		System.out.print("�⸻ ��� ����(30) : ");
		int test2 = sc.nextInt();
		
		System.out.print("���� ����(30) : ");
		int score1 = sc.nextInt();
		
		System.out.print("�⼮ ����(20) : ");
		int score2 = sc.nextInt();
		
		double avg1 = test1 * (20/100);
		double avg2 = test2 * (30/100);
		double avg3 = score1 * (30/100);
		double sum = avg1 + avg2 + avg3 + score2;
		
		if(sum < 70) {
			
			System.out.printf("�߰� ��� ����(20) : %.1f\n" , avg1);
			System.out.printf("�⸻ ��� ����(30) : %.1f\n" , avg2);
			System.out.printf("���� ����(30) : %.1f\n" , avg3 );
			System.out.printf("�⼮ ����(20) : %.1f\n" , score2);
			System.out.printf("���� : %.1f\n", sum);
			System.out.println("Fail [���� �̴�]");
			
		}else if(score2 <= 6) {
			System.out.printf("Fail [�⼮ Ƚ�� ���� (%d/20)", score2);
			
		}else if(score2 <=6 && sum > 70) {
			System.out.print("Fail [�⼮ Ƚ�� ����, ���� �̴�]");
			
		}else {
			System.out.printf("�߰� ��� ����(20) : %.1f\n" , avg1);
			System.out.printf("�⸻ ��� ����(30) : %.1f\n" , avg2);
			System.out.printf("���� ����(30) : %.1f\n" , avg3 );
			System.out.printf("�⼮ ����(20) : %.1f\n" , score2);
			System.out.printf("���� : %.1f\n", sum);
			System.out.println("PASS");
		}
		
			
	}

}
