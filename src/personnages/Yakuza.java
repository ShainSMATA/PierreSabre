package personnages;


public class Yakuza extends Humain {
	
	private String clan;
	private int reputation=0;
	
	public Yakuza(String nom, String boissonfavorite, int nbargent, String clan) {
		super(nom, boissonfavorite, nbargent);
		this.clan = clan;
	}
	
	
	

	
	public int getReputation() {
		return reputation;
	}





	public void extorquer(Commercant victime) {
		
	
		reputation += 1; 
		
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() +", si tu tiens à la vie donne moi ta bourse !");
		int nbargentextorquer=victime.seFaireExtorquer();
		gagnerArgent(nbargentextorquer);
		parler("J’ai piqué les "+ nbargentextorquer +" sous de "+ victime.getNom() +", ce qui me fait "+getNbargent()+" sous dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		int argentPerdu = nbargent;
		reputation--;
		parler("Je m'inclines , so long ");
		nbargent = 0;	
		return argentPerdu ;
	}
	
	public void gagner(int gain) {
		int argentg = gain;
		nbargent = nbargent + gain;
		reputation++;
		parler(" Ce ronin pensait vraiment battre "+ getNom() + " du clan de " + clan + " Je l'ai dépouillé de ses " + gain + " sous ");	
	}

	
}