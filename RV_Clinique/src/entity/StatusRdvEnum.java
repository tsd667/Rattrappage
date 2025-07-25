package entity;

public enum StatusRdvEnum {
    En_attente(1), Valide(2), Refuse(3), Annuler(4), Error(0);

    private final int valeur;

    public int getValeur() {
        return valeur;
    }

    private StatusRdvEnum(int valeur){
        this.valeur = valeur;
    }


    
}
