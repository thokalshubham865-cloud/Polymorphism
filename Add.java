package polymorphism.overidding;

public class Add extends Addition {
	
	Add(int a, int b){
		super(a,b);
	}
	  public static void main(String[] args) {

    Addition ad = new Addition(8,6);
    ad.addNum();

	  }
}