package _07_constructor;

class ThisConOver {
	int x;
	double y;
	String n;
	
	ThisConOver(){
		this(18,6.03,"김두한");
		System.out.println("매개변수 없는 생성자");
	}
	
	ThisConOver(int x){
		this(x,6.03,"김두한");
		System.out.println("매개변수가 하나인 생성자");
	}
	
	ThisConOver(String n){
		this(18,6.03,n);
		System.out.println("매개변수가 하나인데 자료형만 다른 생성자");
	}
	
	ThisConOver(int x, double y){
		this(x,y,"김두한");
		System.out.println("매개변수가 둘인 생성자");
	}
	
	ThisConOver(int x, double y, String n){
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

public class T03_this_con_overloading {

	public static void main(String[] args) {
		ThisConOver c = new ThisConOver();
		c.info();
		
		System.out.println("--------------------------");
		
		c = new ThisConOver(18);
		c.info();
		
		System.out.println("--------------------------");
		
		c = new ThisConOver("김무옥");
		c.info();
		
		System.out.println("--------------------------");
		
		c = new ThisConOver(45,10.01);
		c.info();
		
		System.out.println("--------------------------");
		
		c = new ThisConOver(54,6.25,"문영철");
		c.info();
	}

}
