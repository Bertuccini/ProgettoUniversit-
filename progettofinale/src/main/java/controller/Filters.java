package controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.StockRecords;
import service.StockData;

/**
 * Questa classe crea dei filtri di cui l'utente può usufruire tramite richiesta http (/filter)
 * @author Filippo
 *
 */
@RestController
@RequestMapping("/filter")
public class Filters {
	
	 /**
	 * Metodo che filtra il contenuto della collection con un filtro logico (/lfilter1) attraverso gli attributi "attiva" e "zona"
	 * @param att intero passato come parametro nella richiesta http per Attività
	 * @param zon intero passato come parametro nella richiesta http per Zona
	 * @return ritorna la collection con il contenuto filtrato
	 */
	@GetMapping("/lfilter1")
	 public static  ArrayList<StockRecords> LogFilter1 (@RequestParam(value="attiva") int att, @RequestParam(value="zona") int zon){
		 
		 ArrayList<StockRecords> database= StockData.getRecords();
		 int n= database.size();
			
		 ArrayList<StockRecords> recwithfilter = new ArrayList<StockRecords>();
		 for (int i=0; i<n; i++) {
			 if (database.get(i).getAttiva()==att && database.get(i).getZona()<=zon ) recwithfilter.add(database.get(i));
		 }
	
		 return recwithfilter;
	}
	 
	 /**
	 * Metodo che filtra il contenuto della collection con un filtro logico (/lfilter2) attraverso gli attributi "latitudine" e "longitudine"
	 * @param lat double passato come parametro nella richiesta http per Latitudine
	 * @param lon double passato come parametro nella richiesta http per Longitudine
	 * @return ritorna la collection con il contenuto filtrato
	 */
	@GetMapping ("/lfilter2")
     public static ArrayList<StockRecords> LogFilter2 (@RequestParam(value="latitduine") double lat, @RequestParam(value="longitudine") double lon){
		
		 ArrayList<StockRecords> database= StockData.getRecords();
		 int n= database.size();
		 
		 ArrayList<StockRecords> recwithfilterp = new ArrayList<StockRecords>();
		 for (int i=0; i<n; i++) {
			 if (database.get(i).getLat()<lat || database.get(i).getLon()>=lon )  recwithfilterp.add(database.get(i)); 
		 }
		  
		return recwithfilterp;
		  
	 }
     
    
	 /**
	 * Metodo che filtra il contenuto della collection con un filtro condizionale (/cfilter1) attraverso i valori di "Zona"
	 * @param zon intero passato come parametro nella richiesta http per Zona
	 * @return ritorna la collection con il contenuto filtrato
	 */
	@GetMapping ("/cfilter1")
	 public static ArrayList<StockRecords>  CondFilter1 (@RequestParam(value="zona") int zon){
		 
		 ArrayList<StockRecords> database= StockData.getRecords();
		 int n= database.size();
		 
		 ArrayList<StockRecords> recwithfilter = new ArrayList<StockRecords>();
		 for (int i=0; i<n; i++) {
			if (database.get(i).getZona()==zon) recwithfilter.add(database.get(i));
		 }
		 
		 return recwithfilter;
		
	}

	 /**
	 * Metodo che filtra il contenuto della collection con un filtro condizionale (/cfilter2) attraverso i valori di "Attiva"
	 * @param att intero passato come parametro nella richiesta http per Attiva
	 * @return ritorna la collection con il contenuto filtrato
	 */
	@GetMapping("/cfilter2")
     public static ArrayList<StockRecords> CondFilter2 (@RequestParam(value="attiva") int att){
		 
    	 ArrayList<StockRecords> database= StockData.getRecords();
		 int n= database.size();
    	
		 ArrayList<StockRecords> recwithfilter = new ArrayList<StockRecords>();
		
		 for (int i=0; i<n; i++) {
			 if (database.get(i).getAttiva()==att) recwithfilter.add(database.get(i)); 
		 }
		
		 return recwithfilter;
	}
}
