package _03_charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 문자기반 스트림
 *  - 데이터를 2바이트 단위로 전송하는 통로(넓은 통로)
 *  - 기반 스트림 : 외부매체 직접적으로 연결되는 통로
 *  
 *  
 *  ***Reader : 입력용 스트림
 *  ***Writer : 출력용 스트림
 */
public class char_stream_api {
	void fileSave() {
		FileWriter fw = null;
		try {
			// 1. 객체 생성
			fw = new FileWriter("char_2.txt");
			
			// 2. writer() 메소드 이용한 출력
			//    2바이트 단위로 데이터 전송
			fw.write('X');
			fw.write(" ");
			fw.write("싱귤라이즈!\n");
			fw.write("파괴! 파멸! 절망! 멸망하라! Conclusion One!\n"); // 하나씩 전송
			
			char[] arr = {'L','U','C','I','F','E','R'};
			fw.write(arr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	void fileRead() {
		FileReader fr = null;
		
		try {
			// 1. 객체 생성
			fr = new FileReader("char_2.txt");
			
			// 2. read() 메소드로 읽기
			int val = 0;
			while((val = fr.read()) != -1) System.out.println((char)val);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
