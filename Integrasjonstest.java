
public class Integrasjonstest {
    public static void main(String[] args) {
        Lege lege = new Lege("Dr.Shakez");
        Spesialist spesialist = new Spesialist("Dr.Moga", 34561);
        System.out.println(lege);
        System.out.println(spesialist);
        Narkotisk heroin = new Narkotisk("Heroin", 100, 0.5, 5);
        Vanedannende valium = new Vanedannende("Valium", 50, 0.2, 2);
        Vanlig paracet = new Vanlig("Paracet", 20, 0.1);
        Vanlig p_stav = new Vanlig("P-stav", 220, 0.0);
        Hviteresepter hviteresept = new Hviteresepter(heroin, lege, 1, 1);
        Blaaresepter blaaresept = new Blaaresepter(valium, spesialist, 2, 2);
        MilResept miliresept = new MilResept(paracet, lege, 3);
        P_resepter presept = new P_resepter(p_stav, spesialist, 4, 4);

        System.out.println(hviteresept);
        System.out.println(blaaresept);
        System.out.println(miliresept);
        System.out.println(presept);
  
    }
}
