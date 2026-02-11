package polymorphism.overidding;

public class Teacher extends Person{

	
  @Override
  public void work() {
	  
	  
	  String teach = "Mathematics";
	  double salary = 43000.00;
	  
	  System.out.println("I teavh"+ teach);
	  System.out.println("my salary is :"+ salary);
	  
      }
   }