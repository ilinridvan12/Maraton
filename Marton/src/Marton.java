public class Marton {

    public int enDusukSure(int[] tamSayiDizisi){
        int enKucukSayi = tamSayiDizisi[0];
        int enKucukIndex = 0;
        for(int i = 0;i<tamSayiDizisi.length; i++){
            if(tamSayiDizisi[i] < enKucukSayi){
                enKucukIndex = i;
                enKucukSayi = tamSayiDizisi[i];
            }
        }
        return enKucukIndex;
    }
    public int enDusukIkinciSure(int[] tamSayiDizisi){
        int enKucukSayi = tamSayiDizisi[enDusukSure(tamSayiDizisi)];
        int enKucukIkinci = Integer.MAX_VALUE;
        int enKucukIkinciIndex = 0;
        for (int i = 0;i<tamSayiDizisi.length;i++){
            if(tamSayiDizisi[i] > enKucukSayi && tamSayiDizisi[i]<enKucukIkinci){
                enKucukIkinci = tamSayiDizisi[i];
                enKucukIkinciIndex = i;
            }
        }
        return enKucukIkinciIndex;
    }

    public int enDusukUcuncuSure(int[] tamSayiDizisi){
        int enKucukIkinciSayi = tamSayiDizisi[enDusukIkinciSure(tamSayiDizisi)];
        int enKucukUcuncu = Integer.MAX_VALUE;
        int enKucukUcuncuIndex = 0;
        for (int i = 0;i<tamSayiDizisi.length;i++){
            if(tamSayiDizisi[i] > enKucukIkinciSayi && tamSayiDizisi[i]<enKucukUcuncu){
                enKucukUcuncu = tamSayiDizisi[i];
                enKucukUcuncuIndex = i;
            }
        }
        return enKucukUcuncuIndex;
    }

    public void siniflandir(int[] tamSayiDizisi){
        int[] siralaABCSiniflari = new int[3];
        for(int i : tamSayiDizisi){
            if(i >= 200 && i <= 299){
                siralaABCSiniflari[0] += 1;
            }
            if(i >= 300 && i <= 399){
                siralaABCSiniflari[1] += 1;
            }
            if(i >= 400){
                siralaABCSiniflari[2] += 1;
            }
        }
        for(int i = 0;i < 3;i++){
            if(i == 0) {
                System.out.println("A -> " + siralaABCSiniflari[i]);
            } else if (i == 1) {
                System.out.println("B -> " + siralaABCSiniflari[i]);
            }
            else if (i == 2) {
                System.out.println("C -> " + siralaABCSiniflari[i]);
            }
        }
    }
}