
public class Sale {

    private Integer id;
    private Integer id_tariff;
    private Integer id_discount;


    public Sale(int id, int id_discount, int id_tariff) {
        this.id = id;
        this.id_discount = id_discount;
        this.id_tariff = id_tariff;
    }

    public Integer getId() {
        return id;
    }
    public Integer getId_discount() {
        return id_discount;
    }
    public Integer getId_tariff() {
        return id_tariff;
    }
}
