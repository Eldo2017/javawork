package _08_polymorphism_ex;

public class T04_Tv extends T01_Product{
	T04_Tv(){
		super(1280000);
	}
	@Override
	public String toString() {
		return "Tv";
	}
}
