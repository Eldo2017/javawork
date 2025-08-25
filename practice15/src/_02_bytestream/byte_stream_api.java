package _02_bytestream;
/*
 * 바이트 스트림
 *  - 바이트 스트림 :  데이터를 1바이트 단위로 전송하는 동로
 *  - 기반 스트림 : 외부 매체와 직접적으로 연결되는 통로
 *  
 * *** InputStream : *** 매체로부터 데이터를 입력받는 통로(외부매체로부터 데이터를 읽어오겟다는 뜻이다)
 * *** OutputStream : *** 매체로부터 데이터를 출력하는 통로(외부매체로부터 데이터를 내보내겠다(= 쓰겠다)는 뜻이다)
 * 
 * 순서
 * 1. 스트림 생성(통로 생성)
 * 2. 스트림으로 데이터 출력(메소드 활용)
 * 3. 다 사용한 후 스트림 반납
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class byte_stream_api {
	
	public void fileSave() {
		
		// 1. 스트림 생성
		FileOutputStream fout = null; // 파일이 없다면 새로 만들고 통로 연결/ 있으면 통로만 연결
		
		// FileOutputStream : 파일과 직접 연결하여 1바이트 단위로 출력(쓰기)하는 스트림
		try {	
			
			fout = new FileOutputStream("byte_1.txt"); // 파일이 없다면 새로 만들고 통로 연결/ 있으면 통로만 연결
			// 2. 스트림으로 데이터 출력(write 메소드 활용)
			fout.write(97); // 'a' 저장
			fout.write('x');
			
			byte[] arr= {99,100,101};
			fout.write(arr);
			
			fout.write(arr,1,2); // (배열, 시작 인덱스, 갯수)
			// fout.write('곤'); -> 2바이트라 깨져서 들어간다
			
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		//3. 스트림 반납
		try {
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // fileSave() end
	
	public void fileRead() {
		// FileInoutStream : 파일로부터 데이터를 1바이트 단위로 입력받는다
		
		FileInputStream fin = null;
		
		// 1. 스트림 생성(통로 생성)
		try {
			fin = new FileInputStream("byte_1.txt");
			
			// 2. 스트림으로 데이터 출력(메소드 활용) : read() 메소드 이용
			/*
			 *    1byte 단위로 하나씩 읽어온다 / 숫자로 읽는다
			 */
			// System.out.println((char)fin.read()); // 문자로 형변환
			// read() : 읽어올 데이터가 없을 때, -1 반환
			/*
			 * while(fin.read() != -1) { 
			 * 		System.out.println((char)fin.read()); 
			 * }
			 */
			// 해결법 1
			while(true) {
				int val = fin.read();
				if(val == -1) break;
				else System.out.println((char)val);
			}
			
			// 해결법 2
			int val = 0;
			while((val = fin.read()) != -1) {
				System.out.println((char)val);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 3. 다 사용한 후 스트림 반납
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
} // class end
