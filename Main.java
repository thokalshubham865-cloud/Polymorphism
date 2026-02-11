package polymorphism.overidding;
import polymorphism.*;
public class Main {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.sound();
		
		System.out.println();
		
		Bike b = new Bike();
		b.run();
		
		System.out.println();
		
		Teacher t =new Teacher();
		t.work();
		
		
	}
  }
