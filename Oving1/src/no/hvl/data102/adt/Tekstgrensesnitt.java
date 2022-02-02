package no.hvl.data102.adt;

import java.util.Scanner;

import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;

public class Tekstgrensesnitt {
	
	
	
	// lese opplysningene om en FILM fra tastatur  
	 public Film lesFilm(){ 
		 
		 
		 Scanner scan = new Scanner(System.in);
//		 
		 System.out.println("Kva er film nummeret?");
		 
		 int filmNr = scan.nextInt();
//		 
//		 film.setFilmNr(scan.nextInt());
//		 
		 System.out.println("Kvem er film produsenten?");
		 
			String produsent = scan.nextLine();
//		 
//		 film.setFilmskaper(scan.nextLine());
//		 
		 System.out.println("Kva heiter filmen?");
			
			String tittel = scan.nextLine();
//		 
//		 film.setTittel(scan.nextLine());
//		 
		 System.out.println("Kva selskap produserte filem?");
			
			String firma = scan.nextLine();
//		 
//		 film.setFilmselskap(scan.nextLine());
//		 
		 System.out.println("Kva tid blei filem gitt ut?");
			
			int landseringsdato = scan.nextInt();
//		 
//		 film.setLanseringsdato(scan.nextInt());
//		 
		 System.out.println("Kva sjanger er filmen?");
		 
		 Sjanger sjanger = Sjanger.valueOf(scan.nextLine());
//		 
//		 film.setSjanger(Sjanger.valueOf(scan.nextLine()));
//		 
			
		 Film film = new Film(filmNr, produsent, tittel, landseringsdato,  sjanger, firma);
		 
		 return film; 
		 
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
		 
		 
		 
		 System.out.println("Antal filmar totalt: " + filma.antall());
		 
		 Sjanger[] sjangerTab = Sjanger.values();
		 
		 for(int i = 0; i < Sjanger.values().length ; i++) {
			 
			 System.out.println("Sjanger: " + sjangerTab[i] + ", og antall filmar i den sjangeren: " + filma.antall(sjangerTab[i]));
			 
		 }
			 
			
			 
			 
			 
			 
			 
		 
		 
		 
		 
		 
	  // TODO 
	 } 
	 // ... Ev. andre metoder 
	
}
