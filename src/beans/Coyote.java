package beans;

public class Coyote {

	private String prenom = "moi";
	private String nom;
	
	public String getNom(){
		return nom;
	}
	/**
	 * get the firstname
	 * @return
	 */
	public String getPrenom() {
	return this.prenom;
	}
	
	/**
	 * Set the name
	 * @param nom
	 */
	public void setNom(String nom){
		this.nom=nom;
	}
	public void setPrenom( String prenom ) {
	this.prenom = prenom;
	}

}
