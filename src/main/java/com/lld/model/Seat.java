package com.lld.model;

public class Seat {
	private final String seatNumber;
	
	private SeatStatus seatStatus;
	
	private SeatCategory seatCategory;

	public Seat(String seatNumber, SeatCategory seatCategory) {
		super();
		this.seatNumber = seatNumber;
		this.seatStatus = seatStatus.AVAILABLE;
		this.seatCategory = seatCategory;
	}

	public SeatStatus getSeatStatus() {
		return seatStatus;
	}

	public void setSeatStatus(SeatStatus seatStatus) {
		this.seatStatus = seatStatus;
	}

	public SeatCategory getSeatCategory() {
		return seatCategory;
	}

	public void setSeatCategory(SeatCategory seatCategory) {
		this.seatCategory = seatCategory;
	}

	public String getSeatNumber() {
		return seatNumber;
	}
	
	
}
