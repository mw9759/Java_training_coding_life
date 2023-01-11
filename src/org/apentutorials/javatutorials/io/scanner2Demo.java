package org.apentutorials.javatutorials.io;

import java.util.Scanner;

public class scanner2Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) { //정수형이라면 계속 반복
            System.out.println(sc.nextInt()*1000); 
        }
        sc.close(); // 입력을 그만 받겠다. 닫아버림
        
	}

}
