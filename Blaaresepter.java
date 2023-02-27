public class Blaaresepter extends Resept {

    public Blaaresepter(Legemiddel legemiddel, Lege utskrivendLege, int PasientId, int reit) {
        super(legemiddel, utskrivendLege, PasientId, reit);
    }

    public int prisAaBetale(){
        return (int)Math.round(hentLegemiddel().hentPris() * 0.25);
    }

    @Override
    public String farge() {
        return "Blaa";
    }
}
