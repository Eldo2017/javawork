package _05_var_arg;

public class T01_var_arg {

	public static void main(String[] args) {
		/*
		 * T01_var_arg v = new T01_var_arg(); 
		 * v.method_n(args);
		 */
		
		method_n("야인시대","김두한","11.21","1972");
		method_n("야인시대","김무옥","10.1","1952");
		method_n("야인시대","문영철","6.25","1955");

	}
	/*
	void method1(String s1) {
		System.out.println(s1);
	}
	
	void method2(String s1, String s2) {
		System.out.println(s1 + "  " + s2);
	}
	
	void method3(String s1, String s2, String s3){
		System.out.println(s1 + " " + s2 + " " + s3);
	}
	*/
	
	//...
	
	static void method_n(String... str) {
		for(String n : str) {
			System.out.println(n);
		}
		
		System.out.println();
	}
}
