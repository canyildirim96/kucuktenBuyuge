import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi1,sayi2,sayi3;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen ilk sayıyı giriniz: ");
        sayi1 = inp.nextInt();

        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        sayi2 = inp.nextInt();

        System.out.print("Lütfen üçüncü sayıyı giriniz: ");
        sayi3 = inp.nextInt();

        if (sayi1 < sayi2 && sayi1 < sayi3 ){
            if (sayi2<sayi3){
                System.out.print("1.sayı < 2.sayı < 3.sayı");
            }
            else {
                System.out.print("1.sayı < 3.sayı < 2.sayı");
            }
        } else if(sayi2<sayi1 && sayi2<sayi3){
            if (sayi1<sayi3){
                System.out.print("2.sayi < 1.sayi < 3.sayi");
            }
            else {
                System.out.print("2.sayi < 3.sayi < 1.sayi");
            }
        } else {
            if (sayi2<sayi1){
                System.out.print("3.sayi < 2.sayi <1.sayi");
            }
            else {
                System.out.print("3.sayi < 1.sayi < 2.sayi");
            }
        }

    }
}