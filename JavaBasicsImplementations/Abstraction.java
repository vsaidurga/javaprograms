package JavaBasicsImplementations;

 abstract class Bike{
	public abstract void run();
}
 class Hero extends Bike{
	 public void run() {
		 System.out.println("running perfectly");
	 }
 }

public class Abstraction {
public static void main(String[] args) {
	Bike obj = new Hero();
	obj.run();
}
}
