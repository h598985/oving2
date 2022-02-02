package no.hvl.data102.adt;

import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;

public class Meny {
	
	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT filmarkiv;
	
	public Meny(FilmarkivADT filmarkiv){
		
		this.tekstgr = new Tekstgrensesnitt();
		this.filmarkiv = filmarkiv;
		
	}
	
	public void start() {
		
		Film film1 = new Film(2,"Mike", "Daredevil", 2022,Sjanger.ACTION, "HRN");
		
		filmarkiv.leggTilFilm(film1);
		
		Film film2 = new Film(4,"Mike", "The gone", 2022,Sjanger.ACTION, "HRN");
		filmarkiv.leggTilFilm(film2);
		
		tekstgr.visFilm(film1);
		
	
	}
	
	

}
