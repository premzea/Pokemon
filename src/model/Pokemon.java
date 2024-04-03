package model;

public class Pokemon{

    private Tipo tipo;
    private int puntosSalud;
    private int puntosAtaque;
    private String especie;
    private String nombre;
    private int puntosPoder;
    private int puntosDefensa;

    public Pokemon(Tipo tipo, int puntosSalud,int puntosAtaque, int puntosPoder, int puntosDefensa, String nombre, String especie){
        this.tipo = tipo;
        this.puntosSalud = puntosSalud;
        this.puntosAtaque = puntosAtaque;
        this.puntosPoder = puntosPoder;
        this.puntosDefensa = puntosDefensa;
        this.nombre = nombre;
        this.especie = especie;
    }

    public Tipo getTipo(){
        return tipo;
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

    public String getEspecie(){
        return especie;
    }

    public void setTipo(Tipo tipo){
        this.tipo =tipo;
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

    public void setEspecie(String especie){
        this.especie = especie;
    }
}