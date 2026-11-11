package day06;

import java.util.Arrays;

public class Array07 {

	public static void main(String[] args) {
		// String 배열
		
		String strArr[] = new String[5];
		
		strArr[0] = "홍길동";
		strArr[1] = "김영이";
		strArr[2] = "고길동";
		strArr[3] = "둘리";
		strArr[4] = "또치";
		
		System.out.println(Arrays.toString(strArr));
		
		// 배열의 단점 : 배열의 길이는 고정 , null(초기값 없음) 포인트 에러 등 발생
		
		// 배열의 데이터를 늘리는 경우
		// 더 큰 배열을 만들어서 기존 데이터를 옮겨줘야 함.
		String[] strArr2 = new String[strArr.length+3];
		
		System.out.println(Arrays.toString(strArr2));
		//기존 데이터 이동
		for(int i=0;i<strArr.length;i++) {
			strArr2[i] = strArr[i];
		}		
		System.out.println(Arrays.toString(strArr2));
		
		
		// 배열복사 arraycopy
		// System.arraycopy(구배열,시작번지,신배열,시작번지,개수)
		System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
		strArr = strArr2;  // strArr2의 address 를 strArr로 연결  (주소값 복사) | 원래배열 주소 버리고, 새로운 배열주소 받음
		strArr[5] = "도우너";
		System.out.println(Arrays.toString(strArr));
	}

}
