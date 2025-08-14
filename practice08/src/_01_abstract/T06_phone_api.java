package _01_abstract;

abstract public class T06_phone_api {
	private String owner;
	
	T06_phone_api(String owner){
		this.owner = owner;
	}
	
	abstract void hangUp();
	abstract void hangOut();
	
	String getOwner() {
		return owner;
	}
}
