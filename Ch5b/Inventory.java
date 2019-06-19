import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class Inventory {

	private List inventory;
	
	public Inventory() {
	
		inventory = new LinkedList();
	}
	
	public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
	
		Instrument instrument = new Instrument (serialNumber, price, spec);
		inventory.add(instrument);
	}
	
		
	
	  public Instrument get(String serialNumber) {
		for (Iterator i = inventory.iterator(); i.hasNext(); ) {
		  Instrument instrument = (Instrument)i.next();
		  if (instrument.getSerialNumber().equals(serialNumber)) {
			return instrument;
		  }
		}
		return null;
	  }


	
	public List search(InstrumentSpec searchSpec) {
	
		List matchingInstruments = new LinkedList();
		
		for (Iterator i = inventory.iterator(); i.hasNext();) {
		
			Instrument instrument = (Instrument)i.next();
			
			if (instrument.getSpec().matches(searchSpec)) 
				matchingInstruments.add(instrument);
		}
		return matchingInstruments;
	}
	
	
/*	public List search(MandolinSpec searchSpec) {
	
		List matchingMandolins = new LinkedList();
		
		for (Iterator i = inventory.iterator(); i.hasNext();) {
		
			Mandolin mandolin = (Mandolin)i.next();
			
			if (mandolin.getSpec().matches(searchSpec)) 
				matchingMandolins.add(mandolin);
		}
		return matchingMandolins;
	}
*/
}