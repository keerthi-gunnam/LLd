package com.lld.model;

import java.util.List;

public class Booking {
	private final String id;
	private User user;
	private Show show;
	private List<Seat> reservedSeats;
	private double totalAmount;
	public Booking( User user, Show show, List<Seat> reservedSeats, double totalAmount) {
		super();
		this.id =IdGenerator.generateID();
		this.user = user;
		this.show = show;
		this.reservedSeats = reservedSeats;
		this.totalAmount = totalAmount;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Show getShow() {
		return show;
	}
	public void setShow(Show show) {
		this.show = show;
	}
	public List<Seat> getReservedSeats() {
		return reservedSeats;
	}
	public void setReservedSeats(List<Seat> reservedSeats) {
		this.reservedSeats = reservedSeats;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getId() {
		return id;
	}
	
}
