package _07_polymorphism;

class Car {
	String color;
	int speed;
	void drive() {
		System.out.println("운전 중입니다.");
	}
	
	void stop() {
		System.out.println("운전을 멈추시오.");
	}
}

class FireCar extends Car {
	void water() {
		System.out.println("물을 뿌리겠습니다.");
	}
}
public class T03_poly_run {
	public static void main(String[] args) {
		FireCar fCar = new FireCar();
		fCar.drive();
		fCar.water();
		fCar.stop();
		
		Car car = fCar;
		car.drive();
		// car.water(); -> 사용 불가
		car.stop();
		
		FireCar f2 = (FireCar)car; // 강제 형변환
		
		/*
		 * 주의점
		 *  반드시 부모는 최초객체 생성시 자식 타입으로 객체가 생성돼 있어야 한다
		 */
		
		Car c = new Car();
		
		// FireCar f3 = (FireCar)c; -> 컴파일 오류(실행 시 오류가 발생한다
		
		// instanceof : 좌측의 객체가 우측 타입으로 만들어졌는지를 검사한다(true)
		FireCar f3 = null;
		if(c instanceof FireCar) {
			f3 = (FireCar)c;
			System.out.println("변환 완료");
		}
		else {
			System.out.println("변환이 불가합니다.");
		}
	}
}
