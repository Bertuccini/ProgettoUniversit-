package controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.StockRecords;
import service.StockData;

@RestController
@RequestMapping("/filter")
public class Filters {
	
	 //Metodo che filtra il contenuto della collection attraverso gli attributi "Attiva" e "Zona"
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
	 
	 //Metodo che filtra il contenuto della collection attraverso gli attributi "Longituidne" e "Latitudine"
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
     
     //Metodo che filtra il contenuto della collection attraverso i valori di "Zona"
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
	 
	 //Metodo che filtra il contenuto della collection attraverso il valore di "Attiva"
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
