package model;
import java.util.ArrayList;


public class Album {
    private Mapa mapa;
    private EnumRegion nomRegion;
    private ArrayList<Pokemon> pokemones = new ArrayList<>();

    public Album(Mapa mapa, EnumRegion nomRegion, ArrayList <Pokemon> pokemones) {
        this.mapa = mapa;
        this.nomRegion = nomRegion;
        this.pokemones = pokemones ;
    }

    public ArrayList <Pokemon> getNumPokemones() {
        return pokemones;
    }

    public EnumRegion getnomRegion() {
        return nomRegion;
    }

    public Mapa getMapa() {
        return mapa;
    }

    public void setNumPokemones(ArrayList <Pokemon> pokemones) {
        this.pokemones = pokemones;
    }

    public void setNomRegion(EnumRegion nomRegion) {
        this.nomRegion = nomRegion;
    }

    public void setMapa(Mapa mapa) {
        this.mapa = mapa;
    }

    public void eliminarPokemon(String nombre){
        int length = pokemones.size();
        for (int i = 0; i < length; i++){
            if (((pokemones.get(i)).getNombre()).equals(nombre)){
                pokemones.remove(i);
            }
        }
    }
}
