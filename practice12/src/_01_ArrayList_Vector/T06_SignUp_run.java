package _01_ArrayList_Vector;

import java.util.ArrayList;
import java.util.List;

public class T06_SignUp_run {

	public static void main(String[] args) {
		List<SignUp> l = new ArrayList<>();
		
		l.add(new SignUp("Geats162","Ace8542","김두한","010-6185-9003"));
		l.add(new SignUp("Gotchard386","Hotaro5113","김무옥","010-7052-0620"));
		l.add(new SignUp("Gaim386","Kouta168","문영철","010-1548-5119"));
		l.add(new SignUp("Zio9725","Sougo847","김영태","010-0621-7542"));
		l.add(new SignUp("Saber2191","Touma847","정진영","010-8149-3529"));
		
		System.out.println("총 객체 수 : " + l.size());
		System.out.println("---------------------------");
		
		for(SignUp su : l) {
			System.out.println("아이디 : " + su.getId());
			System.out.println("비밀번호 : " + su.getPw());
			System.out.println("이름: " + su.getName());
			System.out.println("전화번호 : " + su.getPhone());
			System.out.println("---------------------------");
		}
	}

}
