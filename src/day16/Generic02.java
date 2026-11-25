package day16;

public class Generic02 {

	public static void main(String[] args) {
		GenericsPrint<Powder> powderPrint = new GenericsPrint<>();
		powderPrint.setMaterial(new Powder());
		System.out.println(powderPrint);
		
		GenericsPrint<Plastic> plasticPrint = new GenericsPrint<>();
		plasticPrint.setMaterial(new Plastic());
		System.out.println(plasticPrint);
		
		GenericsPrint Print = new GenericsPrint();
		Print.setMaterial("아무거나");
		System.out.println(Print);
	}

}

class GenericsPrint<T>{
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "GenericsPrint [material=" + material + "]";
	}
	
	
}

class Powder{
	public String toString() {
		return "재료는 파우더 입니다.";
	}
}

class Plastic{
	public String toString() {
		return "재료는 플라스틱 입니다.";
	}
}
