// Collector.java
package model;
//Todo: add pokemon, editar, eliminar albumes, controller, 

public class Collector{

    public Coleccion coleccion;

    public void addColeccion(String userName, int day, int month, int year){
        coleccion = new Coleccion(userName, day, month, year);

    }

    public void addAlbum(Mapa mapa, EnumRegion nomRegion, ArrayList <Pokemon> pokemones){
        Album album = new Album(mapa, nomRegion, pokemones);
        coleccion.addAlbum(album);
    }

    public void addPokemon(){

    }

}