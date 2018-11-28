package ie.lyit.flight;
import java.util.ArrayList;

public class Booking {
	
	private Flight Outbound;
	private Flight Inbound;
	ArrayList<Passenger> passengers=new ArrayList<Passenger>();//Creating Arraylist
	private double totalPrice;
	static int count;
	

	// Default Constructor
	// Called when object is created like this ==> Booking bookA = new Booking();
	public Booking() {
		Outbound = new Flight();
		Inbound = new Flight();
		passengers = new ArrayList <Passenger>();
		count++;
		totalPrice = 0;
	}

	// Initialization Constructor
	// Called when object is created like this ==>
	//    Booking bookB = new Booking(outFlight, inFlight, passengers);
	public Booking(Flight Outbound, Flight Inbound, ArrayList<Passenger> p) {
		this.Outbound = Outbound;
		this.Inbound = Inbound;
		this.passengers = p;
		count ++;
	}
	
	// toString() - returns String representing Booking
	@Override  // Overrides Object toString()
	public String toString(){
		return ("Outbound flight: " + Outbound + "Inbound flight: " + Inbound + 
				"Number of Bookings: " + count + "Total Price: " + totalPrice);
	}
	
	// ==> Called when comparing an object with another object, e.g. - if(bookingA.equals(bookingB))										
   @Override  // Overrides Object equals()
   public boolean equals(Object obj){
	   	Booking bookObject;
	   	if (obj instanceof Booking)
	   		bookObject = (Booking)obj;
	   	else
	   		return false;

	   return this.Outbound.equals(bookObject.Outbound) &&
            this.Inbound.equals(bookObject.Inbound) &&
		      this.totalPrice == totalPrice;							
	}
   
     // checks if the passenger entered is in the array
	public boolean findPassenger(Passenger p) {
		for(Passenger b: passengers) {
			if(b.equals(p)) {
				return true;
			}
		}
		return false;
	}
	
	 // calculates price of flights and returns double totalPrice
	public double calculatePrice() {
		totalPrice = (Outbound.getPrice() + Inbound.getPrice() * passengers.size());
		return(totalPrice);
	}
	
	public void setInbound(Flight Inbound) {
		this.Inbound = Inbound;
	}
	
	public void setOutbound(Flight Outbound) {
		this.Outbound = Outbound;
	}
	
	public Flight getInbound() {
		return Inbound;
	}
	
	public Flight getOutbound() {
		return Outbound;
	}
	
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
}
