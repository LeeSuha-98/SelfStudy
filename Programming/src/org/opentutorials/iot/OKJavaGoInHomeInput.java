package org.opentutorials.iot;

public class OKJavaGoInHomeInput {
	//IOT 가짜코드로 맛보기
	
	public static void main(String[] args) {
		
		//String id = JOptionPane.showInputDialog("Enter a ID"); 이 코드로 조그마한 상자가 나오고 어떠한 값을 입력할때까지 
	    //자바는 멈춰져있으며, 입력하게 되면 ID가 적용된다.
		String id = args[0];
		String bright = args[1];
				
		//String bright = JOptionPane.showInputDialog("Enter a Bright");
		
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
		
		DimmingLights moodLamp = new DimmingLights(id+"moodLamp");
		moodLamp.setBright(Double.parseDouble(bright)); // n%만큼 밝기가 조절된다.
		moodLamp.on();
		
	}

}
