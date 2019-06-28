package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.esame.progettofinale.DownAndDec;

import service.StockData;

@SpringBootApplication
public class ProgettofinaleApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(ProgettofinaleApplication.class, args);
		DownAndDec.Decode();
		StockData stockdata= new StockData();
		stockdata.LoadDatafromFile(DownAndDec.getFilename());
		
		
		System.out.println("Sono stati registrati " + stockdata.getNumberOfrecords() + " records");
		
	}

}
