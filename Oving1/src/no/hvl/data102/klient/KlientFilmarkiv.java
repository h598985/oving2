package no.hvl.data102.klient;

import no.hvl.data102.Filmarkiv;
import no.hvl.data102.adt.FilmarkivADT;
import no.hvl.data102.adt.Meny;

public class KlientFilmarkiv {
	
public static void main (String[] args) {
		
		FilmarkivADT filma = new Filmarkiv(100);
		
		Meny meny = new Meny(filma);
		
		meny.start();
	}


}
