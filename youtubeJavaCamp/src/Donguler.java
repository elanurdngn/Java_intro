public class Donguler {
    public void dongu(){
        String urun = "Laptop";

        for (int i=1;i < 10;i++){
            System.out.println(urun+i);
        }

        for (int i = 0;i<10;i+=2){
            System.out.println(i);
        }

        int sayi = 10;
        while (sayi<=100){
            System.out.println(sayi);
            sayi+=10;
        }

        int sayi2=10;
        do {
            System.out.println(sayi2);
            sayi2+=10;
        }while (sayi2>100);
    }
}
