package model;
//Todo agregar album, enum problema tipo todavia no entender. 


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

    public boolean hasAlbums(){
        boolean value = false;
        if (albumes[9] != null){
            return true;
        }
        return value;
    }

    public void addAlbum(EnumRegion nombre, int numPokemones){
        Album album = new Album(nombre, numPokemones);
        // aqui el enum como se lo voy a pasar?
        for(int i = 0; i < 8; i++){
            if (albumes[i] == null){
                album[i] = album;
                i = 10;
            }
        } 
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