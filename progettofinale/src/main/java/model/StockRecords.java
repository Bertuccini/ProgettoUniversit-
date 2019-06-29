package model;

/**
 * Questa classe crea il modello di record che viene utilizzato per il parse dei dati
 * @author Filippo
 *
 */
public class StockRecords {
	
	/**
	 * Stringa per l'indirizzo del record
	 */
	private String indirizzo;
	/**
	 * Intero per la attività del record
	 */
	private int attiva;
	/**
	 * Intero per la zona del record
	 */
	private int zona;
	/**
	 * Double per la longitudine del record
	 */
	private double lon;
	/**
	 * Double per la latitudine del record
	 */
	private double lat;
	/**
	 * Stringa per la locazione del record
	 */
	private String loc;
		
	/**
	 * Costruttore della classe 
	 * @param indirizzo valore stringa per l'indirizzo
	 * @param attiva valore intero per l'attività
	 * @param zona valore intero per la zona
	 * @param lon valore double per la longitudine
	 * @param lat valore double per la latitudine
	 * @param loc valore stringa per la location
	 */
	public StockRecords(String indirizzo, int attiva, int zona, double lon, double lat, String loc) {
		this.indirizzo = indirizzo;
		this.attiva = attiva;
		this.zona = zona;
		this.lon = lon;
		this.lat = lat;
		this.loc=loc;
	}

	/**
	 * Metodo che ritorna l'indirizzo di un record
	 * @return ritorna una stringa indirizzo
	 */
	public String getIndirizzo() {
		return indirizzo;
	}
	
	/**
	 * Metodo che assegna un determinato valore all'attributo "Indirizzo" del record 
	 * @param indirizzo stringa da assegnare all'attributo
	 */
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	
	/**
	 * Metodo che ritorna il valore di attività di un record
	 * @return ritorna un intero che indica l'attività di un record
	 */
	public int getAttiva() {
		return attiva;
	}
	
	
	/**
	 * Metodo che assegna un determinato valore all'attributo "Attività" del record 
	 * @param attiva intero da assegnare all'attributo
	 */
	public void setAttiva(int attiva) {
		this.attiva = attiva;
	}
	
	/**
	 * Metodo che ritorna la zona di un record
	 * @return ritorna una intero che indica la zona
	 */
	public int getZona() {
		return zona;
	}
	
	/**
	 * Metodo che assegna un determinato valore all'attributo "Zona" del record 
	 * @param zona intero da assegnare all'attributo
	 */
	public void setZona(int zona) {
		this.zona = zona;
	}
	
	/**
	 * Metodo che ritorna la longitudine di un record
	 * @return ritorna una double longitudine
	 */
	public double getLon() {
		return lon;
	}
	
	/**
	 * Metodo che assegna un determinato valore all'attributo "Longitudine" del record 
	 * @param lon double da assegnare all'attributo
	 */
	public void setLon(double lon) {
		this.lon = lon;
	}
	
	/**
	 * Metodo che ritorna la latitudine di un record
	 * @return ritorna una double latitudine
	 */
	public double getLat() {
		return lat;
	}
	
	/**
	 * Metodo che assegna un determinato valore all'attributo "Latitudine" del record 
	 * @param lat double da assegnare all'attributo
	 */
	public void setLat(double lat) {
		this.lat = lat;
	}
	
	/**
	 * Metodo che ritorna la location di un record
	 * @return ritorna una stringa location
	 */
	public String getLoc() {
		return loc;
	}

	/**
	 * Metodo che assegna un determinato valore all'attributo "Location" del record 
	 * @param loc stringa da assegnare all'attributo
	 */
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	@Override
	public String toString() {
		return "StockRecords [indirizzo = " + indirizzo + ", attiva = " + attiva + ", zona = " + zona + ", lon = " + lon
				+ ", lat = " + lat + ", loc = " + loc + "]";
	}
	

	
	

}
