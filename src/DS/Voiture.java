package DS;
//class camion impliment� de l'interface IVehicule
public class Voiture implements IVehicule{
	//d�claration de les attributs de class Camion
	public String marque;
	public String ID;
	public String Couleur;
	//Constructeur de class voiture
	public Voiture(String marque, String iD, String couleur) {
		super();
		this.marque = marque;
		ID = iD;
		Couleur = couleur;
	}
	//methode afficher impliment� de l'interface IVehicule permet d'afficher les informations du voiture
	public void afficher() {
		System.out.println("Voiture : marque = " + marque + ", ID = " + ID + ", Couleur = " + Couleur + "");
	}

	}
	


