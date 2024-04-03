package model;

public class Pokemon{

    private Tipo especie;
    private int puntosSalud;
    private int puntosAtaque;
    private String nombre;
    private int puntosPoder;
    private int puntosDefensa;

    public Pokemon(Tipo especie, int puntosSalud,int puntosAtaque, int puntosPoder, int puntosDefensa, String nombre){
        this.especie = especie;
        this.puntosSalud = puntosSalud;
        this.puntosAtaque = puntosAtaque;
        this.puntosPoder = puntosPoder;
        this.puntosDefensa = puntosDefensa;
        this.nombre = nombre;
    }

    public int getPuntosSalud(){
        return puntosSalud;
    }

    public int getPuntosAtaque(){
        return puntosAtaque;
    }

    public int getPuntosPoder(){
        return puntosPoder;
    }

    public int getPuntosDefensa(){
        return puntosDefensa;
    }

    public String getNombre(){
        return nombre;
    }



    public void setEspecie(Tipo tipo){
        this.especie =tipo;
    }

    
    public void setPuntosSalud(int puntosSalud){
        this.puntosSalud = puntosSalud;
    }

    public void setPuntosPoder(int puntosPoder){
        this.puntosPoder = puntosPoder;
    }

    public void setPuntosDefensa(int puntosDefensa){
        this.puntosDefensa = puntosDefensa;
    }

    public void setPuntosAtaque(int puntosAtaque){
        this.puntosAtaque = puntosAtaque;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

}