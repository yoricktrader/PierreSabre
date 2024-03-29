package personnages;

public class Humain {
	private String nom;
	private String boisson_favorite;
	private int argent;
	
	public Humain(String nom, String boisson_favorite, int argent) {
		this.nom = nom;
		this.boisson_favorite = boisson_favorite;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getargent() {
		return argent;
	}
	
	public String direBonjour() {
		return " Bonjour ! Je m’appelle" + getNom()+" et j’aime boire du " + boisson_favorite;
	}
	
	public String boire() {
		return"  Mmmm, un bon verre de " + boisson_favorite + "! GLOUPS !" ;
	}
	
	public String acheter(String bien,int prix) {
		if (argent>=prix) {
			argent=argent-prix;
			return "J'ai " +argent +"sous en poche. Je peux m'acheter " + bien + "à "+prix;
		}
		else {return "Je n'ai plus que " +argent +"sous en poche. Je ne peux pas m'acheter " + bien + "à "+prix;}
	}
	public int perdreArgent(int perte) {
		argent=argent-perte;
		return argent;
	}
	
	public int gagnerArgent(int gain) {
		argent=argent+gain;
		return argent;
	}
	
	public String prendreParole() {
		return "(" + nom + ")" + " - ";
	}
	
	public String parler(String texte) {
		return prendreParole() + texte;
	}
}

	