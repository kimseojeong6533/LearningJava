package singletone_Exercise;

/**
 Singletone ���� : ������ �������� �ϳ���, �ϳ��� �ν��Ͻ��θ� ���α׷��� �����ؾ��ϴ� ��� ����ϴ� ��ü���� ���α׷��� ���(with Static����, Static�޼ҵ�)
 
 */
public class Company {

	private static Company instance = new Company();  // ������ �ν��Ͻ� ����(�������� : instance)
	
	private Company() {
		
	}
	public static Company getInstance() {    // �ܺο��� CompanyŬ������ ������ �ν��Ͻ��� ����� �� �ֵ��� static���� �޼ҵ带 ��������.
		if(instance==null) {
			instance = new Company();
		}
		return instance;
	}

}
