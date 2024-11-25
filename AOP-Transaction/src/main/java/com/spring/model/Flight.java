package com.spring.model;


public class Flight {
	
	private int flightId;
	private String source;
	private String destination;
	private int noOfSeats;
	private double flightFare;
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public double getFlightFare() {
		return flightFare;
	}
	public void setFlightFare(double flightFare) {
		this.flightFare = flightFare;
	}
	public Flight(int flightId, String source, String destination,
			int noOfSeats, double flightFare) {
		super();
		this.flightId = flightId;
		this.source = source;
		this.destination = destination;
		this.noOfSeats = noOfSeats;
		this.flightFare = flightFare;
	}
	public Flight() {
		// TODO Auto-generated constructor stub
		super();
	}
	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", source=" + source + ", destination=" + destination + ", noOfSeats="
				+ noOfSeats + ", flightFare=" + flightFare + "]";
	}

	

}
