package ie.lyit.testers;

import java.util.ArrayList;

import ie.lyit.flight.Booking;
import ie.lyit.flight.Flight;
import ie.lyit.flight.Passenger;

public class BookingTester {

	public static void main(String[] args) {
		ArrayList<Passenger>passengers = new ArrayList<Passenger>();
		Passenger p1 = new Passenger ("Mr", "Chris", "Green", 18, 8, 1998, 1, false);
	
		Flight Outbound = new Flight("1", "Paris", "Ireland", 28, 11, 2018, 14, 30, 100.00);
		Flight Inbound = new Flight("2", "Ireland", "Paris", 31, 11, 2018, 14, 30, 100.00);
	
		passengers.add(p1);
	
		Booking bookingA = new Booking(Outbound, Inbound, passengers);
	
		Passenger p2 = new Passenger ("Mr", "Chris", "Green", 18, 8, 1998, 1, false);
	
		Flight Outbound2 = new Flight("1", "Paris", "Ireland", 28, 11, 2018, 14, 30, 100.00);
		Flight Inbound2 = new Flight("2", "Ireland", "Paris", 31, 11, 2018, 14, 30, 100.00);
	
		passengers.add(p2);
		Booking bookingB = new Booking(Outbound2, Inbound2, passengers);
    
		if(bookingA.equals(bookingB))
			System.out.println("These are the same bookings.");
		else
			System.out.println("Different bookings.");
	
		bookingA.toString();
	
		bookingA.findPassenger(p1);
	
		bookingA.calculatePrice();
	
		Flight Inbound3 = new Flight("2", "Ireland", "Paris", 31, 11, 2018, 14, 30, 100.00);
		bookingA.setInbound(Inbound3);
	
		Flight Outbound3 = new Flight("1", "Paris", "Ireland", 28, 11, 2018, 14, 30, 100.00);
		bookingA.setOutbound(Outbound3);
		
		bookingA.getInbound();
		
		bookingA.getOutbound();
		
		bookingA.setTotalPrice(200.00);
	}
}
