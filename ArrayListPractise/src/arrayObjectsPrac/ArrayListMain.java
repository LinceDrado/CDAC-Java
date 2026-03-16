package arrayObjectsPrac;

public class ArrayListMain {

	public static void main(String[] args) {
		
		ArrayListManager alm = new ArrayListManager();
				
		System.out.println("Adding--------------------------");
		alm.add();
		System.out.println("Display--------------------------");
		alm.show();
		System.out.println("Updation--------------------------");
		alm.update();
		alm.show();
		System.out.println("Deletion--------------------------");
		alm.delete();
		alm.show();
		System.out.println("Sorting--------------------------");
		alm.sort();
		alm.show();

	}

}
