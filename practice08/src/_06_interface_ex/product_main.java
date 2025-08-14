package _06_interface_ex;

public class product_main {

	public static void main(String[] args) {
		Tv tv = new Tv();
		Game game = new Game();
		
		
		product.chatWithAI();
		tv.power();
		tv.volumeUp(3);
		tv.volumeDown(2);
		tv.channelUp(17);
		tv.channelDown(4);
		// 나중에 추가한 것
		tv.searching("축구 중계");
		
		tv.power();

		System.out.println("------------------------");
		
		product.chatWithAI();
		game.power();
		game.volumeUp(6);
		game.volumeDown(3);
		game.changeGame("슈퍼마리오");
		
		game.searching("이터널 리턴");
		game.power();
	}

}
