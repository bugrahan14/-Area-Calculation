public class Dikdörtgen extends Sekil {

    private int a;
    private int b;

    public Dikdörtgen(String isim,int a,int b) {
        super(isim);
        this.a=a;
        this.b=b;
    }

    @Override
    void alan_hesapla() {
        System.out.println(getIsim()+"nin alani="+a*b);
    }
    
}
