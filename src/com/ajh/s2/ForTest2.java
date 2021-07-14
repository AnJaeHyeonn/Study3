package com.ajh.s2;

public class ForTest2 {
	public static void main(String[] args) {

		System.out.println("증감연산자");
		int num = 0;
		++num;
		System.out.println(num); //1
		
		num++;
		System.out.println(num);
		
		int check1 = ++num;
		System.out.println("Num : "+num);			//3
		System.out.println("Check1 : "+check1);		//3
		
		check1 = num++;
		System.out.println("Num : "+num);			//4
		System.out.println("Check1 : "+check1);		//3 

	}

}
