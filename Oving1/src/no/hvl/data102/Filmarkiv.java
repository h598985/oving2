package no.hvl.data102;

import no.hvl.data102.adt.*;

public class Filmarkiv implements FilmarkivADT {

	private Film[] arkiv;
	
	int antall;

	public Filmarkiv(int kapasitet) {
		

		this.arkiv = new Film[kapasitet];
		
		antall  = 0;
	}

	@Override
	public Film finnFilm(int nr) {
		
		Film film = null;
	
		for(int i = 0; i < antall; i++) {
			
			if(arkiv[i].getFilmNr() == nr) {
				
				film = arkiv[i];
			}
		}
		
		return film;

	}

	@Override
	public void leggTilFilm(Film nyFilm) {

		if (full()) {

			utvid();

		}

		arkiv[antall] = nyFilm;
		antall++;

	}

	@Override
	public boolean slettFilm(int filmnr) {
		
		boolean resultat = false;
	
		
		for (int i = 0; i < antall; i++) {

			if (arkiv[i].getFilmNr() == filmnr) {
				antall--;
				arkiv[i] = arkiv[antall];
				arkiv[antall] = null;
				
				resultat = true;
			}
			else {
				resultat = false;
			}
		}
			return resultat;

	}

	@Override
	public Film[] soekTittel(String delstreng) {
		
		Film[]film = new Film[antall];
		
		for(int i = 0; i < antall; i++) {
			if(arkiv[i].getTittel().contains(delstreng)) {
				
				film[i] = arkiv[i];
				
			}
			else {
				film = null;
			}
		}
		
		return film;
	}

	@Override
	public int antall(Sjanger sjanger) {
		
		int tall = 0;
		
		int i = 0;
		
		boolean sam = false;
		
		while(!sam && i < antall ) {
			
			sam = false;
			
			if(arkiv[i].getSjanger().equals(sjanger)) {
				sam = true;
				tall++;
			}
			else {
				i++;
			}
		}
		return tall;
		
	}

	@Override
	public int antall() {
		return antall;
	}

	private void utvid() {

		Film[] nyarkiv = new Film[arkiv.length * 2];

		for (int i = 0; i < arkiv.length; i++) {

			nyarkiv[i] = arkiv[i];
		}

		arkiv = nyarkiv;
	}
	
	@Override
	
	public Film[] sokProdusent(String produsent) {
		

		Film[]film = new Film[antall];
		
		for(int i = 0; i < antall; i++) {
			if(arkiv[i].getTittel().equals(produsent)) {
				
				film[i] = arkiv[i];
				
			}
			else {
				film = null;
			}
		}
		
		return film;

		
	}
	
	private boolean full() {
		return antall >= arkiv.length;
	}

}
