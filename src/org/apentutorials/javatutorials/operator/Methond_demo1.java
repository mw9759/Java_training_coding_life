package org.apentutorials.javatutorials.operator;
//메소드 실습
public class Methond_demo1 {
	
	public static void numbering() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
	public static void numbering2(int limit) { //정수만 들어올 수 있다-->매개변수/파라미터
        int i = 0;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }
	public static void numbering3(int init, int limit) {
        int i = init;
        while (i < limit) {
            System.out.println(i);
            i++;
        }
    }
	
	public static String numbering4(int init, int limit) { //메소드명 앞에 string은 리턴값이 반드시 문자열이라는 것을 의미한다.
        int i = init;
        // 만들어지는 숫자들을 output이라는 변수에 담기 위해서 변수에 빈 값을 주었다.
        String output = "";
        while (i < limit) {
            // 숫자를 화면에 출력하는 대신 변수 output에 담았다.
            output += i;
            i++;
        }
        // 중요!!! output에 담겨 있는 문자열을 메소드 외부로 반환하려면 아래와 같이 return 키워드 뒤에 반환하려는 값을
        // 배치하면 된다.
        return output;
    }
	
	public static String[] getMembers() {
        String[] members = { "최진혁", "최유빈", "한이람" };
        return members;
    }
	
	public static void main(String[] args) {//메소드 앞의 void는 리턴값이 없다는 것을 명시한다.
		//numbering(); //메쏘드(함수)호출
		//numbering2(5);//입력값은-->인자, 아규먼트
		//numbering3(1, 5);
		// 메소드 numbering이 리턴한 값이 변수 result에 담긴다.
        String result = numbering4(1, 5);
        // 변수 result의 값을 화면에 출력한다.
        System.out.println(result);
        String[] members = getMembers();
	}

} 
