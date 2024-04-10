package model;
//Todo agregar album, enum problema tipo todavia no entender. 


public class Coleccion{

    private Album[] albumes = new Album[7]; 
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
        for (int i = 0; i < 7; i++){
            if (albumes[i].getnomRegion() == region){
                albumes[i] = null;
            }
        }
    }

    public Album[] getAlbumes() {
        return albumes;
    }

    public boolean hasAlbums(){
        boolean value = true;
        if (albumes[6] != null){
            return false;
        }
        return value;
    }

    public void addAlbum(EnumRegion nombre, int numPokemones){
        Album album = new Album(nombre, numPokemones);
        for(int i = 0; i < 7; i++){
            if (albumes[i] == null){
                albumes[i] = album;
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
        String salida = "Album 1 \n" + albumes[0].toString();
        for(int i = 1; i< 7; i++){
            if (albumes[i] != null){
                salida = salida + "\n" + "Album " + (i+1) + "\n" + albumes[i].toString() + "\n";
            } else {
                i = 10;
            }
            
        }
        return salida;
    }

    public String[] getAlbumNames(){
        String [] names = new String[7];
        for (int i = 0; i < 7; i ++){
            if (albumes[i] != null){
                names[i] = (albumes[i].getnomRegion()).name();
            }
        }
        return names;
    } 

    public void editAlbum(){

    }

    // public boolean hasAlbums(){
    //     return album1 == null|| album2 == null|| album3 == null;
    // }
}