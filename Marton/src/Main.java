public class Main {
    public static void main(String[] args) {
        Marton maraton = new Marton();
        String[] names = {"Kadir", "Gökhan", "Hakan","Suzan","Pınar","Mehmet","Ali","Emel","Fırat","James","Jale","Ersin","Deniz","Gözde","Anıl","Burak"};
        int[] derece = {341,273,278,329,445,402,388,270,243,334,412,393,299,343,317,265};
        System.out.println("Birinci: "+names[maraton.enDusukSure(derece)]+" "+derece[maraton.enDusukSure(derece)]+"'");
        System.out.println("İkinci: "+names[maraton.enDusukIkinciSure(derece)]+" "+derece[maraton.enDusukIkinciSure(derece)]+"'");
        System.out.println("Üçüncü: "+names[maraton.enDusukUcuncuSure(derece)]+" "+derece[maraton.enDusukUcuncuSure(derece)]+"'");
        maraton.siniflandir(derece);
    }
}