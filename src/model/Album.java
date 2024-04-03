package model;

public class Album {
    private Mapa mapa;
    private EnumRegion nomRegion;
    private int numPokemones;

    public Album(Mapa mapa, EnumRegion nomRegion, int numPokemones) {
        this.mapa = mapa;
        this.nomRegion = nomRegion;
        this.numPokemones = numPokemones;
    }

    public double getNumPokemones() {
        return numPokemones;
    }

    public EnumRegion getnomRegion() {
        return nomRegion;
    }

    public Mapa getMapa() {
        return mapa;
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
}
