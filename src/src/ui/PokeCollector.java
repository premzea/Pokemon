package ui;

import java.util.ArrayList;
import java.util.Scanner;
import model.Collector;
// se supone que tiene que crear una coleccion 

public class PokeCollector {
	private Collector collector;
	private Scanner sc;
	private static final int albumSize = 7;

	public PokeCollector() {
		collector = new Collector();
		sc = new Scanner(System.in);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PokeCollector pc = new PokeCollector();

		System.out.println("Iniciando la aplicación");

		int option = 0;

		do {

			option = pc.showMenu();
			pc.executeOperation(option);

		} while (option != 0);

	}

	public int showMenu() {
		int option = 0;

		System.out.println(
				"Menú principal, seleccione una opción\n" +
						"(1) Para crear una colección \n" +
						"(2) Para crear, editar o eliminar un álbum \n" +
						"(3) Para mostrar la información de los albums en la colección \n" +
						"(4) Para agregar un pokemon un álbum\n" +
						"(0) Para salir");
		option = sc.nextInt();
		sc.nextLine();
		return option;
	}

	public void executeOperation(int operation) {

		switch (operation) {
			case 0:
				System.out.println("Bye!");
				break;
			case 1:
				createCollection();
				break;
			case 2:
				showMenuAlbum();
				break;
			case 3:
				if (collector.coleccion.getAlbumes()[0] != null) {
					System.out.println("\n" + collector.coleccion.showAlbum() + "\n");
				} else {
					System.out.println("No, No, No hay albumes \n");
				}

				break;

			case 4:
				addPokeInAlbum();
				break;

			default:
				System.out.println("Error, opción no válida");

		}
	}

	private void createCollection() {
		// no se puede crear mas de una coleccion
		System.out.println("Ingrese los datos de una colección\n");
		String nom;
		int day, month, year;

		System.out.println("Nombre de Usuario");
		nom = sc.nextLine();

		System.out.println("\nfecha");

		System.out.println("dia");
		day = sc.nextInt();
		sc.nextLine();

		System.out.println("mes");
		month = sc.nextInt();
		sc.nextLine();

		System.out.println("año");
		year = sc.nextInt();
		sc.nextLine();

		collector.addColeccion(nom, day, month, year);

		System.out.println("\nLa Colección de " + nom + " fue creada\n");

	}

	private void addPokeInAlbum() {
		String[] names = new String[albumSize];
		names = collector.coleccion.getAlbumNames();
		System.out.println("A que album desea adicionar un pokemon: ");
		for (int i = 0; i < albumSize; i++) {
			if (names[i] != null) {
				System.out.println((i + 1) + " " + names[i]);
			}
		}
		int entry = sc.nextInt();
		sc.nextLine();
		String nom;
		switch (entry) {
			case 1:
				nom = names[entry - 1];
				break;

			case 2:
				nom = names[entry - 1];
				break;

			default:
				nom = names[entry - 1];
				break;

		}
		ArrayList<String> pokemones = collector.coleccion.getAlbumes()[entry - 1].getStrPokemones();
		// can i add a show pokemones functionality? quiero
		System.out.println("Nombre Pokemon: ");
		String nomPok = sc.nextLine();
		for (int i = 0; i < pokemones.size(); i++) {
			if (nomPok.equals(pokemones.get(i))) {
				System.out.println("Ese pokemon ya existe en el album. Agrega un nuevo pokemon.");
				System.out.println("Nombre Pokemon: ");
				nomPok = sc.nextLine();
				i = pokemones.size() - 1;
			}
		}
		System.out.println("Especie\n(1) ELECTRICO \n(2)FANTASMA\n (3)AGUA\n (4)VENENO ");
		// hacer lo mismo del enum que hice con regiones? no se si amerite pues en esta
		// los tipos is se pueden repetir
		int numEsp = sc.nextInt();
		String especie = "";
		switch (numEsp) {
			case 1:
				especie = "Electrico";
				break;

			case 2:
				especie = "Fantasma";
				break;
			case 3:
				especie = "Agua";
				break;
			case 4:
				especie = "Veneno";
				break;
		}
		/// ** */
		System.out.println("Puntos de Salud: ");
		int puntosSalud = sc.nextInt();
		System.out.println("Puntos de Defensa: ");
		int puntosDefensa = sc.nextInt();
		System.out.println("Puntos de Ataque: ");
		int puntosAtaque = sc.nextInt();
		System.out.println("Puntos de Poder: ");
		int puntosPoder = sc.nextInt();

		collector.addPokemon(nom, especie, puntosSalud, puntosAtaque, puntosPoder, puntosDefensa, nomPok);
		// enum problems

		System.out.println("\npokemon agregado exitosamente\n");

	}

