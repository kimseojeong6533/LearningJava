package second;
import java.time.LocalDate;   // 오늘 날짜를 가져오기위한 LocalDate 클래스를 import 해줌

public class DateOfExecution {

	static String date;

	static {   // static초기화 블록 : 클래스 변수를 선언과 동시에 초기화할때 사용 
		LocalDate nDate = LocalDate.now();
		date = nDate.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(date);
		

	}

}
