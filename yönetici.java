package tıyatrootomasyonu.entity;


public class yönetici extends insan implements odeme{
    // burada ödemenin içindeki salary methodunu yönetici classında zorunlu kıldığımız için Composition ilişkisi oluşur
    private int id;
    private final int maas=10000;
    private uye uye;//aggregation olduğundan dolayı
    //boş bir constructor olmalı. Yani uye olmadan
    //yönetici yine de var olabilir

    public yönetici() {
        super();
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getSalary() {
        System.out.println("Yonetici maaşı: "+maas);
        return maas;
    }
    
}
