package _01_condition;

public class T04_imposi_if {

	public static void main(String[] args) {
		// if문 내에 다른 if문이 중첩으로 들어간다
		int x = -105;
		
		if(x > 100) { // 100보다 크다
			if(x > 200) { // 200보다 크다
				System.out.println("200보다 크다");
			}
			else { // 100과 200 사이에 있다
				System.out.println("100보다 큰데 200보다 작다");
			}
		}
		
		else { // 100보다 작다
			if(x > 0) { // 0보다 크다
				System.out.println("100보다 작은 양수");
			}
			else if(x == 0) { // 0 그 자체다
				System.out.println("0");
			}
			else { // 0보다 작은 음수
				System.out.println("100보다 작은 음수");
			}
		}
	}

}
