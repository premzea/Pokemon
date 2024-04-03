package model;
import java.util.Date;

public class Coleccion{
    private Album[] albumes = new Album[8]; 
    private String userName;
    private Date fechaCreacion;

    public Coleccion(Album[] albumes, String userName, Date fechaCreacion){
        this.albumes = albumes;
        this.userName = userName;
        this.fechaCreacion = fechaCreacion;
    }
}