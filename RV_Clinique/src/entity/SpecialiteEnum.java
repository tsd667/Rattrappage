package entity;

public enum SpecialiteEnum {
    Généraliste(1), Dentaire(2), Cardiologue(3), Error(0);

    private final int valeur;

    public int getValeur() {
        return valeur;
    }

    private SpecialiteEnum(int valeur){
        this.valeur = valeur;
    }

    public static SpecialiteEnum getSpecialiteEnum(int choix){
        for (SpecialiteEnum iteration : SpecialiteEnum.values()) {
            if (choix == iteration.valeur) {
                return iteration;
                
            }
            
        }
        return Error;
    }
    
}
