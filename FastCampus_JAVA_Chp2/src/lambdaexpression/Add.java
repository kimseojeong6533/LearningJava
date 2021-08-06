package lambdaexpression;

@FunctionalInterface    // 인터페이스에 메서드를 2개이상 선언하면 오류가 나도록 처리
public interface Add {
	
	int add(int x, int y);       // 
}

