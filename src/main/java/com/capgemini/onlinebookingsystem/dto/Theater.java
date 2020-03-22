package com.capgemini.onlinebookingsystem.dto;

public class Theater {
	private Integer theatreId;
	private String theatreName;
	private String theatreCity;
	//private Movie[] listOfMovies;
	//private Screen[] listOfScreens;
	//private String managerName;
	//private String managerContact;
	
	public Theater() {
		
	}
	
	

	public Integer getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(Integer theatreId) {
		this.theatreId = theatreId;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public String getTheatreCity() {
		return theatreCity;
	}

	public void setTheatreCity(String theatreCity) {
		this.theatreCity = theatreCity;
	}

}
