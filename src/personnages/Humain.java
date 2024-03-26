package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int nbargent;
	
	
	public Humain(String nom,String boisson,int nbargent) {
		this.nom =nom;
		this.boisson=boisson;
		this.nbargent=nbargent;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArg() {
		return nbargent;
	}
	
	
	public void direBonjour() { //autre methode que dans gauloi savec prendre parole ()
		
		String message ="Bonjour ! Je m’appelle"+ nom + "et j’aime boire du" + boisson;
		parler(message);	
	}
	
    public void boire() {
		
		String message = "Mmmm, un bon verre de" + boisson + "! GLOUPS !";
		parler(message);	
	}

	
	public void parler(String message) {
		System.out.println(nom + " : " + message);	
	}
	
	
	public void acheter(String bien, int prix) {
		if(nbargent > prix) {
			String message = "Jai" + nbargent +"sous en poche. Je vais pouvoir m'offrir" + bien +" à" + prix + "sous";
			parler(message);
		}else {
			String message = "Je nai plus que"+ nbargent+ "sous en poche. Je ne peux même pas m'offrir"+ bien + "à"+ prix+ "sous";
			parler(message);
		}
	}
	
	
}
