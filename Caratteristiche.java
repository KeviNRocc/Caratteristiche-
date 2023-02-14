import java.util.Scanner;
public class Caratteristiche {
	
	//attributi
	String descr;
	int punt;
	
	//costruttore

	public Caratteristiche(String descr) {
		this.descr = descr;
		this.punt = 0;
	}
	
	//get/set
	public String getDescr() {
		return descr;
	}

	public int getPunt() {
		return punt;
	}
	//metodi
	
	private boolean valido(int punt) {
		
		if(punt >= 1 && punt <= 10 )
			return true;
		else
			return false;
			
	}
	
	public void setPunteggio(int punt) {
		
		if(valido(punt))
			this.punt = punt;
	}
	
	public void setPunteggio() {
		
		Scanner t = new Scanner(System.in);
		
		do {
			
			System.out.println("inserisci il punteggio: ");
			punt = t.nextInt();
			
			if(!valido(punt))
				System.out.println("il punteggio inserito non è compreso tra 1 e 10.");
			else
				setPunteggio(punt);
			
		}while(!valido(punt));
		
		
		
			
	}

}
