package _07_constructor;

class ConOver {
	int x;
	double y;
	String n;
	
	ConOver(){
		System.out.println("매개변수 없는 생성자");
		x = 55;
		y = 11.21;
		n = "김두한";
	}
	
	ConOver(int x){
		System.out.println("매개변수가 하나인 생성자");
		this.x = x;
		y = 11.21;
		n = "김두한";
	}
	
	ConOver(String n){
		System.out.println("매개변수가 하나인데 자료형만 다른 생성자");
		x = 55;
		y = 11.21;
		this.n = n;
	}
	
	ConOver(int x, double y){
		System.out.println("매개변수가 둘인 생성자");
		this.x = x;
		this.y = y;
		n = "김두한";
	}
	
	ConOver(int x, double y, String n){
		System.out.println("매개변수가 셋인 생성자");
		this.x = x;
		this.y = y;
		this.n = n;
	}
	
	void info() {
		System.out.println("int : " + x);
		System.out.println("double : " + y);
		System.out.println("name : " + n);
	}
}

public class T03_con_overloading {

	public static void main(String[] args) {
		ConOver c = new ConOver();
		c.info();
		
		System.out.println("--------------------------");
		
		c = new ConOver(18);
		c.info();
		
		System.out.println("--------------------------");
		
		c = new ConOver("김무옥");
		c.info();
		
		System.out.println("--------------------------");
		
		c = new ConOver(45,10.01);
		c.info();
		
		System.out.println("--------------------------");
		
		c = new ConOver(54,6.25,"문영철");
		c.info();
	}

}
