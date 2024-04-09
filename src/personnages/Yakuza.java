package personnages;

public class Yakuza extends Humain {
	
	private String clan;
	private int reputation;
	
	public Yakuza(String nom, String boisson_favorite, int argent,String clan, int reputation) {
		super(nom,boisson_favorite,argent);
		this.clan= clan;
		this.reputation=reputation;
	}
	
	public void extorquer(Commercants victime) {
		argent = victime.getargent() + argent;
		this.parler( "Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		this.parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		this.parler("j'ai piqué les "+ victime.getargent() +" sous de "+ victime.getNom()+", ce qui me fait "+ argent +" sous dans ma poche. Hi ! Hi !");
		victime.seFaireExtorquer();	
	}
	
	public int perdre() {
		int argentperdu= this.argent;
		this.argent=0;
		this.parler("J'ai perdu mon duel et mes "+ argentperdu + " sous snif... J'ai desonhoré ler caln de "+this.clan);
		return argentperdu;
	}
	
	public int gagner(int gain) {
		this.argent = this.argent + gain;
		this.parler("Ce ronin pensait vraiment battre "+ this.getNom() + " du clan "+this.clan+ " ? Je l'ai depouillé de ses "+gain+" sous");
		return gain;
	}

	public int getReputation() {
		return reputation;
	}
		
}