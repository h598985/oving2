package no.hvl.data102.adt;

import java.util.Scanner;
import no.hvl.data102.*;

import no.hvl.data102.Film;
import no.hvl.data102.Filmarkiv;

public class Tekstgrensesnitt {
	
	
	
	// lese opplysningene om en FILM fra tastatur  
	 public Film lesFilm(){ 
		 Scanner scan = new Scanner(System.in);
		 
		 
		 
	  // TODO 
	  return null; 
	 } 
	 
	 // vise en film med alle opplysninger på skjerm (husk tekst for sjanger) 
	 public void visFilm(Film film) { 
		 if(film != null) {
			 
			 System.out.println("Filmselskap: " + film.getFilmselskap() + " \nFilm nummer: "+
			      film.getFilmNr()+ " \nTittel: " + film.getTittel() + "\n Produsent: " + 
					 film.getFilmskaper()+ " \nLanseringsdato: " + film.getLanseringsdato()+
					 " \nSjanger: "+ film.getSjanger());
			 
		 }
		 
		 
		
		 
	 } 
	 
	 // Skrive ut alle Filmer med en spesiell delstreng i tittelen 
	 public void skrivUtFilmDelstrengITittel(FilmarkivADT film, String delstreng)  {
		 
		 Film []filmer = film.soekTittel(delstreng);
				 
		 for(int i = 0 ; i < filmer.length;i++) {
			 
			 visFilm(filmer[i]);
		 }
	                                                        
	  
	 } 
	 
	 // Skriver ut alle Filmer av en produsent / en gruppe 
	 public void skrivUtFilmProdusent(FilmarkivADT film, String delstreng) { 
		 
		 Film []filmer = film.sokProdusent(delstreng);
		 
		 for(int i = 0 ; i < filmer.length; i++) {
			 
			 visFilm(filmer[i]);
		 }
		 
		
		 

	 } 
	 
	 // Skrive ut en enkel statistikk som inneholder antall Filmer totalt 
	 // og hvor mange det er i hver sjanger 
	 public void skrivUtStatistikk(FilmarkivADT filma) { 
		 
		 
		 
		 
	  // TODO 
	 } 
	 // ... Ev. andre metoder 
	
}
