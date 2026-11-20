package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWrite02 {

	public static void main(String[] args) {
		Path sourcePath = Paths.get("./src/practice/inputSource.txt");
		Path targetPath = Paths.get("./src/practice/outputSource.txt");
		
		try(
			BufferedReader reader = Files.newBufferedReader(sourcePath, StandardCharsets.UTF_8);
			BufferedWriter writer = Files.newBufferedWriter(targetPath, StandardCharsets.UTF_8)
				){
			String line;
			int lineNumber = 1;
			
			while((line = reader.readLine())!=null) {
				String modifiedLine = lineNumber + ":" + line.trim().replace("old","new");
				writer.write(modifiedLine);
				writer.newLine();
				lineNumber++;
			}
			System.out.println("파일저장 완료!! " + targetPath.toAbsolutePath());
			
		}catch(IOException e) {
			System.out.println("에러 발생 : " + e.getMessage());
			e.printStackTrace();
		}

	}

}
