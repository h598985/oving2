package no.hvl.data102.adt;

public class Meny {
	
	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT filmarkiv;
	
	public Meny(FilmarkivADT filmarkiv){
		
		this.tekstgr = new Tekstgrensesnitt();
		this.filmarkiv = filmarkiv;
		
	}
	
	public void start() {
		
//		logg
		
	}

}
