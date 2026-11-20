package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadSample {

	public static void main(String[] args) {
		// 텍스트 파일을 읽어들이는 연습
		Path filePath = Paths.get("./src/practice/testfile.txt");
		System.out.println("현재 경로 : " + Path.of("").toAbsolutePath());
		
		try(BufferedReader reader = Files.newBufferedReader(filePath,StandardCharsets.UTF_8)){
			String line;
			while((line = reader.readLine())!=null) {
				System.out.println(line);
			}
		}catch(IOException e){
			System.out.println("파일 읽는 중 오류 발생 : " + e.getMessage());
		}

	}

}
