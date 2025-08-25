package _04_bufferstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 보조 스트림 : 기반 스트림만으로 부족했던 성능 개선을 해주는 스트림
 * 			  기반 스트림에서 제공하지 않는 추가적 메소드 제공
 * >> 외부 매체와 직접 연결되지 않고, 단독 사용도 할 수 없다(반드시 기반 스트림과 함께 사용해야 한다).
 * 
 * BufferedReader / BufferedWriter : 버퍼라는 공간을 제공해주는 보조 스트림(속도 향상)
 */

public class buffer_api {
	// 기반 스트림 : FileWriter 사용
	// 보조 스트림 : BufferedWriter 사용
	void fileSave() {
		BufferedWriter bw = null;
		
		try {
			// 1. 기반 스트림 생성
			/* FileWriter fw = new FileWriter("buffer_3.txt"); */
			
			// 2. 보조 스트림 생성
			/* BufferedWriter bw = new BufferedWriter(fw); */
			
			// 위의 2줄을 한줄로 변형 가능
			bw = new BufferedWriter(new FileWriter("buffer_3.txt"));
			
			bw.write("나 김두한이다.\n");
			bw.write("오늘 단죄하러 왔다.");
			bw.newLine();
			bw.write("나 두한이야. 왜 왔는지 알겠나?");
			// 버퍼라는 데에 쌓인다 => 한번에 출력한다 => 속도 향상
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		/*
		 * try~with~resource 구문 : 자원반납을 스스로 한다
		 * try(try 블록 내에서 사용할 스트림 객체 생성 구문) {
		 * 
		 * } catch (예외 클래스 e) {
		 * 
		 * }
		 */
		
		try(BufferedWriter bw2 = new BufferedWriter(new FileWriter("buffer_4.txt"))){
			bw2.write("나 김두한이다.\n");
			bw2.write("오늘 단죄하러 왔다.");
			bw2.newLine();
			bw2.write("나 두한이야. 왜 왔는지 알겠나?");
		} catch (IOException e) {
			e.printStackTrace();
		} // 자원 반납 구문을 쓰지 않아도 자동으로 반납까지 한다
	}
	 
	void fileRead() {
		try (BufferedReader br = new BufferedReader(new FileReader("buffer_4.txt"))){
			String line; // 한 줄씩 읽어올 문자열 변수
			
			// readLine() : 한 줄씩 텍스트 파일을 읽는다 (더 이상 읽을 줄이 없을 때까지)
			while((line = br.readLine()) != null) System.out.println(line);
			
		} catch (FileNotFoundException e) {
			// 파일이 존재하지 않을 경우에 발생하는 예외 처리
			e.printStackTrace();
		} catch (IOException e) {
			// 파일을 읽는 도중 발생하는 입출력 예외 처리
			e.printStackTrace();
		} // 별도 반납 구문 없이도 자동으로 반납한다
	}
}
