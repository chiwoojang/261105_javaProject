package day06;

public class Exam02 {

	public static void main(String[] args) {
		// 그림파일만 출력 => 확장자가 .jpg .png
		// 없으면 그림파일이 없습니다.

		String[] filename = {
				"이것이자바다.jpg.java","java의 정성.java","array.txt",
				"array.java","String.txt","StringMeghod.jpg ",
				"ArrayMethod.jpg","method.png","javaMethod.png",
				"Arrow.jpeg","Drawing.btm"
		};	
		
		String[] arrImage = {"jpg","png","jpeg","btm"};
		String strImage = String.join(" ", arrImage).toLowerCase();
		//System.out.println(strImage);
		
		int count = 0;
		for(String file : filename) {
			
			// 확장자만 떼어 냄 - 뒤쪽에서 . 을 찾아 뒷 부분만 가져옴 (빈칸 공백도 제거함)
			String strExtention = file.substring(file.lastIndexOf(".")+1).trim().toLowerCase();
			//System.out.println(strExtention);
//			if(strExtention.equals("jpg") || strExtention.equals("png")) {
//				System.out.println(file);
//				count++;
//			}
			if(strImage.contains(strExtention)) {
				System.out.println(file);
				count++;
			}
		}
		if(count==0) {
			System.out.println("그림파일이 없습니다.");
		} else {
			System.out.println("그림파일 : " + count + "개");
		}
			
	}

}
