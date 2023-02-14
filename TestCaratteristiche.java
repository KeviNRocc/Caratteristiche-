import java.util.Scanner;
public class TestCaratteristiche {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("inserisci la descrizione della 1a persona: ");
		String descriz1 = k.nextLine();
		
		Caratteristiche tinder1 = new Caratteristiche(descriz1);
		
		tinder1.setPunteggio();
		
		System.out.println("inserisci la descrizione della 2a persona: ");
		String descriz2 = k.nextLine();
		
		Caratteristiche tinder2 = new Caratteristiche(descriz2);
		
		tinder2.setPunteggio();
		
		
		if(tinder1.getPunt() - tinder2.getPunt() >= -1 && tinder1.getPunt() - tinder2.getPunt() <= 1)
			System.out.println("le due persone sono compatibili");
		else
			System.out.println("le due persone non sono compatibili");
		
		
		

	}

}
