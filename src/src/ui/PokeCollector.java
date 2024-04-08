package ui;

import java.util.Scanner;
import model.Collector;
// se supone que tiene que crear una coleccion 

public class PokeCollector {
	private Collector collector;
	private Scanner sc;

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
				System.out.println("\n" + collector.coleccion.showAlbum() + "\n");
				break;

			case 4:
				addPokeInAlbum();
				break;

			default:
				System.out.println("Error, opción no válida");

		}
	}

	private void createCollection() {
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
		String[] names = new String[8];
		names = collector.coleccion.getAlbumNames();
		System.out.println("A que album desea adicionar un pokemon: ");
		for (int i = 0; i < 8; i++) {
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
		System.out.println("Nombre Pokemon: ");
		String nomPok = sc.nextLine();
		System.out.println("Especie\n (1) ELECTRICO \n(2) FANTASMA\n (3) AGUA\n (4) VENENO ");
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
		// enum problem

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
		collector.coleccion.getAlbumes();
		if (collector.coleccion.getAlbumes()[0] != null) {
			int numPokemones = -1;
			// okay no puedo reemplazar todos los valores a menos que pueda guardar
			// puedo tener otro tipo de objetos aqui o todo debe ser desde collector? todo
			// desde collector obvio
			System.out.println("Nombre de Region de Album a editar: ");
			String nomRegion = sc.nextLine();
			System.out.println("(1) Editar numero de Pokemones \n(2) No editar numero de pokemones");
			int entry = sc.nextInt();
			switch (entry) {
				case 1:
					System.out.println("Nuevo numero de pokemones: ");
					numPokemones = sc.nextInt();
					break;

				default:
					break;
			}
			// System.out.println("(1) Editar Pokemones \n (2) No editar pokemones");
			// entry = sc.nextInt();
			// switch (entry) {
			// case 1:
			// break;
			// default:
			// break;
			// }
			// okay album tiene subtipos de datos, como una lista de pokemones y un mapa
			// ademas. Ofrezco la opcion de editarlos?
			// Si hago eso creo que necesito mas funciones o hacerlo todo alli re intenso
			// system out y aza. nose
			// que datos del album se supone que editemos, pues tiene subtipos entonces
			// ofrecemos cambiar todas?

			int output = collector.editAlbum(null, nomRegion, null, numPokemones);

			switch (output) {
				case 1:
					System.out.println("La edicion fue exitosa \n");
					break;

				case 0:
					System.out.println("El album a editar no existe \n");
					break;
			}
		} else {
			System.out.println("No has creado un album para editar.");
		}

	}

	private void createAlbum() {

		if (collector.coleccion.hasAlbums()) {

			System.out.println("Digite los datos del album a crear ");

			System.out.println("Nombre de la región del album \n (1) KANTO \n(2) JOTHO \n (3) HOEN");
			int entry = sc.nextInt();
			sc.nextLine();
			String nom;
			switch (entry) {
				case 1:
					nom = "KANTO";
					break;

				case 2:
					nom = "JOTHO";
					break;

				default:
					nom = "HOEN";
					break;

			}

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
