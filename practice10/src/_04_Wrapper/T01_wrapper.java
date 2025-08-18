package _04_Wrapper;

public class T01_wrapper {

	public static void main(String[] args) {
		Integer i1 = new Integer(6);
		
		Integer i2 = Integer.valueOf(6);
		
		Integer i3 = null;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		System.out.println("MAX_VALUE : " + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE : " + Integer.MIN_VALUE);
		
		System.out.println("Size : " + Integer.SIZE + " bit");
		System.out.println("Bytes : " + Integer.BYTES + " bytes");
		System.out.println("Type : " + Integer.TYPE);
	}

}
