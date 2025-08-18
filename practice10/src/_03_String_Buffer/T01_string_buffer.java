package _03_String_Buffer;

/*
 * String(불변성) : 한번 객체가 생성이 되면 덮어쓸 수가 없다. (무조건 새로 생성해야 가능)
 * 				   변하지 않는 문자열을 사용할 때
 * 
 * StringBuffer : 추가, 삭제, 수정이 가능하며, 동기화도 지원이 된다
 * 				  자주 변경이 되는 문자열을 사용할 때
 * 				  멀티스레드 환경에서 사용한다
 * 
 * StringBuilder : 추가, 삭제, 수정이 가능한데, 동기화 지원은 되지 않는다
 * 				  자주 변경이 되는 문자열을 사용할 때
 * 				  단일스레드 환경에서 사용한다
 * 				  StringBuffer보다 빠르다
*/
public class T01_string_buffer {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer(); // 16문자를 담을 수 있는 객체를 생성
		StringBuffer sb2 = new StringBuffer(30); // 총 30문자를 담을 수 있는 객체를 생성
		StringBuffer sb3 = new StringBuffer("xyz"); // 'xyz'의 값이 든 객체를 생성

		System.out.println("sb1에 있는 문자열 길이 : " + sb1.length());
		System.out.println("sb2에 있는 문자열 길이 : " + sb2.length());
		System.out.println("sb3에 있는 문자열 길이 : " + sb3.length());
		
		// equals는 오버라이딩을 하지 않는다.
		StringBuffer sb4 = new StringBuffer("xyz");
		
		System.out.println("sb3 == sb4 : " + (sb3 == sb4));
		System.out.println("sb3.equals(sb4)(주소가 같나?) : " + sb3.equals(sb4));
		System.out.println("---------------------------------------------------");
		
		// toString()은 오버라이딩 되어 있다(값으로 들어있는 문자열 반환).
		System.out.println("sb3 : " + sb3);
		sb3.append("pendulum");
		System.out.println("sb3 : " + sb3);
		sb3.append(17);
		System.out.println("sb3 : " + sb3);
		sb3.append(false);
		System.out.println("sb3 : " + sb3);
		
		// delete()
		sb3.deleteCharAt(9);
		System.out.println("sb3 : " + sb3);
		sb3.delete(3, 6);
		System.out.println("sb3 : " + sb3);
		sb3.delete(3, sb3.length());
		System.out.println("sb3 : " + sb3);
		System.out.println("---------------------------------------------------");
		
		// insert(떨어뜨릴 거리, 문자열)
		sb3.insert(1, "913");
		System.out.println("sb3 : " + sb3);
		sb3.insert(4, "신");
		System.out.println("sb3 : " + sb3);
		
		// replace(시작 인덱스, (앞까지가 범위)끝 인덱스, 문자열)
		sb3.replace(1, 4, "synchro"); // 빼는 글자보다 적거나 많아도 상관이 없다
		System.out.println("sb3 : " + sb3);
		
		// reverse() : 뒤에서부터 거꾸로
		System.out.println(sb3.reverse());
		
		System.out.println("---------------------------------------------------");
		
		// capacity() : StringBuffer의 객체가 생성될 때 버퍼의 크기다
		//				기본 버퍼 크기는 16문자 + 문자 크기
		System.out.println("sb1의 버퍼 크기 : "+sb1.capacity());
		System.out.println("sb2의 버퍼 크기 : "+sb2.capacity());
		System.out.println("sb4의 버퍼 크기 : "+sb4.capacity());
		
		
	}

}
