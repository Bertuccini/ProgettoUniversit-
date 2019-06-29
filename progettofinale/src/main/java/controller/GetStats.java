package controller;

import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.StockRecords;
import service.StockData;

/**
 * Questa classe restituisce le statisctiche basilari sugli attributi della collection tramite richiesta http (/stats)
 * @author Filippo
 *
 */
@RestController
@RequestMapping("/stats")
public class GetStats {
	
	/**
	 * Metodo che restituisce le statistiche basilari per l'attributo "Latitudine" dei record in formato Json (/latitudine)
	 * @return ritorna un oggetto Json contenente somma, media, minimo e massimo (con relativa via), deviazione standard
	 */
	@GetMapping ("/latitudine")
	public static JSONObject getLatStats (){

		ArrayList<StockRecords> database= StockData.getRecords();
		int n= database.size();
		
		JSONObject obj= new JSONObject();
		double sum=0.0;
		double sum1= 0.0;
		double avg;
		double min= 0.0;
		double max= 0.0;
		String Via= null;
		String Via1= null;
		
		for (int i=0; i<n; i++){
		   sum+=database.get(i).getLat();
		}
		avg=sum/n;
		
		for (int i=0; i<n; i++){
		sum1+=Math.pow((database.get(i).getLat()-avg),2);
		}
		double devstd= Math.sqrt(sum1/n);
		
		min = database.get(0).getLat();
		for (int i=1; i<n; i++){
			if (database.get(i).getLat()<min) {min=database.get(i).getLat(); Via = database.get(i).getIndirizzo();};
		};
		
		max = database.get(0).getLat();
		for (int i=1; i<n; i++){
			if (database.get(i).getLat()>max) {max=database.get(i).getLat(); Via1 = database.get(i).getIndirizzo();};
		};
		
		obj.put("Somma", sum);
		obj.put("Media", avg);
		obj.put("Deviazione Standard", devstd);
		obj.put("Via con latitudine minima", Via);
		obj.put("Minimo", min) ;
		obj.put("Via con latitudine massima", Via1);
		obj.put("Massimo", max);
			
		return obj;
	
}
    
	/**
	 * Metodo che restituisce le statistiche basilari per l'attributo "Longitudine" dei record in formato Json (/longitudine)
	 * @return ritorna un oggetto Json contenente somma, media, minimo e massimo (con relativa via), deviazione standard
	 */
	@GetMapping ("/longitudine")
	public static JSONObject getLonStats (){

		ArrayList<StockRecords> database= StockData.getRecords();
		int n= database.size();
		
		JSONObject obj= new JSONObject();
		double sum=0.0;
		double sum1= 0.0;
		double avg;	
		double min= 0.0;
		double max= 0.0;
		String Via= null;
		String Via1=null;
		
	    for (int i=0; i<n; i++){
	        sum+=database.get(i).getLon();
	    }
	    avg=sum/n;
	   
	    for (int i=0; i<n; i++){
	    	sum1+=Math.pow((database.get(i).getLon()-avg),2);
		}
		double devstd= Math.sqrt(sum1/n);
		
		min = database.get(0).getLon();
		for (int i=1; i<n; i++){
			if (database.get(i).getLon()<min) { min=database.get(i).getLon();
			Via = database.get(i).getIndirizzo();};
		};
											
		max = database.get(0).getLon();
		for (int i=1; i<n; i++){
			if (database.get(i).getLon()>max) {max=database.get(i).getLon();
			Via1 = database.get(i).getIndirizzo();};
		}
		
		obj.put("Somma", sum);
		obj.put("Media", avg);
		obj.put("Deviazione Standard", devstd);
		obj.put("Via con longitudine minima", Via);
		obj.put("Minimo", min) ;
		obj.put("Via con longitudine massima", Via1);
		obj.put("Massimo", max);
			
		return obj;
		
}
	

	/**
	 * /Metodo che restituisce il numero di zone attive e non attive presenti nei record in formato Json (/attività)
	 * @return ritorna un oggetto Json con il numero di vie attive e non attive
	 */
	@GetMapping ("/attivita")
	public static JSONObject getNumberofActiveAreas() {
		
		ArrayList<StockRecords> database= StockData.getRecords();
		int n= database.size();
		
		
		JSONObject obj= new JSONObject();
		int Attive= 0;
		int noAttive= 0;
		
		for (int i=0; i<n; i++) {
			if (database.get(i).getAttiva() == 1 ) Attive++;
			else noAttive++;
		}
		
		obj.put("Vie attive", Attive);
		obj.put("Vie non attive", noAttive);
			
		return obj;
	}
	

	/**
	 * Metodo che restituisce il conteggio del numero di vie presenti in ogni zona in formato Json (/zona)
	 * @return ritorna un oggetto Json con il numero di vie per ogni zona
	 */
	@GetMapping ("/zona")
	public static JSONObject getNumberofAddressinaZone () {
		
		ArrayList<StockRecords> database= StockData.getRecords();
		int n= database.size();
		
		JSONObject obj = new JSONObject(); 
		int count1=0;
		int count2=0; 
		int count3=0;
		int count4=0;
		int count5=0;
		int count6=0;
		int count7=0;
		int count8=0;
		int count9=0;
					
		for (int i=0; i<n; i++) {
			switch(database.get(i).getZona()) {
			case 1: count1++;break; 
			case 2: count2++;break;  
			case 3: count3++;break;  
			case 4: count4++;break;  
			case 5: count5++;break;  
			case 6: count6++;break;  
			case 7: count7++;break;  
			case 8: count8++;break;  
			case 9: count9++;break;  
			}
		}
		obj.put("Zona 1", count1);
		obj.put("Zona 2", count2);
		obj.put("Zona 3", count3);
		obj.put("Zona 4", count4);
		obj.put("Zona 5", count5);
		obj.put("Zona 6", count6);			
		obj.put("Zona 7", count7);
		obj.put("Zona 8", count8);
		obj.put("Zona 9", count9);
				 
		return obj;
		}
			
		
}



