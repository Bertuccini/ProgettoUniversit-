package controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.StockRecords;
import service.StockData;

@RestController
@RequestMapping("/stats")
public class GetWords {
	
	//Metodo che effettua la suddivisione degli indirizzi e crea un dizionario delle parole con le relative occorrenze
	@GetMapping ("/words")
	public static HashMap<String, Integer> getWords() {
		
		ArrayList<StockRecords> database= StockData.getRecords();
		int n= database.size();
		
		HashMap<String, Integer> words= new HashMap<String,Integer>();	
		int l;
		int l1;
		int l2;
		int l3;
		int l4;
		int l5;
		int l6;
		int l7;
		int count =1;
		String 	 word  =new String();
		String 	 word1 =new String();
		String   word2 =new String();
		String   word3 =new String();
		String   word4 =new String();
		String   word5 =new String();
		String   word6 =new String();
		String[] line1=new String[10000];
		String[] line2=new String[10000];
		String[] line3=new String[10000];
		String[] line4=new String[10000];
		String[] line5=new String[10000];
		String[] line6=new String[10000];
		String[] line7=new String[10000];


			try {
					for (int i=0; i<n; i++) {
						 String s1 = database.get(i).getIndirizzo();
						 word = word+" "+s1;


						 }line1 =word.split("\\/");		
				 
					
					}
					catch (Exception ex){
				        String errorMessage = ex.getMessage();
					}			l1=line1.length;	

			try {
						for (int i=0; i<n; i++) {
							String s2 =database.get(i).getIndirizzo();							
							word1 =word1+" "+s2;  
					}line2= word1.split("\\s+");

					}
					catch (Exception ex){
				      String errorMessage = ex.getMessage();
			    }					
			l2= line2.length;

			
					try {

						for(int i=0;i<l2;i++) {
							String s3 =line2[i];
							word2 =word2+" "+s3;  
							
						}	line3=word2.split("\\-");

						}
					catch (Exception ex){
				        String errorMessage = ex.getMessage();
					}					l3 =line3.length;

				 
					try {
					for(int i=0;i<l3;i++) {
					
						String s4 = line3[i];
						word3=word3+" "+s4;
					

					}line4=word3.split("\\(");

					}
					catch (Exception ex){
				        String errorMessage = ex.getMessage();
					}
					
					 l4 =line4.length;
					 try {
					for(int i=0;i<l4;i++) {
						String s5 = line4[i];
						word4=" "+word4+" "+s5;
					}	line5=word4.split("\\)");

					 }catch (Exception ex){
					        String errorMessage = ex.getMessage();
					 }
						 l5 =line5.length;	
					try {
					for(int i=0;i<l5;i++) {
						String s6 = line5[i];
						word5=word5+" "+s6;			

					}		line6=word5.split("\\.");

					}catch (Exception ex){
				        String errorMessage = ex.getMessage();
				        
				        }
							l6=line6.length;
							try {
								for (int i=0; i<l6; i++) {
									 String s7 = line6[i];
									 word6 =word6+" "+s7;


									 }	line7 =word6.split("\\s+");		
				 
								
								}
								catch (Exception ex){
							        String errorMessage = ex.getMessage();
								}			l7=line1.length;	

								if (l2>1){
									for(int i=0;i<l7;i++) {
				
								if (!words.containsKey(line7[i])) {
				 
									words.put(line7[i], count);
									}
									else { words.replace(line7[i], count, count+1);
		
									}
	}
	}

			return words; 
	}
}
