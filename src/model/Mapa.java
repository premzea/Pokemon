package model;
import java.util.Date;

public class Mapa{



    private int numPokemones;
    private Ubicacion ubicacion;
    private String dirImagen;
    private Date fecha;

    public Mapa(int numPokemones, Ubicacion ubicacion, String dirImagen, Date fecha){
        this.numPokemones = numPokemones;
        this.ubicacion = ubicacion;
        this.dirImagen = dirImagen;
        this.fecha = fecha;

    }

    public double getNumPokemones(){
        return numPokemones;
    }

    
    public Ubicacion getUbicacion(){
        return ubicacion;
    }

    
    public String getDirImagen(){
        return dirImagen;
    }

    public Date getFecha(){
        return fecha;
    }

    public void setNumPokemones(int numPokemones){
        this.numPokemones = numPokemones;
    }

    
    public void setUbicacion(Ubicacion ubicacion){
        this.ubicacion = ubicacion;
    }

    public void setDirImage(String dirImage){
        this.dirImagen = dirImage;
    }

    
    public void setFecha(Date fecha){
        this.fecha= fecha;
    }

    public String toString(){
        return "Numero de Pokemones: " + numPokemones + "\nUbicacion: " + ubicacion.toString() + "\nDireccion de la Imagen: " + dirImagen  + "\nFecha de la imagen: " + fecha.toString();
    } 

    

}