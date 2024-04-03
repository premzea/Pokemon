package ui;

import java.util.Scanner;
import model.Coleccion;




public class PokeCollector {
	private Coleccion myCollection;
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
			System.out.println(myCollection.showAlbum());
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


		//myCollection = new Coleccion(nom, new Date(day, month, year));
		

		myCollection = new Coleccion(nom, day, month, year);

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
		//** */
	}
	private void editAlbum() {
		//* */
	}
	private void createAlbum() {

		if(myCollection.hasAlbums()) {

			System.out.println("Digite los datos del album a crear ");


			System.out.println("Nombre de la región del album:");
			String nom= sc.nextLine();

		
			System.out.println("Cantidad de pokemones de la región");
			int num = sc.nextInt();
			sc.nextLine();
			

			myCollection.addAlbum(nom, num);

			System.out.println("El album \""+ nom +"\" ha sido creado con éxito\n");

			
		}else {
			System.out.println("No puede crearse el álbum porque se llegó al límite\n");
		}
		
	}
}
	

	
	
	


