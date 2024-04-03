package model;


public class Coleccion{
    private Album[] albumes = new Album[8]; 
    private String userName;
    private Date fechaCreacion;

    public Coleccion(Album[] albumes, String userName, Date fechaCreacion){
        // Album[] albumes, String userName, LocalDate fechaCreacion
        this.albumes = albumes;
        this.userName = userName;
        this.fechaCreacion = fechaCreacion;
    }

    public void eliminarAlbum(EnumRegion region){
        for (int i = 0; i < 8; i++){
            if (albumes[i].getnomRegion() == region){
                albumes[i] = null;
            }
        }
    }


}