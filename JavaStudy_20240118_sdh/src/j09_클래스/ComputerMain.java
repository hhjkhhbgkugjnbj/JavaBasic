package j09_클래스;

public class ComputerMain {

	public static void main(String[] args) {
		
//		System.out.println(new Computer());
//		System.out.println(new Computer());
//		
		Computer c1 = new Computer();
		Computer c2 = new Computer();
		System.out.println(c1);
		
		//값주입 방법1
		c1.cpu = "i7";
		c1.company = "SAMSUNG";
		c1.year = 2023;
		c1.ram = 8;
		c1.graphic = "RTX3060";
		
		c2.cpu = "i5";
		c2.company = "LG";
		c2.year = 2024;
		c2.ram = 16;
		c2.graphic = "GTX1080";
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("전");
		c1.addRam(8);
		c1.addRam(8);
		c1.addRam(16);
		c2.addRam(16);
		c2.removeRam(16);
		System.out.println(c1);
		System.out.println(c2);
	}

}
