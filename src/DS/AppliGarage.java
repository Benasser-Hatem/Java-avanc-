package DS;

//class main AppliGarage permet de création des objets et faire l'appel au methode
public class AppliGarage {

	public static void main(String[] args) {
	//exception pour catch que le véhicule n'existe pas
		
		//Création de 2 objets voiture
     Voiture V1 = new Voiture("Audi","102","Black");
     Voiture V2 = new Voiture("Mercedes","206","White");
   //Création de 2 objets camion
	 Camion C1 = new Camion("Volvo","405",12);
	 Camion C2 = new Camion("Honda","76",34);
		//ajoueter les objets voiture et camion au Garage qui regroupe les 2 véhicules voiture et camion
	Garage G1 = new Garage();
	G1.ajouter(V1);
	G1.ajouter(V2);
	G1.ajouter(C1);
	G1.ajouter(C2);
	//enlever la voiture V1 de Garage
	try {
	G1.enlever(V1);
	//appel au methode afficher pour afficher tous les informations des véhicules qui sont stocké au garage
		G1.afficher();
		
		}
		//affichage l'exception GarageException
		catch (GarageException e) {
			System.out.println("Attention, la véhicule n'existe pas ! ");
		}
	}
	}
