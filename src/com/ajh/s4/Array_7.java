package com.ajh.s4;

public class Array_7 {
	public static void main(String[] args) {

//		N명의 학생
//
//		한 학생 당
//		이름 번호 국어 영어 수학 총점 평균
//		3명

		String name = "iu";
		int num = 1;
		int kor = 20;
		int eng = 30;
		int math = 30;
		int total = 80;
		double avg = 26.66;

		String[] names = new String[3];
		names[0] = "재현";
		names[1] = "동구";
		names[2] = "성연";

		int[] nums = new int[3];
		nums[0] = 5;
		nums[1] = 29;
		nums[2] = 2;

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;

					String temp2 = names[j];
					names[j] = names[i];
					names[i] = temp2;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println("번호 : " + nums[i] + "   이름 : " + names[i]);
		}
	}

}
