public class DogDoorSimulator {

	public static void main (String[] args) {
	
		DogDoor door = new DogDoor();
		
		BarkRecognizer recognizer = new BarkRecognizer(door);
		
		Remote remote = new Remote(door);
		
		System.out.println("Pillu barks to go out...");
	//	remote.pressButton();
		recognizer.recognize("Woof");
		
		System.out.println("\n Pillu has gone out...");
	//	remote.pressButton();
		
		System.out.println("\n Pillu's all done...");
	//	remote.pressButton();
		
		
		try {
		
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {} 
		
		System.out.println("\n But pillu is stuck outside...");
		System.out.println("\n pillu starts barking again!...");
		
	//	System.out.println("\n User grabs the remote again...");
	//	remote.pressButton();
		
		recognizer.recognize("Woof");
		
		System.out.println("\n Finally Pillu is back inside...");

	}
}