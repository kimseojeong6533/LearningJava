package second;

class Cars{
	int gasolineGauge;  // 가솔린 잔여량
	protected Cars(){
		this.gasolineGauge = 100;
	}
	
}

class HybridCar extends Cars{
	int electricGauge;   // 전기 배터리 잔여량
	protected HybridCar() {
		super();
		this.electricGauge = 100;
	}
}

public class HybridWaterCar extends HybridCar{
	int waterGauge;   // 에너지 전환용 물의 잔여량
	protected HybridWaterCar() {
		super();
		this.waterGauge = 100;
	}
	
	public static void main(String[] args) {
		
		HybridWaterCar MyCar = new HybridWaterCar();
		System.out.println("잔여 가솔린 : "+MyCar.gasolineGauge);
		System.out.println("잔여 가솔린 : "+MyCar.electricGauge);
		System.out.println("잔여 가솔린 : "+MyCar.waterGauge);

	}

}
