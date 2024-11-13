package j16_제네릭;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class GenericTest<T> {

	private int number;
	//private int data;
	
	private T data;
	
}
