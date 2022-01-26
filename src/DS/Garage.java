package DS;

import java.util.ArrayList;


//class Garage
public class Garage implements IVehicule{
	//d�claration des attributs
	
	public String nom;
	public String adr;
	public ArrayList<IVehicule> listVehicule = new ArrayList<IVehicule>();
	// methode permet d'ajouter un objet v(v�hicule) dans la listVehicule
public void ajouter(IVehicule v) {
	listVehicule.add(v);
}
//methode permet de supprimer un objet v(v�hicule) de la listVehicule
	public void enlever(IVehicule v) 
	//exception pour les v�hicule qui n'existe pas
			throws GarageException {
		if (listVehicule.contains (v))
			listVehicule.remove(v);
	
	    else throw (new GarageException());
}
	//methode permet d'afficher les v�hicules de garage
	public void afficher() {
		for (IVehicule G : listVehicule) {
			G.afficher();
	}
	}
	//V�rifier que les deux v�cules ont le meme ID ou non
	
	/*
	public boolean equals(Object o) {	
		
		return this.ID == ((IVehicule )o).ID;
	}
	*/

	}
