abstract class Legemiddel {
    public final String navn;
    private int pris;
    public final double virkestoff;
    private static int idTeller = 0;
    public final int id;

    public Legemiddel(String navn, int pris, double virkestoff) {
        this.id = idTeller++;
        this.navn = navn;
        this.pris = pris;
        this.virkestoff = virkestoff;
    }

    public int hentId() {
        return id;
    }

    public int hentPris() {
        return pris;
    }

    public void settNyPris(int ny_pris) {
        this.pris = ny_pris;
    }

    public double hentVirkestoff() {
        return virkestoff;
    }

    public String hentNavn() {
        return navn;
    }

    public String toString() {
        return "Navn: " + navn + " Pris: " + pris + " Virkestoff: " + virkestoff;
    }

}

