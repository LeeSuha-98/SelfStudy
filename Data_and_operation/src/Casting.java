
public class Casting {
	//캐스팅 예제
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a = 1.1;
		double b = 1; //1은 정수형이지만 double안에 담긴다. 이렇게 되면 b는 1.0이 출력된다.
		double b2 = (double)1;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(b2);  //1.0으로 출력 됨
		
		// int c = 1.1; --> 실수형은 정수타입에 담기지 않는다
		double d = 1.1;
		int e = (int) 1.1; // 이게 int e = 1.1이라고 할때 생기는 해결 방법중 하나
		                   // add cast to int라고 int형으로 강제 형변환 시켜주는 방법이다.
		System.out.println(d);
		System.out.println(e);
		
		// 1 to String
		String g = Integer.toString(1);
		System.out.println(g);
				
	}

}
