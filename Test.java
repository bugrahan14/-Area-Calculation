import java.util.Scanner;
public class Test {


    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String islemler="İSLELER....../n"
                        +"1-KARE ALAN HESAPLA/n"
                        +"2-DAİRE ALAN HESAPLA/n"
                        +"3-DİKDÖRTGEN ALAN HESAPLA/n"
                        +"4-ÜÇGEN ALANI HESAPLA/n"
                        +"ÇIKMAK İÇİN Q YA BASINIZ";

        while (true){

            System.out.println(islemler);
            System.out.println("LÜTFEN İSLEMİ SEÇİNİZ");
            String seçim=scanner.nextLine();

            if (seçim.equals("q")){
                System.out.println("UYGULAMADAN ÇIKILIYOR İYİ GÜNLER");
                break;

            }

            else if (seçim.equals("1")){

                System.out.println("KARENİN ALANI HESAPLANIYOR");
                System.out.println("*********************************");
                System.out.println("LÜTFEN BİRİNCİ KENARI GİRİNİZ");
                int kenar1=scanner.nextInt();
                scanner.nextLine();
                Kare kare1=new Kare("Kare1", kenar1);
                kare1.alan_hesapla();
            }

            else if (seçim.equals("2")){
                System.out.println("DAİRENİN ALANI HESAPLANIYOR");
                System.out.println("*********************************");
                System.out.println("LÜTFEN YARIÇAPI GİRİNİZ");
                int yaricap=scanner.nextInt();
                scanner.nextLine();
                Daire daire1=new Daire("Daire1", yaricap);
                daire1.alan_hesapla();
            }

            else if (seçim.equals("3")){
                System.out.println("DİKDÖRTGENİN ALANI HESAPLANIYOR");
                System.out.println("*********************************");
                System.out.println("LÜTFEN 1. KENARI GİRİNİZ");
                int kenar1=scanner.nextInt();
                System.out.println("LÜTFEN İKİNCİ KENARI GİRİNZİ");
                int kenar2=scanner.nextInt();
                scanner.nextLine();
                Dikdörtgen dikdörtgen1=new Dikdörtgen("dikdörtgen1", kenar1, kenar2);
                dikdörtgen1.alan_hesapla();
            }

            else if (seçim.equals("4")){
                System.out.println("ÜÇGEN ALANI HESAPLANIYOR");
                System.out.println("*********************************");
                System.out.println("LÜTFEN 1. KENARI GİRİNİZ");
                int a=scanner.nextInt();
                System.out.println("LÜTFEN İKİNCİ KENARI GİRİNİZ");
                int b=scanner.nextInt();
                System.out.println("LÜTFEN 3.KENARI GİRİNİZ");
                int c=scanner.nextInt();
                scanner.nextLine();
                Üçgen ücgen = new Üçgen("Üçgen1",a,b,c) ;
                ücgen.alan_hesapla();
            }

            else{
                System.out.println("GEÇERSİZİ İSLEM");
            }

           

















        }











    }
    
}
