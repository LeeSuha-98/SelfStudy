
public class StringApp {

	public static void main(String[] args) {
		System.out.println("Hello World"); //String 
		System.out.println('H'); //Character = 한 글자만 표현
		System.out.println("H"); 
		//다른 언어에서는 작은 따옴표 허용인데 자바에선 특수한 데이터 타입을 가르킴
		
		System.out.println("Hello"
		                  +"World");
		System.out.println("Hello \nWorld"); //n은 new line의 약자
	  //System.out.println("Hello "World""); --> Hello "World" 라는 텍스트를 갖고 싶을 때
		 									 // "Hello "World""라고 쓰면 에러가 뜬다.
		System.out.println("Hello \"World\""); //이렇게 중간에 슬래시를 넣으면 제대로 출력
		
	}

}
