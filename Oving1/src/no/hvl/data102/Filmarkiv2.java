package no.hvl.data102;

import no.hvl.data102.adt.*;

public class Filmarkiv2 implements FilmarkivADT{
	
	private LinearNode<Film> start;
	
	private int antall;
	
	
	
	public Filmarkiv2() {
		
		start = null;
		antall = 0 ;
		
	}
	

	@Override
	public Film finnFilm(int nr) {
		
		LinearNode<Film> aktuelleFilm = start;
		
		Film film = null;
		
		boolean funne = false;
		
		while(!funne && (aktuelleFilm != null)) {
			
			if(aktuelleFilm.getElement().getFilmNr()==nr) {
				
				film = aktuelleFilm.getElement();
				funne = true;
			}
			else {
				aktuelleFilm = aktuelleFilm.getNeste();
			}
		
		}
		
		return film;
	
		
		
	}

	@Override
	public void leggTilFilm(Film film) {
		
		LinearNode<Film> nyFilm = new LinearNode();
		
		nyFilm.setElement(film);
		
		start = nyFilm;
		
		antall++;
		
		
		
	}

	@Override
	public boolean slettFilm(int filmnr) {
		
		LinearNode<Film> aktuelleFilm = start;
		
		boolean funne = false;
		
		while(!funne && aktuelleFilm != null) {
			
			if(aktuelleFilm.getElement().getFilmNr() == filmnr) {
				
				aktuelleFilm.setElement(start.getElement());
				slett();
				funne = true;
			}
			else {
				aktuelleFilm = aktuelleFilm .getNeste();
			}
		}
		
		return funne;
			
	
		
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		
		Film[] tab = new Film[antall];
		
		LinearNode<Film> aktuelleFilm = start;
		
		int i =0;
		
		while(aktuelleFilm != null) {
			
			if(start.getElement().getTittel().equals(delstreng)) {
				
				tab[i] = aktuelleFilm.getElement();
				i++;
				
				aktuelleFilm = aktuelleFilm.getNeste();
			}
			else {
				aktuelleFilm = aktuelleFilm.getNeste();
			}
		}
		
		return tab;
	}

	@Override
	public int antall(Sjanger sjanger) {
		
		int antallSjanger= 0;
		
		boolean funne = false;
		
		LinearNode<Film> aktuelleFilm = start;
		
		for(int i = 0; i < antall && !funne; i++) {
			
			if(aktuelleFilm.getElement().getSjanger().equals(sjanger)) {
				antallSjanger++;
			}
			aktuelleFilm = aktuelleFilm.getNeste();
			
		}
		return antallSjanger;
	}

	@Override
	public Film[] sokProdusent(String produsent) {
		
		Film[] prod = new Film[antall];
		
		LinearNode<Film> aktuelleFilm = start;
		
		int i =0;
		
		while(aktuelleFilm != null) {
			
			if(aktuelleFilm.getElement().getFilmskaper().equals(produsent)) {
				
				prod[i] = aktuelleFilm.getElement();
				i++;
				
			}
			
				aktuelleFilm = aktuelleFilm.getNeste();
		}
		
		return prod;
	}

	@Override
	public int antall() {
		return antall;
	}
	
	private void slett() {
		
		LinearNode<Film> film  = null;
		
		if(start != null) {
			
			start = start.getNeste();
			antall--;
		}
	}
	

}
