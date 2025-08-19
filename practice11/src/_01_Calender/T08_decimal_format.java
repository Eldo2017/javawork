package _01_Calender;

import java.text.DecimalFormat;

public class T08_decimal_format {

	public static void main(String[] args) {
		double x = 2031.925687;
		double y = 16.20;

		// DecimalFormat df = new DecimalFormat("");
		// 0: 무조건 자리를 차지한다
		// #: 값이 없다면 차지하지 않는다
		
		System.out.println(new DecimalFormat("0").format(x));
		System.out.println(new DecimalFormat("#").format(x));
		
		System.out.println(new DecimalFormat("0.0").format(x));
		System.out.println(new DecimalFormat("#.#").format(x));
		
		System.out.println("------------------");
		
		System.out.println(new DecimalFormat("0").format(y));
		System.out.println(new DecimalFormat("#").format(y));
		
		System.out.println(new DecimalFormat("0.0").format(y));
		System.out.println(new DecimalFormat("#.#").format(y));
		
		System.out.println("------------------");
		
		System.out.println(new DecimalFormat("000000.0000").format(x));
		System.out.println(new DecimalFormat("######.####").format(x));
		
		System.out.println(new DecimalFormat("000000.0000").format(y));
		System.out.println(new DecimalFormat("######.####").format(y));
		
		System.out.println("------------------");
		
		System.out.println(new DecimalFormat("#,###.##").format(x));
	}

}
