package genericprogramming;

public class ThreeDPrinter_ObjectTest {

	public static void main(String[] args) {
		
		//Object������ �������� ���� ����
		Powder Powder = new Powder();
		ThreeDPrinter_Object printer = new ThreeDPrinter_Object();
		
		printer.setMaterial(Powder);
	
		Powder p = (Powder) printer.getMaterial();  // => set�Ҷ����� �ٷ� �ڵ带 ��밡��������, get�� �Ҷ����� ���� ����ȯ�� ���־���ϴ� ���ŷο��� ���� -> ��ȿ��
	}

}
