package com.lld.model;

import java.time.LocalDateTime;

public class Show {
	private final String id;
	private Movie movie;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private Screen screen;
	public Show( Movie movie, LocalDateTime startTime, LocalDateTime endTime, Screen screen) {
		super();
		this.id = IdGenerator.generateID();
		this.movie = movie;
		this.startTime = startTime;
		this.endTime = endTime;
		this.screen = screen;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public LocalDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	public LocalDateTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	public Screen getScreen() {
		return screen;
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	public String getId() {
		return id;
	}
	
	
	//multiplex->screen->show->movie
}
