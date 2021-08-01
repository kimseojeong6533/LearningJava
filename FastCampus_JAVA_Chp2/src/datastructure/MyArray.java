package datastructure;
//Array �����ϱ�

public class MyArray {
	int [] intArr;
	int count;     //array�� ����� �ǰ���
	
	public int ARRAY_SIZE;   // array�� ũ��
	public static final int ERROR_NUM = -99999999;
	
	public MyArray() {
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}
	
	public MyArray(int size) {
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[ARRAY_SIZE];
	}
	
	public void addElement(int num) {
		if(count>=ARRAY_SIZE) {
			System.out.println("not enough memory");
			return;
		}
		intArr[count++] = num;
	}
	
	public void insertElement(int position, int num) {  // Ư�� �ε����� ���� ����ֱ�  
		
		if(count>=ARRAY_SIZE) {   // �̹� �迭�� ���� ��� ���ִ� �����̰ų�, 
			System.out.println("not enough memory");
			return;
		}
		
		if(position<0 || position >= ARRAY_SIZE) {      //position�ε����� �߸� �Է�
			System.out.println("INSERT ERROR");
			return;
		}
		
			
		
		for(int i = count-1; i>=position;i--) {  // position��ġ ������ ����ִ� ��ҵ��� ���ڸ��� �о��� ([0,1,2,3,0], p = 1 -> [0, , 1,2,3])
			
			intArr[i+1] = intArr[i];
		}
		
		intArr[position] = num;
		count++;
	}
	
	public int removeElement(int position) {
		if(position<0 || position>=ARRAY_SIZE) {
			System.out.println("POSITION ERROR");
			return ERROR_NUM; 
		}
		int ret = intArr[position];
		intArr[position] = 0;
		return ret;
	}
	
	public int getSize() {  // �迭�� ũ�⸦ ��ȯ
		return ARRAY_SIZE;
	}
	
	public boolean isEmpty() {
		if(count==0)
			return true;  // array�� ��������� true�� ��ȯ
		
		return false;
	}
	
	public int getElement(int position) {
		return intArr[position];
	}
	
	public void printAll() {
		for(int i=0;i<ARRAY_SIZE;i++) {
			System.out.printf("%d ",intArr[i]);
		}
	}
	
	public void removeAll() {   //intArr�� ��Ҹ� ��� �����
		for(int i=0;i<ARRAY_SIZE;i++) {
			intArr[i] = 0;
		}
	}
	
	
	
}
