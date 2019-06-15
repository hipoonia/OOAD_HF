import java.util.Timer;
import java.util.TimerTask;
import java.util.*;


public class DogDoor {

	private boolean open;
	
	private ArrayList<Bark> allowedBarks;
	
	public DogDoor () {
	
		this.open = false;
		allowedBarks = new ArrayList<>();
	}
	
	public void open() {
	
		System.out.println("This dog door opens.");
		open = true;
		
		final Timer timer = new Timer();
			timer.schedule(new TimerTask() {
			
				public void run() {
				
					close();
					timer.cancel();
				}
			} , 5000);
	}
// encapsulate what varies. dog door's closing behavior from rest of the code.
	public void close() {
	
		System.out.println("This dog door closes.");
		open = false;
	}
	
	public boolean isOpen() {
	
		return open;
	}
	
	public void addAllowedBark (Object bark) {
	
		if (bark instanceof Bark) {
		
			allowedBarks.add((Bark)bark);
		}
	}
	
	public List getAllowedBarks() {
	
		return allowedBarks;
	}
	
	
}