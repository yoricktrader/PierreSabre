package personnages;

public class Ronin extends Humain {
	private int honneur =1;
	
	public Ronin(String nom, String boisson_favorite, int argent,int honneur) {
		super(nom,boisson_favorite,argent);
		this.honneur=honneur;
	}
	
	public void donner(Commercants beneficiaire) {
		this.parler(beneficiaire.getNom()+" prend ces "+ this.getargent()*0.1+" sous");
		this.parler(beneficiaire.getNom()+" "+this.getargent()*0.1+" sous! Je te remercie genereux donnateur.");
	}
}