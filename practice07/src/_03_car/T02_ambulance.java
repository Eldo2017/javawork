package _03_car;

public class T02_ambulance extends T01_car_api {
	T02_ambulance(String model, String company){
		super(model, company);
	}
	
	boolean siren;
	
	void sirenOn(boolean siren) {
		System.out.println("사이렌 울립니다.");
		System.out.println("---------------------------");
	}
	
	void sirenOff(boolean siren) {
		System.out.println("사이렌 멈춥니다.");
		System.out.println("---------------------------");
	}
	
	/*
	 void siren(){
	  	if(!siren) System.out.println("사이렌이 울립니다.");
	  	else System.out.println("사이렌이 멈춥니다.");
	 */
	
	void firstAid() {
		System.out.println("응급처치 시작합니다.");
		System.out.println("---------------------------");
	}
}
