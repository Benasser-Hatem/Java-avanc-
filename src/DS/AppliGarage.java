package DS;

//class main AppliGarage permet de cr�ation des objets et faire l'appel au methode
public class AppliGarage {

	public static void main(String[] args) {
	//exception pour catch que le v�hicule n'existe pas
		
		//Cr�ation de 2 objets voiture
     Voiture V1 = new Voiture("Audi","102","Black");
     Voiture V2 = new Voiture("Mercedes","206","White");
   //Cr�ation de 2 objets camion
	 Camion C1 = new Camion("Volvo","405",12);
	 Camion C2 = new Camion("Honda","76",34);
		//ajoueter les objets voiture et camion au Garage qui regroupe les 2 v�hicules voiture et camion
	Garage G1 = new Garage();
	G1.ajouter(V1);
	G1.ajouter(V2);
	G1.ajouter(C1);
	G1.ajouter(C2);
	//enlever la voiture V1 de Garage
	try {
	G1.enlever(V1);
	//appel au methode afficher pour afficher tous les informations des v�hicules qui sont stock� au garage
		G1.afficher();
		
		}
		//affichage l'exception GarageException
		catch (GarageException e) {
			System.out.println("Attention, la v�hicule n'existe pas ! ");
		}
	}
	}
