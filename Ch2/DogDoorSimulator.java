public class DogDoorSimulator {

	public static void main (String[] args) {
	
		DogDoor door = new DogDoor();
		Remote remote = new Remote(door);
		
		System.out.println("Pillu barks to go out...");
		remote.pressButton();
		
		System.out.println("\n Pillu has gnoe out...");
		remote.pressButton();
		
		System.out.println("\n Pillu's all done...");
		remote.pressButton();
		
		System.out.println("\n Pillu is back inside...");
		remote.pressButton();
	}
}