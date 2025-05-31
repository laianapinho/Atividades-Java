package br.edu.ufam.icomp.lab_encapsulamento;

public class Posicao {
	private double latitude;
	private double longitude;
	private double altitude;
	
	public Posicao(double latitude,double longitude, double altitude) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
	}
	
	//setter
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	//getter
	public double getLatitude() {
		return latitude;
	}
	
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	//getter
	public double getLongitude() {
		return longitude;
	}
	
	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}
	
	//getter
	public double getAltitude() {
		return altitude;
	}
	
	public String toString() {
		return "Posição:" + this.latitude +", " + this.longitude +", " + this.altitude;
	}
}
