package com.esame.progettofinale;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;

public class DownAndDec {
	
	private static String filename= "datiprogetto.csv";
	
	//Metodo che effettua la decodifica del file Json e trova l'url del file csv da scaricare
	public static void Decode () {
	
	try {
		
		String url= "https://www.dati.gov.it/api/3/action/package_show?id=05c5f4de-5563-4890-8fc8-31bd0b839806";
		URLConnection openConnection = new URL(url).openConnection();
		openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
		InputStream in = openConnection.getInputStream();
		
		 String data = "";
		 String line = "";
		 try {
		   InputStreamReader inR = new InputStreamReader( in );
		   BufferedReader buf = new BufferedReader( inR );
		 
		   while ( ( line = buf.readLine() ) != null ) {
			   data+= line;
		   }
		 } finally {
		   in.close();
		 }
		JSONObject obj = (JSONObject) JSONValue.parseWithException(data); 
		JSONObject objI = (JSONObject) (obj.get("result"));
		JSONArray objA = (JSONArray) (objI.get("resources"));
		
		for(Object o: objA){
		    if ( o instanceof JSONObject ) {
		        JSONObject o1 = (JSONObject)o; 
		        String format = (String)o1.get("format");
		        String urlD = (String)o1.get("url");
		        if(format.equals("csv")) {
		        	download(urlD, filename);
		        }
		    }
		}
		System.out.println( "Operazione riuscita" );
	} catch (ParseException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (Exception e) {
		e.printStackTrace();
}
}
    
	//Metodo che ritorna il nome del file scaricato
    public static String getFilename() {
		return filename;
	}

    //Metodo che effettua il download effettivo dei dati
    public static void download(String url, String fileName) throws Exception {
    try (InputStream in = URI.create(url).toURL().openStream()) {
        Files.copy(in, Paths.get(fileName));
        System.out.println("Sto scaricando da " + Paths.get(fileName));
    } catch (FileAlreadyExistsException e) {
    	System.out.println("Il file è gia stato scaricato precedentemente");
    }
}
}
