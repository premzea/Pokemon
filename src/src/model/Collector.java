// Collector.java
package model;


import java.util.ArrayList;

public class Collector{

    public Coleccion coleccion;

    public void addColeccion(String userName, int day, int month, int year){
        coleccion = new Coleccion(userName, day, month, year);

    }


    public void addAlbum(String nom, int numPokemones){
        EnumRegion nomRegion = stringToEnum(nom);
        coleccion.addAlbum(nomRegion, numPokemones);
    }

    public String[] getRegions(){
        return  Album.getRegions();
    }
    public void addPokemon(String nom, String esp, int puntosSalud,int puntosAtaque, int puntosPoder, int puntosDefensa, String nombre){
        Tipo especie = stringToEnumT(esp);
        EnumRegion nomRegion = stringToEnum(nom);
        // se puede agregar un pokemon en una region sin album?
        // necesito que revise cada nombre para asi decidir a que album agregarlo pero no se como hacer eso con el enum type
        Album[] albumes = coleccion.getAlbumes();
        for (int i=0; i< 7 ; i++){
            if(albumes[i] != null){
                if (albumes[i].getnomRegion() == nomRegion){
                    albumes[i].addPokemon(especie, puntosSalud, puntosAtaque, puntosPoder, puntosDefensa, nombre);
                }
            }
        }
    }

    public static EnumRegion stringToEnum(String input) {
        return EnumRegion.valueOf(input.toUpperCase());
    }

    public static Tipo stringToEnumT(String input) {
        return Tipo.valueOf(input.toUpperCase());
    }

    public static String enumToString(EnumRegion nom) {
        return nom.name();
    }

    public void editAlbum(Mapa mapa, String nom, ArrayList <Pokemon> pokemones, int numPokemones){
        EnumRegion nomRegion = stringToEnum(nom);
        Album album = new Album(mapa, nomRegion, pokemones, numPokemones);
        // enum problem
        Album[] albumes = coleccion.getAlbumes();
        int output = 0;
        //searchAlbum
        for (int i=0; i< 7 ; i++){
            if (albumes[i] == null){
                i = 10;
            } else {
            if (albumes[i].getnomRegion() == nomRegion){
                if(album.getMapa() == null && albumes[i].getMapa() != null){
                    album.setMapa(albumes[i].getMapa()); 
                }
                
                if(album.getNumPokemones() == -1){
                    // error logica creo, osea cual es la forma vacia del un objeto int
                    album.setNumPokemones(albumes[i].getNumPokemones()); 
                }

                
                if(album.getPokemones() == null){
                    album.setPokemones(albumes[i].getPokemones()); 
                }

                albumes[i] = album;
                i = 10;
            }}
        }
    }

    public void deleteAlbum(String nom){
        EnumRegion nomRegion = stringToEnum(nom);
        Album[] albumes = coleccion.getAlbumes();
        for (int i=0; i< 7 ; i++){
            if (albumes[i].getnomRegion() == nomRegion){
                albumes[i] = null;
                i = 10;
            }
        }
    }

    public void editPokemon(String nom, String esp, int puntosSalud,int puntosAtaque, int puntosPoder, int puntosDefensa, String nombre){
        Tipo especie = stringToEnumT(esp);
        EnumRegion nomRegion = stringToEnum(nom);
        Pokemon pokemon = new Pokemon(especie, puntosSalud, puntosAtaque, puntosPoder, puntosDefensa, nombre);
        Album[] albumes = coleccion.getAlbumes();
        for (int i=0; i< 7 ; i++){
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

    public void deletePokemon(String nom, String nombre){
        EnumRegion nomRegion = stringToEnum(nom);
        Album[] albumes = coleccion.getAlbumes();
        for (int i=0; i< 7 ; i++){
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

    public Album getAlbum(String nom){
        EnumRegion nomRegion = stringToEnum(nom);
        Album[] albumes = coleccion.getAlbumes();
        Album album = null;
        for (int i=0; i<7; i++){
            if(albumes[i].getnomRegion() == nomRegion){
                album = albumes[i];
                i = 10;
            }
        }
        return album;
    }

    

    // cual diferencia set y add album?



}