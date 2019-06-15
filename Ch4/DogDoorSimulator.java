public class DogDoorSimulator {

	public static void main (String[] args) {
	
		DogDoor door = new DogDoor();
		
		door.addAllowedBark(new Bark("rowlf"));
		door.addAllowedBark(new Bark("rooowlf"));
		door.addAllowedBark(new Bark("rawlf"));
		door.addAllowedBark(new Bark("woof"));
		
		BarkRecognizer recognizer = new BarkRecognizer(door);
		Remote remote = new Remote(door);
		
		// Simulate the hardware hearing a bark
		System.out.println("Bruce starts barking.");
		recognizer.recognize(new Bark("rowlf"));
		
		System.out.println("\nBruce has gone outside... ");
		
		
		try {
		
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {} 
		
		System.out.println("\n Bruce all done...");
		System.out.println("\n but he's stuck outside!...");
		
		Bark smallDogbark = new Bark("yip");
		System.out.println("A small dog is barking");
		recognizer.recognize(smallDogBarking);
		
		
		try {
		
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {} 
		
		System.out.println("\n Bruce is barking again...");
		recognizer.recognize(new Bark("rooowlf"));
		
		System.out.println("\n Bruce's back inside..");

	}
}