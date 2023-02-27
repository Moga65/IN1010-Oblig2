public class MilResept extends Hviteresepter{
    
    public MilResept(Legemiddel legemiddel, Lege utskrivendeLege, int PasientId) {
        super(legemiddel, utskrivendeLege, PasientId, 3);
    }
    
    public int prisAaBetale(){
        return 0;
    }
}
