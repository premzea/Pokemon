package model;

public class Coordenada{
    private double grado;
    private double minuto;
    private double segundo;

    public Coordenada(double grado, double minuto, double segundo){
        this.grado = grado;
        this.minuto = minuto;
        this.segundo = segundo;

        
    }

    public double getGrado() {
        return grado;
    }

    public void setGrado(double grado) {
        this.grado = grado;
    }

    public double getMinuto() {
        return minuto;
    }

    public void setMinuto(double minuto) {
        this.minuto = minuto;
    }

    public double getSegundo() {
        return segundo;
    }

    public void setSegundo(double segundo) {
        this.segundo = segundo;
    }
    

    public String toString(){
        return "Grado: " + grado + "\nMinuto: " + minuto + "\nSegundo:" + segundo;
    }
}