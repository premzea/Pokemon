package model;

public class Ubicacion{
    private Coordenada longitud;
    private Coordenada latitud;

    public Ubicacion(Coordenada longitud, Coordenada latitud){
        this.longitud = longitud;
        this.latitud = latitud;
    }

    public Coordenada getLongitud(){
        return longitud;
    }

    public Coordenada getLatitud(){
        return latitud;
    }

    public void setLongitud(){
        this.longitud = longitud;
        
    }

    public void setLatitud(){
        this.latitud = latitud;
    }
}