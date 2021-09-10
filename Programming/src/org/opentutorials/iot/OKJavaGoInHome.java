package org.opentutorials.iot;
import org.opentutorials.iot.Elevator; 
import org.opentutorials.iot.Security;

public class OKJavaGoInHome {
	//IOT 가짜코드로 맛보기
	
	public static void main(String[] args) {
		// Elevator call (엘리베이터를 미리 대기시켜 놓기)
		Elevator myElevator = new Elevator("JAVA APT 507");  // myElevator는 변수, Elevator는 마이 엘리베이터의 데이터 타입이다.
		myElevator.callForUp(1);		
		
		// Security off (세큐리티 꺼 놓기)
		Security mySecurity = new Security("JAVA APT 507");
		mySecurity.off(); // 괄호로 시작해서 괄호로 끝나는 명령은 메소드!
		
		// Light on (불 켜놓기)
		Lighting myLighting = new Lighting("JAVA APT 507");
		myLighting.on();
		
	}

}
