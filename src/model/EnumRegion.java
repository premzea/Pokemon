package model;

public enum EnumRegion{
    KANTO,
    JOTHO,
    HOEN;

    public int getTipo(){
        return this.ordinal();
    }

}