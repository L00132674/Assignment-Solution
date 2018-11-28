package ie.lyit.flight;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class BookingTest {
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testBookingFlightFlightArrayListOfPassenger() {
		ArrayList<Passenger>passengers = new ArrayList<Passenger>();
		Passenger p = new Passenger ("Mr", "Chris", "Green", 18, 8, 1998, 1, false);
		
		Flight Outbound = new Flight("1", "Paris", "Ireland", 28, 11, 2018, 14, 30, 100.00);
		Flight Inbound = new Flight("2", "Ireland", "Paris", 31, 11, 2018, 14, 30, 100.00);
		
		passengers.add(p);
		
		Booking bookingA = new Booking(Outbound, Inbound, passengers);
		
		assertNotNull(Outbound);
		assertNotNull(Inbound);
		assertNotNull(bookingA);
		assertNotNull(passengers);
		
	}

	@Test
	public void testToString() {
		ArrayList<Passenger>passengers = new ArrayList<Passenger>();
		Passenger p = new Passenger ("Mr", "Chris", "Green", 18, 8, 1998, 1, false);
		
		Flight Outbound = new Flight("1", "Paris", "Ireland", 28, 11, 2018, 14, 30, 100.00);
		Flight Inbound = new Flight("2", "Ireland", "Paris", 31, 11, 2018, 14, 30, 100.00);
		
		passengers.add(p);
		
		Booking bookingB = new Booking(Outbound, Inbound, passengers);
		bookingB.toString();
	}

	@Test
	public void testFindPassenger() {
		ArrayList<Passenger>passengers = new ArrayList<Passenger>();
		Passenger p = new Passenger ("Mr", "Chris", "Green", 18, 8, 1998, 1, false);
		
		Flight Outbound = new Flight("1", "Paris", "Ireland", 28, 11, 2018, 14, 30, 100.00);
		Flight Inbound = new Flight("2", "Ireland", "Paris", 31, 11, 2018, 14, 30, 100.00);
		
		passengers.add(p);
		
		Booking bookingC = new Booking(Outbound, Inbound, passengers);
		
		bookingC.findPassenger(p);
	}

	@Test
	public void testCalculatePrice() {
		ArrayList<Passenger>passengers = new ArrayList<Passenger>();
		Passenger p = new Passenger ("Mr", "Chris", "Green", 18, 8, 1998, 1, false);
		
		Flight Outbound = new Flight("1", "Paris", "Ireland", 28, 11, 2018, 14, 30, 100.00);
		Flight Inbound = new Flight("2", "Ireland", "Paris", 31, 11, 2018, 14, 30, 100.00);
		
		passengers.add(p);
		
		Booking bookingD = new Booking(Outbound, Inbound, passengers);
		
		bookingD.calculatePrice();
	}

	@Test
	public void testSetInbound() {
		ArrayList<Passenger>passengers = new ArrayList<Passenger>();
		Passenger p = new Passenger ("Mr", "Chris", "Green", 18, 8, 1998, 1, false);
		
		Flight Outbound = new Flight("1", "Paris", "Ireland", 28, 11, 2018, 14, 30, 100.00);
		Flight Inbound = new Flight("2", "Ireland", "Paris", 31, 11, 2018, 14, 30, 100.00);
		
		passengers.add(p);
		
		Booking bookingE = new Booking(Outbound, Inbound, passengers);
		bookingE.setInbound(Inbound);
	}

	@Test
	public void testSetOutbound() {
		ArrayList<Passenger>passengers = new ArrayList<Passenger>();
		Passenger p = new Passenger ("Mr", "Chris", "Green", 18, 8, 1998, 1, false);
		
		Flight Outbound = new Flight("1", "Paris", "Ireland", 28, 11, 2018, 14, 30, 100.00);
		Flight Inbound = new Flight("2", "Ireland", "Paris", 31, 11, 2018, 14, 30, 100.00);
		
		passengers.add(p);
		
		Booking bookingF = new Booking(Outbound, Inbound, passengers);
		bookingF.setInbound(Outbound);
	}

	@Test
	public void testSetTotalPrice() {
		ArrayList<Passenger>passengers = new ArrayList<Passenger>();
		Passenger p = new Passenger ("Mr", "Chris", "Green", 18, 8, 1998, 1, false);
		
		Flight Outbound = new Flight("1", "Paris", "Ireland", 28, 11, 2018, 14, 30, 100.00);
		Flight Inbound = new Flight("2", "Ireland", "Paris", 31, 11, 2018, 14, 30, 100.00);
		
		passengers.add(p);
		
		Booking bookingG = new Booking(Outbound, Inbound, passengers);
		bookingG.setTotalPrice(200.00);
	}

}
