public class Üçgen extends Sekil {



    private int a;
    private int b;
    private int c;

   
    public Üçgen(String isim,int a, int b, int c) {
        super(isim);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    void alan_hesapla() {
        
        double x=(a+b+c)/2.0;
        double alan=Math.sqrt((x*(x-a)*(x-b)*(x-c)));
        System.out.println(getIsim()+"in alani="+alan);






    }

   
    
}
