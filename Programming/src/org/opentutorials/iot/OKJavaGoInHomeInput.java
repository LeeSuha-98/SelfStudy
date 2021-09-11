package org.opentutorials.iot;

public class OKJavaGoInHomeInput {
	//IOT ��¥�ڵ�� ������
	
	public static void main(String[] args) {
		
		//String id = JOptionPane.showInputDialog("Enter a ID"); �� �ڵ�� ���׸��� ���ڰ� ������ ��� ���� �Է��Ҷ����� 
	    //�ڹٴ� ������������, �Է��ϰ� �Ǹ� ID�� ����ȴ�.
		String id = args[0];
		String bright = args[1];
				
		//String bright = JOptionPane.showInputDialog("Enter a Bright");
		
		// Elevator call (���������͸� �̸� ������ ����)
		Elevator myElevator = new Elevator(id);  // myElevator�� ����, Elevator�� ���� ������������ ������ Ÿ���̴�.
		myElevator.callForUp(1);		
		
		// Security off (���� �� ����)
		Security mySecurity = new Security(id);
		mySecurity.off(); // ��ȣ�� �����ؼ� ��ȣ�� ������ ����� �޼ҵ�!
		
		// Light on (�� �ѳ���)
		Lighting myLighting = new Lighting(id+" / Hall Lamp");
		myLighting.on();
		
		Lighting floorLamp = new Lighting(id+" / Hall Lamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+"moodLamp");
		moodLamp.setBright(Double.parseDouble(bright)); // n%��ŭ ��Ⱑ �����ȴ�.
		moodLamp.on();
		
	}

}
