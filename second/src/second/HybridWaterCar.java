package second;

class Cars{
	int gasolineGauge;  // ���ָ� �ܿ���
	protected Cars(){
		this.gasolineGauge = 100;
	}
	
}

class HybridCar extends Cars{
	int electricGauge;   // ���� ���͸� �ܿ���
	protected HybridCar() {
		super();
		this.electricGauge = 100;
	}
}

public class HybridWaterCar extends HybridCar{
	int waterGauge;   // ������ ��ȯ�� ���� �ܿ���
	protected HybridWaterCar() {
		super();
		this.waterGauge = 100;
	}
	
	public static void main(String[] args) {
		
		HybridWaterCar MyCar = new HybridWaterCar();
		System.out.println("�ܿ� ���ָ� : "+MyCar.gasolineGauge);
		System.out.println("�ܿ� ���ָ� : "+MyCar.electricGauge);
		System.out.println("�ܿ� ���ָ� : "+MyCar.waterGauge);

	}

}
