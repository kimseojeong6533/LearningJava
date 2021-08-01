package datastructure;
//Array 구현하기

public class MyArray {
	int [] intArr;
	int count;     //array내 요소의 실개수
	
	public int ARRAY_SIZE;   // array의 크기
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
	
	public void insertElement(int position, int num) {  // 특정 인덱스에 값을 집어넣기  
		
		if(count>=ARRAY_SIZE) {   // 이미 배열에 값이 모두 차있는 상태이거나, 
			System.out.println("not enough memory");
			return;
		}
		
		if(position<0 || position >= ARRAY_SIZE) {      //position인덱스가 잘못 입력
			System.out.println("INSERT ERROR");
			return;
		}
		
			
		
		for(int i = count-1; i>=position;i--) {  // position위치 다음에 들어있는 요소들을 한자리씩 밀어줌 ([0,1,2,3,0], p = 1 -> [0, , 1,2,3])
			
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
	
	public int getSize() {  // 배열의 크기를 반환
		return ARRAY_SIZE;
	}
	
	public boolean isEmpty() {
		if(count==0)
			return true;  // array가 비어있으면 true를 반환
		
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
	
	public void removeAll() {   //intArr의 요소를 모두 지우기
		for(int i=0;i<ARRAY_SIZE;i++) {
			intArr[i] = 0;
		}
	}
	
	
	
}
