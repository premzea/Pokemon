package model;

public enum EnumRegion{
    KANTO,
    JOTHO,
    SINNOH,
    TESELIA,
    KALOS,
    ALOLA,
    HOEN;

    public int getTipo(){
        return this.ordinal();
    }


    
}