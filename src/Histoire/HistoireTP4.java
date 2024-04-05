package Histoire;

import personnages.Commercants;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Humain prof = new Humain ("prof","kombucha",54);
		prof.parler(prof.direBonjour());
		prof.parler(prof.acheter("une boisson", 12));
		prof.parler(prof.boire());
		prof.parler(prof.acheter("un jeu ", 2));
		prof.parler(prof.acheter("un kimono", 50));
		
		Commercants marco = new Commercants ("Marco","thé",20);
		marco.parler(marco.direBonjour());
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.parler(marco.boire());
		
		Yakuza Yaku = new Yakuza("Yaku le noir","whisky",30,"Warsong",0 );
		Yaku.extorquer(marco);
		
		Ronin ror = new Ronin("Roro","shochu",60,1);
		ror.donner(marco);
	}
}
