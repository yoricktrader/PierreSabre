package personnages;

public class Commercants extends Humain {
	
	public Commercants(String nom, String boisson_favorite, int argent) {
		super(nom,"thé",argent);
	}
	
    public int seFaireExtorquer() {
        int argentPerdu = this.getargent(); 
        argent=argent-argent;
        System.out.println("("+this.getNom()+") -" + " s'est fait extorquer de " + argentPerdu + " pièces d'or. Le monde est vraiment trop injuste !");
        return argentPerdu;
    }
    
    public void recevoir(int argent) {
        this.argent = argent + argent;
        System.out.println("("+this.getNom()+") -" + " reçoit " + argent + " pièces d'or avec déférence.");
    }
}
