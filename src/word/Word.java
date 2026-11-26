package word;

import java.util.List;
import java.util.Objects;

public class Word {
	// 단어, 뜻 2가지 저장
	// 하나의 단어에 뜻이 여러개 저정될 수 있게 설계
	// 뜻에 띄어쓰기를 포함할 수 있게
	// 단어 중복은 안되게
	// 1. 단어 등록 | 2. 단어 검색 | 3. 단어수정 | 4. 전체단어출력 | 5. 단어삭제 | 6. 종료
	private String word;
	private List<String> mean;
	
	public Word() {
		
	}
	
	
	public Word(String word) {
		this.word = word;
	}
	
	public Word(String word, List<String> mean) {
		this.word = word;
		this.mean = mean;
	}
	
	// method
	// 단어 출력
	public void printWord() {
		System.out.print(word + ":");
		if(mean.size()>0) {
			int count = 0;
			for(String s : mean) {
				count++;
				String str = s.replace("\\n",System.lineSeparator()+"\t ");
				System.out.println("\t"+count + "." + str);
			}
		}
		System.out.println("------------------------------");
	}
	
	public void printMean() {
		if(mean.size()>0) {
			int count=0;
			for(String s : mean) {
				count++;
				System.out.print(s+(count<mean.size()?"::":""));
			}
		}
	}
	
	
	
	// getter / setter
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public List<String> getMean() {
		return mean;
	}
	public void setMean(List<String> mean) {
		this.mean = mean;
	}


	@Override
	public int hashCode() {
		return Objects.hash(word);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		return Objects.equals(word, other.word);
	}
	

}
