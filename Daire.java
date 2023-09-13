public class Daire extends Sekil {

    private int yari_cap;

    public Daire(String isim,int yari_cap) {
        super(isim);
        this.yari_cap=yari_cap;
    }

    @Override
    void alan_hesapla() {

        System.out.println(getIsim()+"nin alani="+(Math.PI*yari_cap*yari_cap));
    }
    
}
