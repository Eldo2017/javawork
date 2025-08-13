package _01_abstract;

public class T09_phone_main {

	public static void main(String[] args) {
		T06_phone_api fp = new T07_folderphone("김영태");
		
		System.out.println("본인의 이름 : " + fp.getOwner());
		
		System.out.print("본인 : ");
		fp.hangUp();
		
		T06_phone_api sp = new T08_smartphone("김두한");
		
		System.out.println("상대방의 이름 : " + sp.getOwner());
		
		System.out.print("상대방 : ");
		sp.hangUp();
		
		System.out.print("본인 : ");
		fp.hangOut();
		
		System.out.print("상대방 : ");
		sp.hangOut();
	}

}
