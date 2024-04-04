package ui;

import java.util.Scanner;
import model.Collector;




public class PokeCollector {
	private Collector collector;
	private Scanner sc; 
	
	
	public PokeCollector() {
		sc= new Scanner(System.in);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PokeCollector pc= new PokeCollector();
		
	
		System.out.println("Iniciando la aplicación");
		
		int option=0;
		
		do{
			
			option= pc.showMenu();
			pc.executeOperation(option);
			
		}while (option!=0);
		
	}
	
	public int showMenu() {
		int option=0;

		System.out.println(
				"Menú principal, seleccione una opción\n" +
				"(1) Para crear una colección \n" +
				"(2) Para crear, editar o eliminar un álbum \n" +
				"(3) Para mostrar la información de los albums en la colección \n"+
				"(4) Para agregar un pokemon un álbum\n"+
				"(0) Para salir"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}
	
	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
			createCollection() ;
			break;
		case 2:
			showMenuAlbum() ;
			break;
		case 3:
			System.out.println(collector.coleccion.showAlbum());
			break;
	
		case 4:
			addPokeInAlbum();
			break;
		
		default:
			System.out.println("Error, opción no válida");
		
		}
	}

	private void createCollection() {
		System.out.println("Ingrese los datos de una colección");
		String nom;
		int day, month, year;

		System.out.println("Nombre de Usuario");
		nom= sc.nextLine();

		System.out.println("fecha");
		

		System.out.println("dia");
		day= sc.nextInt();
		sc.nextLine();

		System.out.println("mes");
		month= sc.nextInt();
		sc.nextLine();

		System.out.println("año");
		year= sc.nextInt();
		sc.nextLine();

		collector.addColeccion(nom, day, month, year);

		System.out.println("La Colección de "+ nom + " fue creada");
		
	}



	private void addPokeInAlbum() {
		System.out.println("Nombre de Album o Region: ");
		String nom = sc.nextLine();
		System.out.println("Nombre Pokemon: ");
		String nomPok = sc.nextLine();
		System.out.println("Especie\n (1) ELECTRICO \n(2) FANTASMA\n (3) AGUA\n (4) VENENO ");
		int especie = sc.nextInt();
		///** */
		System.out.println("Puntos de Salud: ");
		int puntosSalud = sc.nextInt();
		System.out.println("Puntos de Defensa: ");
		int puntosDefensa = sc.nextInt();
		System.out.println("Puntos de Ataque: ");
		int puntosAtaque = sc.nextInt();
		System.out.println("Puntos de Poder: ");
		int puntosPoder = sc.nextInt();

		collector.addPokemon(nom, especie, puntosSalud, puntosAtaque, puntosPoder, puntosDefensa, nom);
		// enum problem
		
		
	}

	private void showMenuAlbum() {
		int option=0;
		System.out.println(
				"Menú Album\n" +
				"(1) Para crear un álbum\n" +
				"(2) Para editar un álbum\n"+
				"(3) Para eliminar un álbum\n"+
				"(0) Para volver"
				);
		option= sc.nextInt();
		sc.nextLine();
		
		switch(option) {
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
		int numPokemones;
		// okay no puedo reemplazar todos los valores a menos que pueda guardar 
		// puedo tener otro tipo de objetos aqui o todo debe ser desde collector? todo desde collector obvio
		System.out.println("Nombre de Region de Album a editar: ");
		String nomRegion = sc.nextLine();
		System.out.println("(1) Editar numero de Pokemones \n(2) No editar numero de pokemones");
		int entry = sc.nextInt();
		switch (entry) {
			case 1:
				System.out.println("Nuevo numero de pokemones: ");
				numPokemones = sc.nextInt();
				break;
		
			case 2:
			    numPokemones = -1; 
				break;
		}
		// System.out.println("(1) Editar Pokemones \n (2) No editar pokemones");
		// entry = sc.nextInt();
		// switch (entry) {
		// 	case 1:
				
		// 		break;
		
		// 	default:
		// 		break;
		// }
		// okay album tiene subtipos de datos, como una lista de pokemones y un mapa ademas. Ofrezco la opcion de editarlos? 
		//Si hago eso creo que necesito mas funciones o hacerlo todo alli re intenso system out y aza. nose
		// que datos del album se supone que editemos, pues tiene subtipos entonces ofrecemos cambiar todas?
	}

	private void createAlbum() {

		if(collector.coleccion.hasAlbums()) {

			System.out.println("Digite los datos del album a crear ");


			System.out.println("Nombre de la región del album:");
			String nom= sc.nextLine();

		
			System.out.println("Cantidad de pokemones de la región");
			int num = sc.nextInt();
			sc.nextLine();
			

			collector.addAlbum(nom, num);
			// enum type problem

			System.out.println("El album \""+ nom +"\" ha sido creado con éxito\n");

			
		}else {
			System.out.println("No puede crearse el álbum porque se llegó al límite\n");
		}
		
	}
}
	

	
	
	


