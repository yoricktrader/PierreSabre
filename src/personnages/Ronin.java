package personnages;

public class Ronin extends Humain {
	private int honneur =1;
	
	public Ronin(String nom, String boisson_favorite, int argent,int honneur) {
		super(nom,boisson_favorite,argent);
		this.honneur=honneur;
	}
	
	public void donner(Commercants beneficiaire) {
		this.parler(beneficiaire.getNom()+" prend ces "+ this.getargent()*0.1+" sous");
		beneficiaire.parler(this.getargent()*0.1+" sous! Je te remercie genereux donnateur.");
	}
	
	public void provoquer(Yakuza ennemie) {
		this.parler("Je t'ai retrouver vemrine, tu vas payer");
	
		if((this.honneur*2) >= ennemie.getReputation()) { 
			this.parler("Je t'ai eu petit yakusa");
			ennemie.perdre();
			}
		else {
			this.parler("J'ai perdu contre ce yakusa mon honneur et ma bourse m'ont donc etaient derober");
			ennemie.gagner(this.getargent());
		}
	}
}