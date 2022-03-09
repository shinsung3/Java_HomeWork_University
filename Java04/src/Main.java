import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Number n1 = new WholeNumber(5);
		Number n2 = new WholeNumber(7);
		Number n3 = new Fraction(7, 2);
		Number n4 = new Fraction(1, 2);
		Number n5 = new Decimal("3.25");
		Number n6 = new Decimal("5.5");
//		System.out.println(n1.add(n2).toDouble()); // 12.0
//		System.out.println(n1.add(n3).toDouble()); // 5 + 7.0/2.0 -> 8.5?? ===> error
//		System.out.println(n3.add(n3).toDouble()); // 7.0
//		System.out.println(n5.add(n4).toDouble()); // 3.75
//		System.out.println();
		System.out.println(n1.multiply(n4).toDouble()); // 2.5 ==> error //5 * 1/2
//		System.out.println(n3.multiply(n4).toDouble()); // 7.0/4.0 ==> error 1.75
//		System.out.println(n6.multiply(n1).toDouble()); // 27.5
//		System.out.println();
//		System.out.println(n3.numerator()); //7
//		System.out.println(n1.numerator()); //5
//		System.out.println(n5.numerator()); //325
//		System.out.println();
//		System.out.println(n4.denominator()); //2
//		System.out.println(n2.denominator()); //1
//		System.out.println(n6.denominator()); //10 --> error ---> success
//		System.out.println();
//		System.out.println(n4.toText()); //1/2
//		System.out.println(n3.toText()); //7/2
//		System.out.println(n2.toText()); //7
//		System.out.println(n5.toText()); //3.25
	}
}
