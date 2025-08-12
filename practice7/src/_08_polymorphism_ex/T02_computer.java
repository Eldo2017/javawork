package _08_polymorphism_ex;

public class T02_computer extends T01_Product{
	T02_computer(){
		super(1050000);
	}
	@Override
	public String toString() {
		return "Computer";
	}
}
