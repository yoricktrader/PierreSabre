package personnages;

public class Humain {
	private String nom;
	private String boisson_favorite;
	protected int argent;
	protected int nbconnaissance=0;
	protected Humain[] memoire;
	
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
		return "Bonjour ! Je m’appelle " + getNom()+" et j’aime boire du " + boisson_favorite;
	}
	
	public String boire() {
		return"Mmmm, un bon verre de " + boisson_favorite + "! GLOUPS !" ;
	}
	
	public String acheter(String bien,int prix) {
		if (argent>=prix) {
			int a=argent;
			argent=argent-prix;
			return "J'ai " +a +" sous en poche. Je peux m'acheter " + bien + " à "+prix+" sous";
		}
		else {return "Je n'ai plus que " +argent +" sous en poche. Je ne peux pas m'acheter " + bien + " à "+prix+" sous";}
	}
	
	protected int perdreArgent(int perte) {
		argent=argent-perte;
		return argent;
	}
	
	protected int gagnerArgent(int gain) {
		argent=argent+gain;
		return argent;
	}
	
	
 	public String prendreParole() {
		return "(" + nom + ")" + " - ";
	}
	
	protected void parler(String texte) {
		System.out.println( prendreParole() + texte);
	}
	
	private void repondre(Humain autreHumain) {
		autreHumain.direBonjour();
	}
	
	public void listerConnaissance(Humain autreHumain) {
		
	}
	
	private void memoriser(Humain autreHumain) {
		if(this.nbconnaissance<30) {
			this.nbconnaissance = this.nbconnaissance +1;
			this.memoire[this.nbconnaissance] = autreHumain;
		}
		else {
			for( int i =0; i<29; i++) {
				this.memoire[i] = this.memoire[i+1];
			}
			this.memoire[29] = autreHumain;
		}
		
	}
	
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		this.direBonjour();
		autreHumain.repondre(this);
		autreHumain.memoriser(this);
		this.memoriser(autreHumain);
	}
}

	