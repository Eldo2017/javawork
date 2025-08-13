package _04_interExtends;

// 같은 interface에서 상속 받을 때 extends 키워드를 사용하라!
// 여러개의 interface를 상속 받을 수 있다. = 다중 상속
interface Inter1 {
	int method1();
	int lastMe();
}

interface Inter2 {
	int method2();
}

public interface Inter extends Inter1, Inter2 {
	int method();
}