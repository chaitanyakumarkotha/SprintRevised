package com.capgemini.onlinebookingsystem.dto;

import java.time.LocalTime;

public class Show {
	int showId;
	LocalTime showStartTime;
	LocalTime showEndTime;
	//String showName;
	int movieId;
	String  screenID;
	int theaterId;
	public Show(int showid,LocalTime s, LocalTime e,int movieId,String screenName,int theaterId)
	{
		this.movieId=movieId;
		this.screenID=screenName;
		this.showEndTime=e;
		this.showId=showid;
		//this.showName=name;
		this.showStartTime=s;
		this.theaterId=theaterId;
		
	}
	public int getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(int theaterId) {
		this.theaterId = theaterId;
	}
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public LocalTime getShowStartTime() {
		return showStartTime;
	}
	public void setShowStartTime(LocalTime showStartTime) {
		this.showStartTime = showStartTime;
	}
	public LocalTime getShowEndTime() {
		return showEndTime;
	}
	public void setShowEndTime(LocalTime showEndTime) {
		this.showEndTime = showEndTime;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getScreenID() {
		return screenID;
	}
	public void setScreenID(String screenID) {
		this.screenID = screenID;
	}

}
