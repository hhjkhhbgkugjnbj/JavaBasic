package j11_상속.piano;

public class MusicMain {

	public static void main(String[] args) {
		
		Piano piano = new Piano(5);
		NewPiano newPiano = new NewPiano();
		NewViolin newViolin = new NewViolin(3);
		Instrument instrument = new Instrument(2);
		Instrument Inpiano = new Piano(1);
		
		Instrument InViolin = newViolin;
		
//		NewPiano newPiano2 = (NewPiano)instrument;
//		NewPiano newPiano3 = (NewPiano)Inpiano;
		Piano newPiano4 = (Piano)Inpiano; 
		
		piano.piano();
		piano.soccer();
		System.out.println();
		newPiano.piano();
		newPiano.baseball();
		System.out.println();
		newViolin.piano();
		instrument.piano();
		Inpiano.piano();
		System.out.println();
		Inpiano.piano();
		
		newPiano4.soccer();
		
		System.out.println(newPiano4 instanceof Piano);
	}

}
