package practice;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileWrite01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path outputPath = Paths.get("./src/practice/output.txt");
		StringBuilder sb = new StringBuilder();
		
		System.out.println("파일에 저장할 내용을 입력해 주세요 (종료->exit) >");
		
		try(Scanner scanner = new Scanner(System.in,StandardCharsets.UTF_8)){
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				if(line.equals(line)) {
					if("exit".equals(line)) {
						break;
					}
					sb.append(line).append(System.lineSeparator());
				}
			}
			
			Files.writeString(outputPath, sb.toString(), StandardCharsets.UTF_8);
			System.out.println("파일저장 완료 : " + outputPath.toAbsolutePath());
		}catch(IOException e) {
			System.out.println("파일 생성 중 에러발생 : " + e.getMessage());
			e.printStackTrace();
		}

	}

}
