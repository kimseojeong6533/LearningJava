package innerclass;


/**
 * <Inner Class, ���� Ŭ����> - ������ ���� �������� ����
 Ŭ�����ȿ� Ŭ���� = ���� Ŭ����, ��ø Ŭ����. �̶�, static���� ���� Ŭ������ �����ϴ� �͵� �����ϴ�.
 - Ŭ���� ���ο� ������ Ŭ������ �� Ŭ������ ���ΰ� �ִ� �ܺ� Ŭ������ ������ ������ �ִ� ��찡 ����,
    �ٸ� �ܺ� Ŭ�������� ����� ���� ���� ���� ��쿡 ���� Ŭ������ �����ؼ� ���
 - ���� Ŭ���� ���� : �ν��Ͻ� ���� Ŭ���� / ���� ���� Ŭ���� / ����(local) ���� Ŭ���� / �͸�(anonymous) ���� Ŭ����
  
  *�ν��Ͻ� ���� Ŭ����(Instance Inner Class)
   - private���� ����(�ϴ� ���� ����)
   - private�� �ƴ� ���� Ŭ������ �ٸ� �ܺ� Ŭ�������� �������� 
  
  * ���� ���� Ŭ����(Static inner Class)
   - �ܺ� Ŭ���� ������ �����ϰ� ��밡��(Static)
   - ���� ����, �޼��� ���  
  
  * ���� ���� Ŭ���� (Local Inner Class)
   - �������� ó�� �޼��� ���ο��� �����Ͽ� ����ϴ� Ŭ����
   - �޼��� ȣ���� ������, �޼��忡 ���� ���������� ��ȿ���� �����
   - �޼��� ȣ�����Ŀ��� ����ؾ��ϴ� ��찡 ���� �� �ֱ� ������, ���� ���� Ŭ�������� ����ϴ� �޼����� ���������� �Ű������� Final�� �����. 
  
  * �͸� ���� Ŭ����(Anonymous Inner Class)
   - �̸��� ���� Ŭ����
   - Ŭ������ �̸��� �����ϰ� �ַ� �ϳ��� �������̽��� �ϳ��� �߻� Ŭ������ �����Ͽ� ��ȯ
   - �������̽��� �߻�Ŭ���� �ڷ����� ������ ���� �����Ͽ� Ŭ������ �����ϰų� ���� ���� Ŭ������ �޼��� ���ο��� �����Ͽ� ��ȯ����.
   - widget�� �̺�Ʈ �ڵ鷯�� Ȱ���.
   
   
 */
class OutClass {
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();  // OutClass Ŭ������ �����Ǹ� Inclass�� ������ -> 
	}
	
	class InClass{     // Ŭ���� �ȿ� Ŭ���� ����
		int iNum = 100;
		//static int sInNum = 500;   // <- ����(OutClass �ν��Ͻ��� �����Ǿ�� InClass�� ������ �޼��带 ����� �� �����Ƿ� ���������(static) ���ٺҰ��ϱ� ����
		void inTest() {
			
			System.out.println("OutClass num = " + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");    // Outclass�� private�����̹Ƿ� ��밡��
			System.out.println("OutClass num = " + sNum + "(�ܺ� Ŭ������ �ν��Ͻ� ����)"); // Outclass�� private�����̹Ƿ� ��밡��
			System.out.println("InClass num = " + iNum + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println();
		}		
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	static class InStaticClass {   // �������� Ŭ����
		
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
					
			//System.out.println("InClass num = " + iNum + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");    // <- ����, ��? static ������ �ƴϹǷ� (�ν��Ͻ��������� ��������� �����Ҽ� �����Ƿ�)
			System.out.println("OutClass num = " + sNum + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");  
			System.out.println("InClass num = " + sInNum + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println();
		}
		
		static void sTest() {  //���� �޼���
			
			System.out.println("OutClass num = " + sNum + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");  
			System.out.println("InClass num = " + sInNum + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println();
			
		}
	}
}

public class InnerClassTest{
	
	public static void main(String[] args) {
		OutClass outclass = new OutClass();
		outclass.usingClass();
		OutClass.InClass inner = outclass.new InClass();   //���� Ŭ���� �ν��Ͻ� ���� 

		// Outclass�ȿ� �ִ� InClass �ν��Ͻ��� �����ϱ� ���ؼ��� 
		// 1. OutClass�ν��Ͻ��� ����(outclass)
		// 2. 1���� ���� �ν��Ͻ��� ���� new ó��(outclass.new InClass())�� ���� 
		
		OutClass.InStaticClass.sTest();  // inTest�� ��� �޼���� ����X 
		
		OutClass outclass2 = new OutClass();
		OutClass.InStaticClass instaticclass = new OutClass.InStaticClass();  // ��������Ŭ���� �ν��Ͻ� ���� (�׳� ���� Ŭ���� �ν��Ͻ��� �����ϴ� �Ͱ� �ٸ���)
		instaticclass.inTest();
		
	}
	
}


