package _11_static_Ex;

public class T01_Product {
	// 제품 api
	String pro_num;
	static int count = 0; // static으로 공유되는 변수
	
	public T01_Product(){
		count++; // 제품 수 증가
		pro_num = "더조은" + count; //고유번호 생성
		System.out.println("고유한 제품번호 (" + pro_num + ")");
	}
	
	public static int getCount() {
		return count;
	}
}

// T01_Product.java