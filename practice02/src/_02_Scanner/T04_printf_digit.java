package _02_Scanner;

public class T04_printf_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%7d\n", 39000); // 예시로 쓴 39000 앞에 두 자리 띄우고 출력한다
		System.out.printf("%7d\n", 3900000);
		System.out.printf("%7d\n", 3900);
		System.out.println("---------------------");
		
		System.out.printf("%07d\n", 39000); // 예시로 쓴 39000 앞에 두 자리를 0으로 채워 출력한다
		System.out.printf("%07d\n", 3900000);
		System.out.printf("%07d\n", 3900);
		System.out.println("---------------------");
		
		System.out.printf("%10s\n", "KimDooHan"); // 앞쪽을 비우고 출력
		System.out.printf("%-10s", "KimDooHan"); //뒤쪽에 빈칸을 넣어 출력
		System.out.printf("%s\n", "KimDooHan");
		System.out.println("---------------------");

		System.out.printf("%6.2f\n", 438.05);
		System.out.printf("%.3f\n", 50.0155);
	}

}
