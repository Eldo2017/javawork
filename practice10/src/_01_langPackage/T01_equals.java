package _01_langPackage;

class Value extends Object{
	int value;
	Value(int value){
		this.value = value;
	}
	
	/*
	 * @Override 
	 * public boolean equals(Object o) { 
	 * 		return value == ((Value)o).value; // Object 
	 * }
	 */
}
public class T01_equals {
	public static void main(String[] args) {
		Value v1 = new Value(7);
		Value v2 = new Value(7);
	
		if(v1.equals(v2)) System.out.println("v1과 v2는 같은 수다");
		else System.out.println("v1과 v2는 다른 수다");
		
		Value v3 = v1;
		
		if(v1.equals(v3)) System.out.println("v1과 v3은 같은 수다");
		else System.out.println("v1과 v은 다른 수다");
	}

}
