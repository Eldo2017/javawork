package _03_car;

public class T03_car_run {

	public static void main(String[] args) {
		T02_ambulance am = new T02_ambulance("Genesis_9", "Hyundai");
		
		System.out.println("이 차의 모델명 : " + am.model);
		System.out.println("이 차의 제조사 : " + am.company);
		
		System.out.println("---------------------------");
		
		am.StartUp();
		am.SpeedUp(11);
		am.SpeedDown(6);
		am.sirenOn(true);
		am.firstAid();
		am.sirenOff(false);
		am.Stop();

	}

}
