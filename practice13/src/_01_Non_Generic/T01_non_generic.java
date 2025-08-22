package _01_Non_Generic;

class Box {
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}

class Orange {}
class Banana {}

public class T01_non_generic {

	public static void main(String[] args) {
		Box b = new Box();
		b.setObj("강시우");
		String name = (String)b.getObj();
		
		b.setObj(new Orange());
		Orange o = (Orange)b.getObj();
		
		// 예외가 발생할 확률이 높다. 모든 객체를 받아 형변환 시 다른 객체로 변환할 수 있기 때문이다
	}

}
