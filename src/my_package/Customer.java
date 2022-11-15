package my_package;
/**
 *
 * @author Muhamad Ardi Nur Insan
 * @NIM : 211511022
 * @Kelas : 2A
 */
public class Customer {
    private String namaCustomer;
    private String alamat;
    private Integer noTelepon;
    
    public Customer(){
        this.namaCustomer = "";
        this.alamat = "";
        this.noTelepon = 0;
    }

    public String getNamaCustomer() {
        return namaCustomer;
    }

    public void setNamaCustomer(String namaCustomer) {
        this.namaCustomer = namaCustomer;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Integer getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(Integer noTelepon) {
        this.noTelepon = noTelepon;
    }    
    
    public boolean isEmpty(){
        return this.getNamaCustomer().length() == 0 || this.getAlamat().length() == 0;
    }
    
    @Override
    public String toString(){
        return "   Nama      : " + this.getNamaCustomer()
                + "\n    Alamat    : " + this.getAlamat()
                + "\n    No Telp.  : " + this.getNoTelepon();
    }
    
}
