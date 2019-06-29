package controller;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.esame.progettofinale.DownAndDec;

import service.StockData;

/**
 * Questa classe esegue l'avvio dell'applicazione,il download e il parse
 * @author Filippo
 *
 */
@SpringBootApplication
public class ProgettofinaleApplication {

	/**
	 * Metodo principale dell'applicazione
	 * @param args
	 * @throws ParseException
	 * @throws IOException
	 * @throws Exception
	 */
	public static void main(String[] args) {
		
		SpringApplication.run(ProgettofinaleApplication.class, args);
		try {
			DownAndDec.Decode();
		
		StockData stockdata= new StockData();
		stockdata.LoadDatafromFile(DownAndDec.getFilename());
		System.out.println("Sono stati registrati " + stockdata.getNumberOfrecords() + " records");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}

