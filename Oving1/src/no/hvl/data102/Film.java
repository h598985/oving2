package no.hvl.data102;

public class Film {
	
	private int filmNr;
	private  String filmskaper;
	private String tittel;
	private int lanseringsdato;
	private Sjanger sjanger;
	private String filmselskap;
	
	
	public Film() {
		
	}


	public Film(int filmNr, String filmskaper, String tittel, int lanseringsdato, Sjanger sjanger, String filmselskap) {
		super();
		this.filmNr = filmNr;
		this.filmskaper = filmskaper;
		this.tittel = tittel;
		this.lanseringsdato = lanseringsdato;
		this.sjanger = sjanger;
		this.filmselskap = filmselskap;
	}


	public int getFilmNr() {
		return filmNr;
	}


	public void setFilmNr(int filmNr) {
		this.filmNr = filmNr;
	}


	public String getFilmskaper() {
		return filmskaper;
	}


	public void setFilmskaper(String filmskaper) {
		this.filmskaper = filmskaper;
	}


	public String getTittel() {
		return tittel;
	}


	public void setTittel(String tittel) {
		this.tittel = tittel;
	}


	public int getLanseringsdato() {
		return lanseringsdato;
	}


	public void setLanseringsdato(int lanseringsdato) {
		this.lanseringsdato = lanseringsdato;
	}


	public Sjanger getSjanger() {
		return sjanger;
	}


	public void setSjanger(Sjanger sjanger) {
		this.sjanger = sjanger;
	}


	public String getFilmselskap() {
		return filmselskap;
	}


	public void setFilmselskap(String filmselskap) {
		this.filmselskap = filmselskap;
	}

	@Override
	public boolean equals(Object obj) {
		
		Film film = (Film) obj;
		
		if(this.filmNr == film.getFilmNr()) {

			return true;
		}
		return false;
	
	}


	@Override
	public int hashCode() {
		
		return this.getFilmNr();
	}
	
	public String toString() {
		
		String str = "Filmselskap: " + this.filmselskap+ 
				" \nTittel: " + this.tittel +
				" \nProdusent: " + this.filmskaper +
				" \nFilm nummer: " + this.filmNr;
		return str;
				
	}
	
	


}
