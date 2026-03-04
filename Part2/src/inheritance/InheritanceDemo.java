package inheritance;

/**
 * @author dac
 *
 */
public class InheritanceDemo {

	/**
	 * @param args
	 */
	
	class A {
		public void dispA() {
			System.out.println("A");
		}
	}

	class B extends A {
		public void dispB() {
			System.out.println("B");
		}
	}
	
	public static void main(String[] args) {
		
		InheritanceDemo p = new InheritanceDemo();
		
		InheritanceDemo.A a = p.new A();
		InheritanceDemo.B b = p.new B();
		
		
		b.dispA();
		b.dispB();

	}

}

