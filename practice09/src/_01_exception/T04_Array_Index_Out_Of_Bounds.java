package _01_exception;

import java.util.Arrays;

public class T04_Array_Index_Out_Of_Bounds {

	public static void main(String[] args) {
		try {
			String[] str = {"김두한","김무옥","문영철"};
			System.out.println(Arrays.toString(str));
			str[3]="정진영";
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열은 인덱스 2까지만 사용할 수 있습니다.");
			e.printStackTrace();
		}
	}

}
