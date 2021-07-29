package useobject;

/**
 1. Equals() : 
	
	 equals(), == : 객체 인스턴스 주소값(물리적인 값)을 비교하여 true/false를 반환
	 따라서 두 값을 논리적으로 비교할 필요가 있을 때, 재정의가 필요하다 
	  ex. 인스턴스 student1의 학번 : 100, 인스턴스 student2의 학번 : 100 -> student1과 student2는 물리적으로 다른 주소값을 가지지만, 실제로는 같은 학생이기 때문에, 학번을 비교하여 여러 성적값을 합산/계산할 필요가 있다. 
 
 2. hashcode() : 
  	  *JVM의 힙메모리 관리 방식 : hash table(with 키값 즉, 물리적인 값)
	  index(저장위치) = hash(key(객체정보)) --> hascode() : 객체의 객체정보(메모리 주소값)를 이용해 해시코드를 만들고 리턴 -> 인스턴스, 객체마다 다른 값을 가지게 됨. 
	  
	  
-equals()와 hashcode()를 같이 재정의해야 하는 이유
만약 equals()와 hashcode() 중 하나만 재정의 하면 어떻게 될까? hashcode()를 재정의 하지 않으면 같은 값 객체라도 
해시값이 다를 수 있다. 따라서 HashTable에서 해당 객체가 저장된 *버킷을 찾을 수 없다. 
(*버킷 : 같은 해시값을 가지게 되었을 때(해시충돌), 같은 해시값을 가진 객체에 대하여 버킷이라는 공간에 링크드리스트로 해당객체들을 추가하게 됨.

반대로 equals()를 재정의하지 않으면 hashcode()가 만든 해시값을 이용해 객체가 저장된 버킷을 찾을 수는 있지만 
해당 객체가 자신과 같은 객체인지 값을 비교할 수 없기 때문에 null을 리턴하게 된다. 따라서 역시 원하는 객체를 찾을 수 없다.
이러한 이유로 객체의 정확한 동등 비교를 위해서는 (특히 Hash 관련 컬렉션 프레임워크를 사용할때!) 
Object의 equals() 메소드만 재정의하지 말고 hashCode()메소드도 재정의해서 논리적 동등 객체일경우 동일한 해시코드가 리턴되도록 해야한다.
	   
 */

public class useEquals {

	public static void main(String[] args) {
		Student st1 = new Student(100, "Kim");    // st1과 st2는 사실 같은 사람이다 
		Student st2 = new Student(100, "Kim");
		Student st3 = st1;
		System.out.println(st1==st2);              // false (다른 인스턴스  -> 주소값이 다름)
		System.out.println(st1.equals(st2));  //재정의전, false (다른 인스턴스 -> 주소값이 다르기 때문)
																		   //재정의(같은 클래스형에 같은 학번이면 같은 사람)후, true 
		System.out.println(st3==st1);              //true (얕은복사 -> st3와 st1의 주소값이 같음)
		
		System.out.println(st1.hashCode());  // 재정의후, 학번이 반환됨.
		System.out.println(st2.hashCode());  
		System.out.println(st3.hashCode());  
		
		String str1 = new String("abc");             //String의 경우, String자체가 주소값
		String str2 = new String("abc");
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Integer i = 100;
		System.out.println(i.hashCode()); //100이 출력
		
		System.out.println(System.identityHashCode(st1));   // 찐 해시코드 값 반환 -> st1과 st2의 물리적인 주소는 다른다는 것. 
		System.out.println(System.identityHashCode(st2));
		
	}

}
