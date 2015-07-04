package Chapter02;

public class Ex02_06 {
	public static void main(String[] args) {
		// short ĳ������ �� ������?
		short a = (short)0x55ff; //0101 0101 1111 1111
		short b = (short)0x00ff; //0000 0000 1111 1111 
		
		System.out.println("[��Ʈ ���� ���]");
		// %04x�� �ǹ̴� ??
		System.out.printf("%04x\n", (short)a & b); //0000 0000 1111 1111, 0x00ff
		System.out.printf("%04x\n", (short)a | b); //0101 0101 1111 1111, 0x55ff
		System.out.printf("%04x\n", (short)a ^ b); //0101 0101 0000 0000, 0x5500
		System.out.printf("%04x\n", (short)~a); //1010 1010 0000 0000, 0xAA00
		
		byte c = 20; //0001 0100
		byte d = -8; //1000 1000, 0xf8?
		
		System.out.println("[����Ʈ ���� ���]");
		System.out.println(c << 2); //0101 0000, 0x50, 80
		System.out.println(c >> 2); //0000 0101, 0x05, 5
		// byte���� ���� ǥ���� ��� �ұ�?
		System.out.println(d >> 2); //1110 0001, 0x14, 20
		// d(0xf8)�� ����Ʈ ���� ���� int Ÿ������ �ٲ�� ������?
		System.out.printf("%x\n", (d >>> 2)); //0010 0001, 0x21
	}
}
