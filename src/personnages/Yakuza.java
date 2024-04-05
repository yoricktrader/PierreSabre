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
}