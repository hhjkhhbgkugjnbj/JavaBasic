package j14_lombok;


public class ComputerMain {

	public static void main(String[] args) {

		Computer computer = Computer.builder()
				.code(20240001)
				.name("코리아컴퓨터")
				.year(2024)
				.build();
		
		Computer computer2 = Computer.builder()
				.year(2025)
				.code(20240002)
				.build();
		System.out.println(computer);
		System.out.println(computer2);
	}

}
