package _03_car;

public class T01_car_api {
	String model;
	String company;
	boolean power;
	int speed;
	
	T01_car_api(String model, String company){
		this.model = model;
		this.company = company;
	}
	
	void StartUp() {
		power = true;
		System.out.println("시동 상태 : " + power);
		System.out.println("차량 출발합니다.");
		System.out.println("---------------------------");
	}
	
	void Stop() {
		power = false;
		System.out.println("시동 상태 : " + power);
		System.out.println("차량을 정지합니다.");
		System.out.println("---------------------------");
	}
	/*
	 void power() {
	 	if(!power) System.out.println("시동을 켭니다.");
	 	else System.out.println("시동을 끕니다.");
	 } 
	 */
	
	void SpeedUp(int speed) {
		System.out.println("속도를 " + speed + " 더 상승시키겠습니다.");
		System.out.println("---------------------------");
	}
	
	void SpeedDown(int speed) {
		System.out.println("속도를 " + speed + " 더 내립니다.");
		System.out.println("---------------------------");
	}
	
	/*
	 int SpeedUp(){
	 	speed += 5;
	 	return speed;
	 }
	 
	 int SpeedDown(){
	 	if(speed < 5) System.out.println("더 이상은 내릴 수 없습니다.");
	 	speed -= 5;
	 	return speed;
	 }
	 */
}
