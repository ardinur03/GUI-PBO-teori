package my_package;
/**
 *
 * @author Muhamad Ardi Nur Insan
 * @NIM : 211511022
 * @Kelas : 2A
 */
public class Product {
    private String namaProduk;
    private String harga;
    private boolean isOrder;
    
    public Product(String name, String price, boolean isOrder){
        this.namaProduk = name;
        this.harga = price;
        this.isOrder = isOrder;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public boolean isOrder() {
        return isOrder;
    }

    public void setIsOrder(boolean isOrder) {
        this.isOrder = isOrder;
    }    
}
