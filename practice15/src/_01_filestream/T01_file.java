package _01_filestream;

import java.io.File;
import java.io.IOException;

public class T01_file {

	public static void main(String[] args) {
		
		try {
			// 1. 경로를 지정하지 않고 파일을 생성한다
			File f1 = new File("Ark_Zero.txt");
			f1.createNewFile();
			System.out.println("파일이 생성된 절대경로 : " + f1.getAbsolutePath());
			
			// 2. 존재하는 폴더에 파일을 생성 -> 경로 지정부터 하면 된다
			File f2 = new File("C:/ywj/Ark_One.txt");
			f2.createNewFile();
			System.out.println("파일이 생성된 절대경로 : " + f2.getAbsolutePath());
			
			/* ※ 없는 폴더에 파일은 생성하지 못한다
			 * File f3 = new File("D:/temp/Ark_Scorpion.txt"); 
			 * f3.createNewFile();
			 * System.out.println("파일이 생성된 절대경로 : " + f3.getAbsolutePath());
			 */
			
			// 3. 폴더 먼저 만들고 파일을 생성
			File tempFolder = new File("C:/ywj/test");
			tempFolder.mkdir(); // 폴더 생성이 된다
			
			File f3 = new File("C:/ywj/test/Ark_Scorpion.txt");
			f3.createNewFile();
			System.out.println("파일이 생성된 절대경로 : " + f3.getAbsolutePath());
			
			System.out.println(f1.exists());
			System.out.println(new File("Ark_Zero_One.txt").exists());
			
			System.out.println(f1.isFile());
			System.out.println(tempFolder.isFile());
			
			System.out.println("----------------------------------------------------");
			
			File folder = new File("parent");
			folder.mkdir();
			
			File f4 = new File("parent/Ark_Zero_One.txt");
			f4.createNewFile();
			
			System.out.println("파일명 : " + f4.getName());
			System.out.println("절대경로 : " + f4.getAbsolutePath());
			System.out.println("크기 : " + f4.length());
			System.out.println("상위폴더 : " + f4.getParent());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
