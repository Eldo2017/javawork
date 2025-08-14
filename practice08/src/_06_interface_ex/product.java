package _06_interface_ex;

public interface product {
	void power();
	void volumeUp(int vol2);
    void volumeDown(int vol2);
    // int volume(int vol2);
    
	static void chatWithAI() {
		System.out.println("[AI] 안녕하세요! 당신의 에이전트 AI입니다~");
		System.out.println("무엇을 도와드릴까요?");
	}
	
	default void searching(String keyword) {
		System.out.println(keyword);
	}
}
