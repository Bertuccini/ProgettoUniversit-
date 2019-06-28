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
		int count =1;
		HashMap<String, Integer> words= new HashMap<String,Integer>();	
		for (int i=0; i<n; i++) {
			String[] word = database.get(i).getIndirizzo().split("\\s+");
			int len= word.length;
			for (int j=0; j<len; j++) {
				if (words.containsKey(word[j]))  words.replace(word[j], count, count+1);
				else {
					String[] word1= word[j].split("/");
					int l= word1.length;
					for (int k=0; k<l;k++) {
						String [] word2 =word1[k].split("\'");
						int l1= word2.length;
						if (l1>1) {
					    for (int x=0; x<l1;x++) {
					    	words.put(word2[x], count);
					    }
					    }
					    else words.put(word1[k], count);  
					    }
					}
				}
			}
						
		
		return words; 
	}
}
