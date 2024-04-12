package model;
import java.util.ArrayList;


public class Album {
    private Mapa mapa;
    private EnumRegion nomRegion;
    private int numPokemones;
    private ArrayList<Pokemon> pokemones = new ArrayList<>();

    public Album(Mapa mapa, EnumRegion nomRegion, ArrayList <Pokemon> pokemones, int numPokemones) {
        this.mapa = mapa;
        this.nomRegion = nomRegion;
        this.pokemones = pokemones ;
        this.numPokemones = numPokemones;
        //ha de tener la lista ed pokemones?
    }

    public Album(EnumRegion nomRegion, int numPokemones) {
        this.nomRegion = nomRegion;
        this.numPokemones = numPokemones;
    }

    public static String[] getRegions(){
        EnumRegion[] enumRegiones = new EnumRegion[7];
        enumRegiones = EnumRegion.values();
        String[] regiones = new String[7] ;
        for(int i = 0; i<7; i++){
            regiones[i] = enumRegiones[i].name();
        }    

        return regiones;
    } 

    //mala practica muchos constructores?

    

    public int getNumPokemones() {
        return numPokemones;
    }

    public EnumRegion getnomRegion(){
        return nomRegion;
    }

    public Mapa getMapa() {
        return mapa;
    }

    public ArrayList <Pokemon> getPokemones(){
        return pokemones;
    }

    public ArrayList<String> getStrPokemones(){
        ArrayList<String> pokeNames = new ArrayList<>();
        for(int i = 0; i < pokemones.size(); i++){
            pokeNames.add(pokemones.get(i).getNombre());
        }
        return pokeNames;
    }

    public void setPokemones(ArrayList <Pokemon> pokemones) {
        this.pokemones = pokemones;
    }

    public void setNumPokemones(int numPokemones) {
        this.numPokemones = numPokemones;
    }

    public void setNomRegion(EnumRegion nomRegion) {
        this.nomRegion = nomRegion;
    }

    public void setMapa(Mapa mapa) {
        this.mapa = mapa;
    }

    public void editMapa(int numPokemones, Ubicacion ubicacion, String dirImagen, Date fecha){
        Mapa mapa = new Mapa(numPokemones, ubicacion, dirImagen, null);

    }

    public void eliminarPokemon(String nombre){
        int length = pokemones.size();
        for (int i = 0; i < length; i++){
            if (((pokemones.get(i)).getNombre()).equals(nombre)){
                pokemones.remove(i);
            }
        }
    }

    public static String enumToString(EnumRegion nom) {
        return nom.name();
    }

    public String toString(){
        String strMapa = "null";
        String strPokemones = "null";
        if (mapa != null){
            strMapa = mapa.toString();
        }
        if (!(pokemones.isEmpty())){
            strPokemones = "";
            for(int i = 0; i< pokemones.size(); i++){
                strPokemones = strPokemones + "\nPokemon " + (i + 1) + "\n" + pokemones.get(i).toString();
                //numPokemones = pokemones.size();
            }
        }
        String salida = "Mapa: " + strMapa + "\nRegion:"+ enumToString(nomRegion) + "\n" + "Numero de Pokemones: " + this.numPokemones + "\n" + "Pokemones: " + strPokemones;
        
        return salida;
    }

    public void addPokemon(Tipo especie, int puntosSalud,int puntosAtaque, int puntosPoder, int puntosDefensa, String nombre){
        Pokemon pokemon = new Pokemon(especie, puntosSalud, puntosAtaque, puntosPoder, puntosDefensa, nombre);
        pokemones.add(pokemon);
    }
}
