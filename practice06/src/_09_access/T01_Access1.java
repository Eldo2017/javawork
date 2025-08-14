package _09_access;

public class T01_Access1 {
	private int x = 9;
	
	// Setter 메소드 : private으로 된 필드에 값을 넣을 때 사용한다
	void setX(int x) {
		this.x = x;
	}
	
	// Getter 메소드 : private으로 된 필드에 값을 가져올 때 사용
	int getX() {
		return x;
	}
}
