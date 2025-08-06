package _02_repeating;

public class T05_break {

	public static void main(String[] args) {
		// for문에서의 break
		int i, j;
		int sum = 0;
		for(i=1;i<=100;i++) {
			sum += i;
			if(sum > 1000) break;
		}
		System.out.println(i);
		System.out.println(sum);
		
		System.out.println("------------------------------");
		
		for(i=2;i<10;i++) {
			for(j=1;j<10;j++) {
				System.out.println(i + " * " + j + " = " + i * j);
				if(j==5) break;
			}
			System.out.println("---------------------");
		}
		
		System.out.println("---------------------");
		
		for(i=2;i<10;i++) {
			for(j=1;j<10;j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			if(i==5) break;
			System.out.println("---------------------");
		}
		
		System.out.println("---------------------");
		
		out1 : for(i=2;i<10;i++) {
			for(j=1;j<10;j++) {
				System.out.println(i + " * " + j + " = " + i * j);
				if(j==5) break out1;
			}
			System.out.println("---------------------");
		}
		
		System.out.println("---------------------");
	}

}
