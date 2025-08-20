package _03_Hash_Map;

public class Snack {
	private String flavor; // 맛
	private int calorie; // 칼로리양
	
	public Snack(){}
	
	public Snack(String flavor, int calorie) {
		this.flavor = flavor;
		this.calorie = calorie;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getCalorie() {
		return calorie;
	}

	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}

	@Override
	public String toString() {
		return "[flavor = " + flavor + ", calorie = " + calorie + "]";
	}
	
	
}
