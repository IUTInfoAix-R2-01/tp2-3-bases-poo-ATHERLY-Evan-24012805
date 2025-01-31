package Prof;

public class Personne {
	private String Nom,Prenom;
	
	Personne(String prenom){
		this.Prenom = prenom;
	}
	
	Personne(String Prenom, String Nom){
		this.Nom = Nom;
		this.Prenom = Prenom;
	}
	
	public String getNom() {
		return this.Nom;
	}
	public String getPrenom() {
		return this.Prenom;
	}
	
	public String toString() {
		if (this.Nom == null) {
			return  "prenom : "+ this.Prenom;
		}
		return  "prenom : "+ this.Prenom +", nom : " + this.Nom ;
	}
}
