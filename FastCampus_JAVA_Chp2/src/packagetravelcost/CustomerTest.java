package packagetravelcost;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList <Customer> customerlist = new ArrayList<Customer>();
		
		
		Customer customerlee = new Customer("이순신",40);
		Customer customerkim = new Customer("김유신",20);
		Customer customerhong = new Customer("홍길동",13);
		
		customerlist.add(customerlee);
		customerlist.add(customerkim);
		customerlist.add(customerhong);
		
		
		// 스트림을 활용한 연산수행
		
		//1) 고객의 명단 출력
		System.out.println("고객 명단 : ");
		customerlist.stream().forEach(s->System.out.println(s.name));
		System.out.println();
		
		//2) 여행의 총 비용을 계산
		int total_cost = customerlist.stream().mapToInt(n -> n.getCost()).sum();  // 정수연산을 사용하려면 maptoInt를 사용해야함.
		System.out.println("여행 총비용은 : " + total_cost);
		System.out.println();
		
		//3) 고객 중 20세 이상인 사람의 이름을 정렬하여 출력
		
		int stdage = 20;
		System.out.printf("고객 중 %d세 이상인 사람의 이름 : \n",stdage);
		customerlist.stream().filter(s->s.getAge() >= stdage).map(c->c.getName()).sorted().forEach(a -> System.out.println(a));
		                                                 // 기준나이 이상으로 필터링      이름을 가져옴           가져온이름을 정렬
	}

}
