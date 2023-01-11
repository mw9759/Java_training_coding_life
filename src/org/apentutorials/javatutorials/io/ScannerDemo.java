package org.apentutorials.javatutorials.io;

import java.util.Scanner; //라이브러리 임포트

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //load하는 과정, 사용자가 입력할 값
        int i = sc.nextInt(); //사용자가 입력한 값 변수에 저장.
        System.out.println(i*1000);
        sc.close();

	}

}
