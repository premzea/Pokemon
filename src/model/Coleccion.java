package model;
//Todo agregar album, cheker de si ya ocho albumes


public class Coleccion{

    private Album[] albumes = new Album[8]; 
    private String userName;
    private Date fechaCreacion;

    public Coleccion(String userName, int day, int month, int year){
        // Album[] albumes, String userName, LocalDate fechaCreacion
        this.userName = userName;
        Date fechaCreacion = new Date(day,month,year);
        this.fechaCreacion = fechaCreacion;
    }
    


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

    public Album[] getAlbumes() {
        return albumes;
    }

    public void setAlbumes(Album[] albumes) {
        this.albumes = albumes;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }


    public String showAlbum(){
        String salida = albumes[0].toString();
        for(int i = 1; i< 8; i++){
            salida = salida + "\n" + albumes[i].toString();
        }
        return salida;
    }

    public void editAlbum(){

    }
}