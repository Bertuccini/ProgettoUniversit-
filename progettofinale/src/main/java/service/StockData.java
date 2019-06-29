package service;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import model.StockRecords;

/**
 * Questa classe effettua il parse dei dati leggendoli dal file scaricato e restituisce il numero di records, il record i-esimo o l'intera collection
 * @author Filippo
 * 
 *
 */
@Service
public class StockData {
	
/**
 * ArrayList per i records
 */
private static ArrayList<StockRecords> records;
	
    
	/**
	 * Costruttore della classe che inizializza la collection
	 */
	public StockData() {
		records = new ArrayList<StockRecords>();
	}
	
	/**
	 * Metodo che effettua il parse dei record nella collection
	 * @param filepath stringa per il nome del file da leggere
	 * @throws Exception
	 */
	public void LoadDatafromFile(String filepath) throws Exception {
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
	
	/**
	 * Metodo che restituisce la collection
	 * @return ritorna l'ArrayList con tutti i records
	 */
	public static ArrayList<StockRecords> getRecords() {
		return records;
	}
    
	
	/**
	 * Metodo che restituisce l'i-esimo record
	 * @param i intero per il numero del record da ritornare
	 * @return ritorna il record i-esimo
	 */
	public StockRecords getRecordNumber(int i) {
    	return records.get(i);
    }
	
	
	/**
	 * Metodo che restituisce il numero totale di record registrati
	 * @return ritorna un intero che indica il numero dei record nella collection
	 */
	public int getNumberOfrecords() {
		return records.size();
	}

}
