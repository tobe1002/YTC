package Chapter02;

public class Ex02_08 {
	public static void main(String[] args) {
		int a=3, b=3, c=3;
		a += 3; //6
		b *= 3; //9
		c %= 3; //0
		System.out.println("a=" + a + ", b=" + b + ", c=" + c);
		
		int d=3;
		a = d++; //a=3, d=4
		System.out.println("a=" + a + ", d=" + d);
		a = ++d; //a=5, d=5
		System.out.println("a=" + a + ", d=" + d);
		a = d--; //a=5, d=4
		System.out.println("a=" + a + ", d=" + d);
		a = --d; //a=3, d=3
		System.out.println("a=" + a + ", d=" + d);
	}
}
