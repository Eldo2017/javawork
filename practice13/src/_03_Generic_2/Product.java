package _03_Generic_2;

public class Product<K, V> {
	private K kind;
	private V model;
	
	public K getKind() {
		return kind;
	}
	
	public void setKind(K kind) {
		this.kind = kind;
	}
	
	public V getModel() {
		return model;
	}
	
	public void setModel(V model) {
		this.model = model;
	}
	
	
}