	private void showMenuAlbum() {
		if (collector.coleccion == null) {
			System.out.println("There is no collection. Create one first.");
			createCollection();
		}
		int option = 0;
		System.out.println(
				"\nMenú Album\n" +
						"(1) Para crear un álbum\n" +
						"(2) Para editar un álbum\n" +
						"(3) Para eliminar un álbum\n" +
						"(0) Para volver");
		option = sc.nextInt();
		sc.nextLine();

		switch (option) {
			case 1:
				createAlbum();
				break;
			case 2:
				editAlbum();
				break;
			case 3:
				deleteAlbum();
				break;

		}

	}

	private void deleteAlbum() {
		System.out.println("Nombre de Region: ");
		String nomRegion = sc.nextLine();
		collector.deleteAlbum(nomRegion);
		// enum type problem
	}

	private void editAlbum() {
		if (collector.coleccion.getAlbumes()[0] != null) {
			int numPokemones = -1;
			String[] albumNames = new String[albumSize];
			albumNames = collector.coleccion.getAlbumNames();
			System.out.println("Nombre de Album a editar");
			for (int i = 0; i < albumSize; i++) {

			}
			for (int i = 0; i < albumSize; i++) {
				if (albumNames[i] != null) {
					System.out.println("(" + (i + 1) + ") " + albumNames[i]);
				}

			}
			// Lo paso a solo los albues que existen? que el usuario no lo pueda cagar?
			int entry =  sc.nextInt();
			String nomRegion = "";
			nomRegion = albumNames[entry-1];
			System.out.println("(1) Editar numero de Pokemones \n(2) No editar numero de pokemones");
			int choice = sc.nextInt();
			switch (choice) {
				case 1:
					System.out.println("Nuevo numero de pokemones: ");
					numPokemones = sc.nextInt();
					break;

				default:
					break;
			}

			collector.editAlbum(null, nomRegion, null, numPokemones);

			System.out.println("La edicion fue exitosa \n");

		} else {
			System.out.println("No has creado un album para editar.");
		}

	}

	private void createAlbum() {
		if (collector.coleccion.hasAlbums()) {
			// has albums revisa que todavia le quepan albumes, max albumSize.
			System.out.println("Digite los datos del album a crear ");
			String[] albumNames = new String[albumSize];
			albumNames = collector.coleccion.getAlbumNames();
			String[] regiones = new String[albumSize];
			regiones = collector.getRegions();
			for (int z = 0; z < albumSize; z++) {
				if (albumNames[z] != null) {
					for (int i = 0; i < albumSize; i++) {

						if (albumNames[z] == regiones[i]) {
							regiones[i] = null;
						}
					}
				}
			}
			System.out.println("\nNombre de la región del album");
			int z = 0;
			for (int i = 0; i < albumSize; i++) {
				if (regiones[i] != null) {
					System.out.println("(" + (z + 1) + ") " + regiones[i]);
					z = z + 1;
				}

			}
			System.out.println();

			int entry = sc.nextInt();
			sc.nextLine();
			String nom;
			nom = regiones[entry - 1];
			System.out.println("Cantidad de pokemones de la región");
			int num = sc.nextInt();
			sc.nextLine();

			collector.addAlbum(nom, num);
			// enum type problem

			System.out.println("El album \"" + nom + "\" ha sido creado con éxito\n");

		} else {
			System.out.println("No puede crearse el álbum porque se llegó al límite\n");
		}

	}
}
