package DS;
//class camion impliment� de l'interface IVehicule
public class Camion implements IVehicule{
	//d�claration de les attributs de class Camion
	public String marque;
	public String ID;
	public int proprietaire;
	//Constructeur de class camion
	public Camion( String marque, String iD, int proprietaire) {
		super();
		this.marque = marque;
		ID = iD;
		this.proprietaire = proprietaire;
	}
	//methode afficher impliment� de l'interface IVehicule permet d'afficher les informations du camion
	public void afficher() {
		System.out.println("Camion : marque = " + marque + ", ID = " + ID + ", proprietaire = " + proprietaire + ""); 
	}
	
	

}
