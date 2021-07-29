package polymorphism;

/**
 ������(polymorphism) : �ϳ��� �ڵ尡 ���� �ڷ������� �����Ǿ� ����Ǵ� �� <=> ���� �ڵ�� �ٸ� �������� ��Ÿ�� �� ����
 ��Ӱ� �޼��� �����Ǹ� Ȱ���� �������� �� �̿��ϸ�, �����ϸ鼭 Ȯ�强�� �ְ� ���������ϱ� ���� ���α׷��� ���� �� ����.  
  ��ü ���� ���α׷����� ���� ū Ư¡ �� �ϳ�.
 */

import java.util.ArrayList;

/**
 					Animal
 	Human     Tiger     Eagle
 	
 	��� -> ���� Ŭ�������� ����Ŭ���� �ϳ��� Ÿ������ ��� �ڵ鸵 �� �� ����. 
 	
 */


class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�");
	}
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�");
	}
	
	public void readBook() {
		System.out.println("å�� �н��ϴ�");
	}
}

class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �Ƚ��ϴ�");
	}
	
	public void Hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�");
	}
}

class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�");
	}
	
	public void Flying() {
		System.out.println("�������� �糯���� �� ��� ���ƴٴմϴ�");
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
		System.out.println("===================== �ٿ�ĳ������ Ȱ�� =====================");
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