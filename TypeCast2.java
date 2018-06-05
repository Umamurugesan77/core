public class typecast2 {
	public static void main(String a[]) {
		byte b1=3;
		short s1=130;
		s1=b1;
		b1=(byte)s1;
		System.out.println(s1);
		System.out.println(b1);
	}

}

