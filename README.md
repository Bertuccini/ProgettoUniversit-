#Progetto  Università
Questo file detiene la spiegazione del progetto svolto da Andrea Bertuccini e Filippo Bernabucci. Abbiamo implementato le classi del nostro progetto su ambiente di programmazione Eclipse.
Nel programma principale, con la prima chiamata si esegue la scansione di un indirizzo URL, da cui si ricava un indirizzo URL di un file csv che contiene i dati da scaricare ed esaminare. Una volta scaricato il file si esegue una analisi sintattica al fine di ottenere una collection con Array dinamici che contengono le informazioni di nostro interesse. 
Successivamente vengono implementate classi al fine di soddisfare le richieste da parte dell’utente. L’utente, attraverso richieste http effettuate mediante browser o Postman, può scegliere quali delle informazioni mandare in output. L’applicazione permette di visionare i metadati, ovvero elenco degli attributi e del tipo, di restituire tutti i dati della collection o di restituire statistiche sui dati specificando l’attributo sul quale effettuare la computazione quali:
• Numeri:
dove è possibile eseguire calcolo di media, minimo, massimo, deviazione standard, somma e conteggio.
• Stringhe
dove viene eseguito il conteggio di elementi unici (per ogni elemento unico viene indicato il numero di occorrenze).
Nella restituzione dei dati si può specificare in fase di richiesta una serie di filtri su attributi con operatori conditional e logical.
Ora analizzeremo nel dettaglio la struttura del progetto:
I package sono:
![Model Package Hierarchy](https://user-images.githubusercontent.com/50883908/60420802-dd5ba700-9be8-11e9-93a3-5d93c1229669.jpg)

Il primo package di nome “com.esame.progettofinale” contiene la classe “DownAndDec” classe con lo scopo di individuare il data-set e scaricarlo.
Il secondo package “controller” contiene le classi “Filters”,”GetData”,”GetStats”,”GetWords”,”ProgettofinaleApplication” classi volte a restituire i dati dalla collection.
Il terzo package “model” detiene la classe “StockRecords” classe che costruisce i record che poi verranno inseriti nella collection.
Il quarto package “service” detiene la classe “StockData” classe che esegue l’analisi sintattica del file csv e importa i dati del data-set all’interno della struttura dati creando una collection.

Passiamo adesso ai diagrammi UML diagramma dei casi d’uso, diagramma delle classi
![Modello dei Casi d'uso](https://user-images.githubusercontent.com/50883908/60420859-f82e1b80-9be8-11e9-883c-b37ab6e9790e.jpg)

![Use Case Diagram](https://user-images.githubusercontent.com/50883908/60420902-0845fb00-9be9-11e9-80f9-08c184f6918f.jpg)

Ora invece analizziamo nel dettaglio i vari scenari che possono verificarsi con lo studio dei diagrammi delle sequenze.
Il primo che verrà proposto è quello del metodo che fa il download del file csv e successivamente crea una collection composta dai vari Array Dinamici che contengono i dati del file. 
![DownAndDec Sequence Diagram](https://user-images.githubusercontent.com/50883908/60420354-d4b6a100-9be7-11e9-92df-8f0c2f0ccc50.jpeg)

Adesso analizziamo gli scenari che possono verificarsi nella richiesta dei dati da parte dell’utente, prima di tutto per avviare i vari metodi implementati nel progetto bisogna collegarsi a qualsiasi borwser e introdurre un URL di collegamento alla porta “localhost 8080” con il percorso specifico del metodo che si vuole utilizzare.
Metodi della classe GetData 

![GetData GetData sequence diagram](https://user-images.githubusercontent.com/50883908/60420988-34617c00-9be9-11e9-8d8d-fd8144c9accf.jpg)

![GetData GetMetadata sequence diagram](https://user-images.githubusercontent.com/50883908/60420989-34617c00-9be9-11e9-88c7-c8b675d6b164.jpg)

Metodo della classe GetWords 

![GetWords  sequence diagram](https://user-images.githubusercontent.com/50883908/60421373-fe70c780-9be9-11e9-8827-1c7e2a5f7f1a.jpg)

Metodi della classe GetStats

![GetStas(1) sequence diagram](https://user-images.githubusercontent.com/50883908/60421077-5fe46680-9be9-11e9-833b-0b72797b1f09.jpg)

![GetStas(2) sequence diagram](https://user-images.githubusercontent.com/50883908/60421072-5f4bd000-9be9-11e9-87b0-97ba246ece02.jpg)

![GetStas(3) sequence diagram](https://user-images.githubusercontent.com/50883908/60421073-5f4bd000-9be9-11e9-9a41-1217ca72a179.jpg)

![GetStas(4) sequence diagram](https://user-images.githubusercontent.com/50883908/60421074-5fe46680-9be9-11e9-84a2-895dea46d265.jpg)



Metodi della classe Filters


![Filters(4) sequence diagram](https://user-images.githubusercontent.com/50883908/60421131-7ee2f880-9be9-11e9-8ba6-90bad1991948.jpg)

![Filters (1) sequence diagram](https://user-images.githubusercontent.com/50883908/60421132-7f7b8f00-9be9-11e9-8392-acadf05fa224.jpg)

![Filters (2) sequence diagram](https://user-images.githubusercontent.com/50883908/60421133-7f7b8f00-9be9-11e9-8f13-cd604217b199.jpg)

![Filters(3) sequence diagram](https://user-images.githubusercontent.com/50883908/60421134-7f7b8f00-9be9-11e9-81bd-69cc6221d71e.jpg)
