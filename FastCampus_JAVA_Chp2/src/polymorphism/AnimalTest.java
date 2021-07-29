package polymorphism;

/**
 다형성(polymorphism) : 하나의 코드가 여러 자료형으로 구현되어 실행되는 것 <=> 같은 코드로 다른 실행결과를 나타낼 수 있음
 상속과 메서드 재정의를 활용한 다형성을 잘 이용하면, 유연하면서 확장성이 있고 유지보수하기 편한 프로그램을 만들 수 있음.  
  객체 지향 프로그래밍의 가장 큰 특징 중 하나.
 */

import java.util.ArrayList;

/**
 					Animal
 	Human     Tiger     Eagle
 	
 	상속 -> 하위 클래스들을 상위클래스 하나의 타입으로 모두 핸들링 할 수 있음. 
 	
 */


class Animal {
	public void move() {
		System.out.println("동물이 움직입니다");
	}
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다");
	}
	
	public void readBook() {
		System.out.println("책을 읽습니다");
	}
}

class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 걷습니다");
	}
	
	public void Hunting() {
		System.out.println("호랑이가 사냥을 합니다");
	}
}

class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다");
	}
	
	public void Flying() {
		System.out.println("독수리가 양날개를 쭉 펴고 날아다닙니다");
	}
	
}

public class AnimalTest{
	public static void main(String[] args) {
		Animal Hanimal = new Human();
		Animal Tanimal = new Tiger();
		Animal Eanimal = new Eagle();
		
		AnimalTest test = new AnimalTest();
//		test.moveAnimal(new Human());
//		test.moveAnimal(new Tiger());
//		test.moveAnimal(new Eagle());
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(Hanimal);
		animalList.add(Tanimal);
		animalList.add(Eanimal);
		
		for(Animal a : animalList) {
			a.move();
		}
		System.out.println("===================== 다운캐스팅을 활용 =====================");
		test.testDownCasting(animalList);
		
	}
	
	public void testDownCasting(ArrayList<Animal> animal) {
		for(int i=0;i<animal.size();i++) {
			Animal ani = animal.get(i);
			if (ani instanceof Human) {
				
				Human human = (Human) ani;
				human.readBook();
			
			}
			else if (ani instanceof Tiger) {
				
				Tiger tiger = (Tiger) ani;
				tiger.Hunting();
			}
			else if (ani instanceof Eagle) {
				
				Eagle eagle = (Eagle) ani;
				eagle.Flying();
			}
			else {
				System.out.println("unsupported type");
			}
		}
	}
	
	
	public void moveAnimal(Animal animal) {
		animal.move();
		
	}
}	