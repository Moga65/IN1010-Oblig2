import java.util.ArrayList;
public class TestLegemiddel{
    public static void main(String[] args) {
    Narkotisk heroin = new Narkotisk("Heroin", 100, 0.5, 5); 
    Vanedannende valium = new Vanedannende("Valium", 50, 0.2, 2);
    Vanlig paracet = new Vanlig("Paracet", 20, 0.1);
    ArrayList<Legemiddel> legemiddelListe = new ArrayList<Legemiddel>();    
    legemiddelListe.add(heroin);
    legemiddelListe.add(valium);
    legemiddelListe.add(paracet);
    System.out.println("test ID:");
    int teller = 0;
    for (Legemiddel legemiddel : legemiddelListe) {
        System.out.println("ID:" + legemiddel.hentId());
        if(legemiddel.hentId() == teller){
            System.out.println("ID er riktig");
        }
        else{
            System.out.println("ID er feil");
        }
        teller++;
    }

    System.out.println("\n");

    int pris = 100;
    String navn = "Paracet";
    double virkestoff = 0.1;
    Vanlig paracet2 = new Vanlig(navn, pris, virkestoff);

    if(paracet2.hentPris() == pris && paracet2.hentNavn() == navn && paracet2.hentVirkestoff() == virkestoff){
        System.out.println("Pris er riktig\nVirkestoff er riktig\nNavn er riktig");
    }
    else{
        System.out.println("Noe er feil");
    }

    System.out.println("\n");
    System.out.println("Printer alle legemidler:");
    for (Legemiddel legemiddel : legemiddelListe) {
        System.out.println(legemiddel);
    }
}
}