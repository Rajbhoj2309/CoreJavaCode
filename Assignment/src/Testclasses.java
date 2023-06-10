class One{
	void print_geek() {
		System.out.println("One");
	}
}
class Two extends One{
	void print_for() {
		System.out.println("Two");
	}
}

class Three extends One{
	void print_three() {
		System.out.println("Three");
	}
}
class Four extends Two{
	void print_four() {
		System.out.println("four");
	}
}
class Five extends Three{
	 void print_some() {
		 System.out.println("Five");
	}
}
public class Testclasses {
	public static void main(String[] args) {
		Three a=new Five();
		a.print_geek();
		
		Two b=  new Two();
				b.print_geek();
				
				Five c=new Five();
				c.print_geek();
	}

}
