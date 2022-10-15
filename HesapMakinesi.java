import java.beans.PropertyEditorSupport;
import java.nio.file.LinkPermission;
import java.util.Scanner;

public class HesapMakinesi {

    static void plus (){
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz : ");
        int quantity =inp.nextInt();
        int i = 1;
        int number;
        int result=0;

        while(i<=quantity){
            System.out.print(i+""+".Sayıyı giriniz : ");
            number =inp.nextInt();
            result+=number;
            i++;
        }
        System.out.println("Sonuç : "+result);
    }
    static void minus(){
        Scanner inp = new Scanner(System.in);
        int number,quantity,i=1,result=0;
        System.out.print("Kaç adet sayı gireceksiniz : ");
        quantity= inp.nextInt();

        while (i<=quantity){

            System.out.print(i+""+".Sayıyı giriniz : ");
            number=inp.nextInt();
            if(i == 1 ){
                result+=number;

            } else{
                result-=number;
            }
            i++;

        }
        System.out.println("Sonuç : "+result);

    }
    static void times(){
        Scanner inp =new Scanner(System.in);
        int number,result=1,quantity,i=1;
        System.out.print("Kaç adet sayı gireceksiniz : ");
        quantity=inp.nextInt();

        while (i<=quantity){
            System.out.print(i+".Sayıyı Giriniz : ");
            number=inp.nextInt();
            result*=number;
            i++;
        }
        System.out.println("Sonuç : "+result);
    }
    static void divided(){
        Scanner inp = new Scanner(System.in);

        double firstNumber,number,result=0.0;
        int i=1,quantity;

        System.out.print("Kaç adet sayı gireceksiniz : ");
        quantity=inp.nextInt();
        System.out.print("Bölünecek sayıyı yazınız : ");
        firstNumber=inp.nextDouble();
        while (i<=quantity){
            System.out.print(i+". Böleni giriniz : ");
            number=inp.nextDouble();
            if (number == 0){
                System.out.println("Bölen 0 olamaz lütfen geçerli bir değer giriniz.");
            }else {
                firstNumber/=number;
                System.out.println(i+".Bölümün sonucu : "+""+firstNumber);
                result=firstNumber;
                i++;
            }
        }
        System.out.println("Sonuç : "+ result);

    }

    static void power(){
        Scanner inp =new Scanner(System.in);
        int number,quantity,i=1,result=1;

        System.out.print("Taban sayıyı giriniz : ");
        number = inp.nextInt();

        System.out.print("Üssü giriniz : ");
        quantity= inp.nextInt();

        while(i<=quantity){
            if (quantity == 0 ){
                result= 1;
            }else {
                result*=number;
                i++;

            }
        }
        System.out.println("Sonuç : "+result);

    }
    static void factorial(){
        Scanner inp =new Scanner(System.in);

        int startedNumber,result=1;

        System.out.print("Lütfen bir değer giriniz : ");
        startedNumber= inp.nextInt();

        while (startedNumber !=0){
            result*=startedNumber;
            startedNumber--;
        }
        System.out.println("Sonuç : "+result);

    }
    static void mod (){
        Scanner inp = new Scanner(System.in);
        int firstNumber,secondNumber,result;

        System.out.print("Modu alınacak sayıyı giriniz : ");
        firstNumber=inp.nextInt();

        System.out.print("Mod sayısını giriniz : ");
        secondNumber=inp.nextInt();

        result=firstNumber%secondNumber;
        System.out.println(firstNumber+" "+"Sayısının"+" "+secondNumber+" "+"Sayısına göre modu : "+result);
    }
    static void Rectangle(){
        Scanner inp = new Scanner(System.in);
        int height,width,area,perimeter;

        System.out.print("Uzun kenarı giriniz : ");
        height=inp.nextInt();

        System.out.print("Kısa kenarı giriniz : ");
        width=inp.nextInt();

        if (width>height || width== height){
            System.out.println("Kısa kenar uzun kenardan uzun veya eşit olamaz lütfen geçerli bir değer giriniz.");
        }else{
            area=height*width;
            perimeter=2*(height+width);

            System.out.println("Alan : "+area);
            System.out.println("Çevre: "+perimeter );
        }

    }



    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int secim;
        String menu= "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";


        do {
            System.out.println(menu);
            System.out.print("Lütfen yapacağınız işlemi seçiniz : ");
            secim=inp.nextInt();
            switch (secim){
                case 1 :
                    plus();
                    break;
                case 2 :
                    minus();
                    break;
                case 3 :
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5 :
                    power();
                    break;
                case 6 :
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    Rectangle();
                    break;
                case 0:
                    break;
                default:

                    System.out.println("Yanlış bir değer girdiniz.Lütfen geçerli bir değer giriniz.");
            }

        }while (secim!=0);
    }


}
 /*"1- Toplama İşlemi\n"
         + "2- Çıkarma İşlemi\n"
         + "3- Çarpma İşlemi\n"
         + "4- Bölme işlemi\n"
         + "5- Üslü Sayı Hesaplama\n"
         + "6- Faktoriyel Hesaplama\n"
         + "7- Mod Alma\n"
         + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
         + "0- Çıkış Yap";*/