
public class HashingTechnique1 {
	public static void main(String[] args) {
		System.out.println(1%20);System.out.println(2%20);
		System.out.println(42%20);System.out.println(4%20);
		System.out.println(12%20);System.out.println(14%20);
		System.out.println(17%20);System.out.println(13%20);
		System.out.println(37%20);
		
		// an remainder ans is Array index
		// similar remainder will be arrange by Linear probing
		// means next ArrayIndex is empty then assign a duplicate remainder.
	}

}
