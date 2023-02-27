public class TestResepter {
    public static void main(String[] args) {
        MilResept milresept = new MilResept(new Vanlig("Paracet", 100, 10.0), new Lege("Ola"), 1);
        System.out.println(milresept);
        System.out.println("Re-it test:");
        for (int i = 0; i < 4; i++) {
            if(milresept.bruk()){
                System.out.println("Brukte resept");
            }
            else{
                System.out.println("Kunne ikke bruke resept");
            }
            System.out.println(milresept);
        }
        P_resepter p_resept = new P_resepter(new Vanlig("P-piler", 220, 0.0), new Lege("Bola"), 2, 2); 
        System.out.println(p_resept);

        Blaaresepter blaaresept = new Blaaresepter(new Vanlig("Paracet", 100, 15.0), new Lege("Sola"), 3, 2);
        System.out.println(blaaresept);

    }
}
