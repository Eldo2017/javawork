package _03_String_Buffer;

public class T02_string_builder {

	public static void main(String[] args) {
		// 동기화만 다르고 StringBuffer와 동일하다
		StringBuilder sb = new StringBuilder();
		
		sb.append("Bakuage");
		sb.append(" King");
		System.out.println(sb);
		
		sb.insert(4, "16");
		System.out.println(sb);
		
		sb.setCharAt(4, 'X');
		System.out.println(sb);
		
		
	}

}
