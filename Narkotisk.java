public class Narkotisk extends Legemiddel{
    
    int styrke;

    public Narkotisk(String navn, int pris, double virkestoff, int styrke){
        super(navn, pris, virkestoff);
        this.styrke = styrke;   
    }

    public int hentNarkotiskStyrke(){
        return styrke;
    }

    public String toString(){
        return "Navn: " + navn + " Pris: " + hentPris() + " Virkestoff: " + virkestoff + " Styrke: " + styrke;
    }
}
