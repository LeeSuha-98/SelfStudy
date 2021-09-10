public class Variable {
	//변수에 관련 정리
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //자바에서는 a=1; 이라고만 하면 에러가 뜸. 데이터 타입을 명시,지정해 줘야 한다.
		int a = 1; //Number -> Integer
		System.out.println(a);
		//int b = 1.1; 이라고 하면 에러가 나는 이유는 b에는 정수만 올 수 있는데 1.1은 정수가 아니여서
		double b = 1.1; // ex) -2.0, -1.7...
		System.out.println(b);
		
		String c = "Hello World"; // 문자열일경우에는 String 사용
		System.out.println(c);
		
		//생활코딩에서 든 예시는 자바에서 데이터 타입을 명시해 주는 것은 
	}

}
