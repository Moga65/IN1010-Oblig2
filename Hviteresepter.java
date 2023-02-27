public class Hviteresepter extends Resept {

    public Hviteresepter(Legemiddel legemiddel, Lege utskrivendLege, int PasientId, int reit) {
        super(legemiddel, utskrivendLege, PasientId, reit);
    }

    @Override
    public String farge() {
        return "Hvit";
    }

    @Override
    public int prisAaBetale() {
        return hentLegemiddel().hentPris();
    }       
    
}
