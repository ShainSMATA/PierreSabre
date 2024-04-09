package personnages;


public class Ronin extends Humain {
	
	int honneur = 0;
	
	public Ronin(String nom, String boissonfavorite, int nbargent) {
		super(nom, boissonfavorite, nbargent);	
	}
	
	public void donner(Commercant beneficiaire) {
		int donnation = (int) (getNbargent() * 0.10); 
		parler(beneficiaire.getNom() + " prend ces " + donnation + " sous");
		beneficiaire.recevoir(donnation);
		perdreArgent(donnation);
	}
	
	public  void provoquer(Yakuza adversaire) {
		int force = honneur *2;
		if (force > adversaire.getReputation()) {
			parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
	        int p=adversaire.perdre();
	        honneur++;
	        this.nbargent +=p;
		}else {
			
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(nbargent);
	        if (honneur > 0) {
	            honneur--;
	        }
			
		}
	    
	       
	}
	
	
}
