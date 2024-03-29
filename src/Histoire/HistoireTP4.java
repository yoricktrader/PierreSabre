package Histoire;

import personnages.Humain;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Humain prof = new Humain ("prof","kombucha",54);
		prof.parler(prof.acheter("une boisson", 12));

	}
}
