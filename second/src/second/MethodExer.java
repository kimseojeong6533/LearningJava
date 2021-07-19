package second;

class Car{
	static int carNum = 0;
	Car(){
		carNum++;
	}
	void myCar() {
		System.out.println("차량번호 : "+carNum);
	}
}

class Boat{
	static int boatNum = 0;
	Boat(){
		boatNum++;
	}
	void myBoat() {
		System.out.println("보트번호 : "+boatNum);
	}
}

public class MethodExer {

	public static void main(String[] args) {
		Car c = new Car();
		c.myCar();
		
		Car c2 = new Car();
		c2.myCar();
		
		Boat t = new Boat();
		t.myBoat();

	}

}
