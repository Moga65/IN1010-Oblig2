public class Spesialist extends Lege implements Godkjenningsfritak {
    int kontrollID;

    public Spesialist(String navn, int kontrollID) {
        super(navn);
        this.kontrollID = kontrollID;
    }

    public String toString() {
        return navn + " KontrollID: " + kontrollID;
    }

    @Override
    public String hentKontrollkode() {
        return kontrollID + "";
    }
}
