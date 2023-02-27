abstract class Resept {
    public final Legemiddel legemiddel;
    public final Lege utskrivendeLege;
    public final int PasientId;
    public int reit;
    public final int id;
    private static int idTeller = 0;

    public Resept(Legemiddel legemiddel, Lege utskrivendeLege, int PasientId, int reit) {
        this.id = idTeller++;
        this.legemiddel = legemiddel;
        this.utskrivendeLege = utskrivendeLege;
        this.PasientId = PasientId;
        this.reit = reit;
    }
    public int hentId() {
        return id;
    }

    public Legemiddel hentLegemiddel() {
        return legemiddel;
    }   

    public Lege hentLege() {
        return utskrivendeLege;
    }

    public int hentPasientId() {
        return PasientId;
    }

    public int hentReit() {
        return reit;
    }

    public boolean bruk() {
        if (reit > 0) {
            reit--;
            return true;
        }
        return false;
    } 

    abstract public String farge();
    
    abstract public int prisAaBetale();

    public String toString() {
        return "Legemiddel: " + legemiddel.hentNavn() + ", Lege: " + utskrivendeLege + ", PasientId: " + PasientId + ", Reit: " + reit + ", Farge: " + farge() + ", Pris: " + prisAaBetale() ;
    }
}
