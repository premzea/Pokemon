// Collector.java
package model;


import java.util.ArrayList;

public class Collector{

    public Coleccion coleccion;

    public void addColeccion(String userName, int day, int month, int year){
        coleccion = new Coleccion(userName, day, month, year);

    }


    public void addAlbum(EnumRegion nombre, int numPokemones){
        coleccion.addAlbum(nombre, numPokemones);
    }

    public void addPokemon(EnumRegion nomRegion, Tipo especie, int puntosSalud,int puntosAtaque, int puntosPoder, int puntosDefensa, String nombre){
        // se puede agregar un pokemon en una region sin album?
        // necesito que revise cada nombre para asi decidir a que album agregarlo pero no se como hacer eso con el enum type
        Album[] albumes = coleccion.getAlbumes();
        for (int i=0; i< 8 ; i++){
            if (albumes[i].getnomRegion() == nomRegion){
                albumes[i].addPokemon(especie, puntosSalud, puntosAtaque, puntosPoder, puntosDefensa, nombre);
            }
        }
    }

    public void editAlbum(Mapa mapa, EnumRegion nomRegion, ArrayList <Pokemon> pokemones, int numPokemones){
        Album album = new Album(mapa, nomRegion, pokemones, numPokemones);
        Album[] albumes = coleccion.getAlbumes();
        for (int i=0; i< 8 ; i++){
            if (albumes[i].getnomRegion() == nomRegion){
                albumes[i] = album;
                i = 10;
            }
        }

    }

    public void deleteAlbum(EnumRegion nomRegion){
        Album[] albumes = coleccion.getAlbumes();
        for (int i=0; i< 8 ; i++){
            if (albumes[i].getnomRegion() == nomRegion){
                albumes[i] = null;
                i = 10;
            }
        }
    }

    public void editPokemon(EnumRegion nomRegion, Tipo especie, int puntosSalud,int puntosAtaque, int puntosPoder, int puntosDefensa, String nombre){
        Pokemon pokemon = new Pokemon(especie, puntosSalud, puntosAtaque, puntosPoder, puntosDefensa, nombre);
        Album[] albumes = coleccion.getAlbumes();
        for (int i=0; i< 8 ; i++){
            if (albumes[i].getnomRegion() == nomRegion){
                ArrayList <Pokemon> pokemones = albumes[i].getPokemones();
                for (int z = 0; z < pokemones.size(); z++){
                    if ((pokemones.get(z).getNombre()).equals(nombre)){
                        pokemones.set(z, pokemon);
                        z = pokemones.size() + 1;
                        i = 10;
                    }
                }
            }
        }

    }

    public void deletePokemon(EnumRegion nomRegion, String nombre){
        Album[] albumes = coleccion.getAlbumes();
        for (int i=0; i< 8 ; i++){
            if (albumes[i].getnomRegion() == nomRegion){
                ArrayList <Pokemon> pokemones = albumes[i].getPokemones();
                for (int z = 0; z < pokemones.size(); z++){
                    if ((pokemones.get(z).getNombre()).equals(nombre)){
                        pokemones.set(z, null);
                        z = pokemones.size() + 1;
                        i = 10;
                    }
                }
            }
        }

    }

    public Album getAlbum(EnumRegion nomRegion){
        Album[] albumes = coleccion.getAlbumes();
        Album album = null;
        for (int i=0; i<8; i++){
            if(albumes[i].getnomRegion() == nomRegion){
                album = albumes[i];
                i = 10;
            }
        }
        return album;
    }

    // cual diferencia set y add album?



}