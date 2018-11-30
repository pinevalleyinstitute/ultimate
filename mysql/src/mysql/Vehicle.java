package mysql;

import java.sql.Date;

public class Vehicle {

	private String vin;
	private double topSpeed;
	private String name;
	private String model;
	private Date year;
	private long milleage;
	private String colour;
	
	public Vehicle() {
		
	}
	
	
	public Vehicle(String vin,  double topSpeed, String name, String model, Date year, long milleage, String colour) {
		super();
		this.vin = vin;
		this.topSpeed = topSpeed;
		this.name = name;
		this.model = model;
		this.year = year;
		this.milleage = milleage;
		this.colour = colour;
	}
	
	
	public String getVin() {
		return vin;
	}
	
	public void setVin(String vin) {
		this.vin = vin;
	}
	
	
	
	public double getTopSpeed() {
		return topSpeed;
	}



	public void setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public Date getYear() {
		return year;
	}



	public void setYear(Date year) {
		this.year = year;
	}



	public long getMilleage() {
		return milleage;
	}



	public void setMilleage(long milleage) {
		this.milleage = milleage;
	}



	public String getColour() {
		return colour;
	}



	public void setColour(String colour) {
		this.colour = colour;
	}



	
}
