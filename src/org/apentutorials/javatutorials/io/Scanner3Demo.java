package org.apentutorials.javatutorials.io;

import java.util.Scanner;
import java.io.*;

public class Scanner3Demo {

	public static void main(String[] args) {
		
		try { //우선 시도
            File file = new File("out.txt"); //파일 변수형 선언 / 불러오기 -->파일명 대소문자 구분 안하는듯?
            Scanner sc = new Scanner(file); //파일을 입력값으로 활용가능/가져오기
            while(sc.hasNextInt()) { //만약 파일의 내용이 정수형이라면
                System.out.println(sc.nextInt()*1000); 
            }
            sc.close();
        } catch(FileNotFoundException e){ //시도해서 안됬을때. PYTHON의 except: 랑 같다.
            e.printStackTrace();
        }
		
	}

}
