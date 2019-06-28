package service;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import model.StockRecords;

@Service
public class StockData {
	
private static ArrayList<StockRecords> records;
	
    //Costruttore che inizializza la collection
	public StockData() {
		records = new ArrayList<StockRecords>();
	}
	
    //Metodo che effettua il parse dei record nella collection
	public void LoadDatafromFile(String filepath) {
		try {
			Scanner scanner= new Scanner(new FileReader(filepath));
			String line;
			StockRecords record;
			scanner.nextLine();
			while (scanner.hasNextLine()) {
				line=scanner.nextLine();
				String[] results= line.split(";");			 
			    int attiva= Integer.parseInt(results[1]); 
			    int zona= Integer.parseInt(results[2]);
			    double lon= Double.parseDouble(results[3]);	
			    double lat= Double.parseDouble(results[4]);	
			    
			
			    record = new StockRecords(results[0],attiva,zona,lon,lat,results [5]);
			    records.add(record);
			}
			scanner.close();
		
		}
		catch(Exception e){
			System.out.println("Error");
		}
		
	}
	
	//Metodo che restituisce la collection
	public static ArrayList<StockRecords> getRecords() {
		return records;
	}
    
	//Metodo che restituisce l'i-esimo record
	public StockRecords getRecordNumber(int i) {
    	return records.get(i);
    }
	
	//Metodo che restituisce il numero totale di record registrati
	public int getNumberOfrecords() {
		return records.size();
	}

}
