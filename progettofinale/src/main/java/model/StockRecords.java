package model;

public class StockRecords {
	
	private String indirizzo;
	private int attiva, zona;
	private double lon,lat;
	private String loc;
		
	public StockRecords(String indirizzo, int attiva, int zona, double lon, double lat, String loc) {
		this.indirizzo = indirizzo;
		this.attiva = attiva;
		this.zona = zona;
		this.lon = lon;
		this.lat = lat;
		this.loc=loc;
	}

	public String getIndirizzo() {
		return indirizzo;
	}
	
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	
	public int getAttiva() {
		return attiva;
	}
	
	public void setAttiva(int attiva) {
		this.attiva = attiva;
	}
	
	public int getZona() {
		return zona;
	}
	
	public void setZona(int zona) {
		this.zona = zona;
	}
	
	public double getLon() {
		return lon;
	}
	
	public void setLon(double lon) {
		this.lon = lon;
	}
	
	public double getLat() {
		return lat;
	}
	
	public void setLat(double lat) {
		this.lat = lat;
	}
	
	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	@Override
	public String toString() {
		return "StockRecords [indirizzo = " + indirizzo + ", attiva = " + attiva + ", zona = " + zona + ", lon = " + lon
				+ ", lat = " + lat + ", loc = " + loc + "]";
	}
	

	
	

}
