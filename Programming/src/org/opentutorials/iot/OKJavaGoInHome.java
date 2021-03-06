package org.opentutorials.iot;

public class OKJavaGoInHome {
	//IOT 가짜코드로 맛보기
	
	public static void main(String[] args) {
		
		String id = "JAVA APT 507";
		
		// Elevator call (엘리베이터를 미리 대기시켜 놓기)
		Elevator myElevator = new Elevator(id);  // myElevator는 변수, Elevator는 마이 엘리베이터의 데이터 타입이다.
		myElevator.callForUp(1);		
		
		// Security off (보안 꺼 놓기)
		Security mySecurity = new Security(id);
		mySecurity.off(); // 괄호로 시작해서 괄호로 끝나는 명령은 메소드!
		
		// Light on (불 켜놓기)
		Lighting myLighting = new Lighting(id+" / Hall Lamp");
		myLighting.on();
		
		Lighting floorLamp = new Lighting(id+" / Hall Lamp");
		floorLamp.on();
		
	}

}
