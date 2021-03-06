package second;

class AccessWay{
	static int num = 0;    // static : 클래스이름을 통한 접근 + 인스턴스에 의한 접근 모두 허용 
	
	AccessWay(){
		incrCnt();
	}
	void incrCnt() {
		num++;
	}
}

public class ClassVarAccess {

	public static void main(String[] args) {
		AccessWay way = new AccessWay(); // 인스턴스를 만들면 생성자에의해 num이 0에서 1로 증가
		way.num++;                                          // (인스턴스의 이름을 통한 접근)static변수이기때문에 ++하면 num이 1에서 2로 증가
		System.out.println(way.num);

		
		AccessWay.num++;                             // (클래스이름을 통한 접근)num이 2에서 3으로 증가 
		System.out.println("num : "+AccessWay.num);   // 결과 : 3 이 출력

	}

}
