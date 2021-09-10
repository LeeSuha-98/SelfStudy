package org.opentutorials.iot;
import org.opentutorials.iot.Elevator; 
import org.opentutorials.iot.Security;

public class OKJavaGoInHome {
	//IOT ��¥�ڵ�� ������
	
	public static void main(String[] args) {
		// Elevator call (���������͸� �̸� ������ ����)
		Elevator myElevator = new Elevator("JAVA APT 507");  // myElevator�� ����, Elevator�� ���� ������������ ������ Ÿ���̴�.
		myElevator.callForUp(1);		
		
		// Security off (��ť��Ƽ �� ����)
		Security mySecurity = new Security("JAVA APT 507");
		mySecurity.off(); // ��ȣ�� �����ؼ� ��ȣ�� ������ ����� �޼ҵ�!
		
		// Light on (�� �ѳ���)
		Lighting myLighting = new Lighting("JAVA APT 507");
		myLighting.on();
		
	}

}
