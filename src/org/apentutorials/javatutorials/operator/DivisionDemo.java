package org.apentutorials.javatutorials.operator;

public class DivisionDemo {

	public static void main(String[] args) {
		int a = 10;
        int b = 3;
          
        float c = 10.0F;
        float d = 3.0F;
        //파이썬과 다르게 / 연사자는 몫만 출력.->결국 연산에 사용된 자료형대로 출력
        // a는 정수 b도 정수기에 연산결과도 정수로 출력->몫만 출력
        System.out.println(a/b);
        System.out.println(c/d);
        System.out.println(a/d);//a가 자동으로 float형으로 변환되어 연산
        //따라서 연산 결과도 float형으로 출력.

	}

}
