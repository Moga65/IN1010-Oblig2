public class P_resepter extends Hviteresepter { 

    public P_resepter(Legemiddel legemiddel, Lege utskrivendLege, int PasientId, int reit) {
        super(legemiddel, utskrivendLege, PasientId, reit);
    }
    
    public int prisAaBetale(){
        if (hentLegemiddel().hentPris() <= 108)
            return 0;
        else
            return hentLegemiddel().hentPris() - 108; 
    }
}
