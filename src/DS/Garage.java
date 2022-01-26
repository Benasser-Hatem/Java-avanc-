package DS;

import java.util.ArrayList;


//class Garage
public class Garage implements IVehicule{
	//déclaration des attributs
	
	public String nom;
	public String adr;
	public ArrayList<IVehicule> listVehicule = new ArrayList<IVehicule>();
	// methode permet d'ajouter un objet v(véhicule) dans la listVehicule
public void ajouter(IVehicule v) {
	listVehicule.add(v);
}
//methode permet de supprimer un objet v(véhicule) de la listVehicule
	public void enlever(IVehicule v) 
	//exception pour les véhicule qui n'existe pas
			throws GarageException {
		if (listVehicule.contains (v))
			listVehicule.remove(v);
	
	    else throw (new GarageException());
}
	//methode permet d'afficher les véhicules de garage
	public void afficher() {
		for (IVehicule G : listVehicule) {
			G.afficher();
	}
	}
	//Vérifier que les deux vécules ont le meme ID ou non
	
	/*
	public boolean equals(Object o) {	
		
		return this.ID == ((IVehicule )o).ID;
	}
	*/

	}
