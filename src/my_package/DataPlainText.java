package my_package;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Muhamad Ardi Nur Insan
 * @NIM : 211511022
 * @Kelas : 2A
 */
public class DataPlainText {
    private String dataOrderTemp;
    
    DataPlainText(){
        this.dataOrderTemp = "";
    }
    
    public void loadDataPesanan(){
        try{
            FileReader file = new FileReader("src/my_package/data-pesanan.txt");
            try (BufferedReader reader = new BufferedReader(file)) {
                String line = null;
                this.setDataOrderTemp("");
                while((line = reader.readLine()) != null){
                    setDataOrderTemp(getDataOrderTemp() + "\n" + line);
                }
            }
        }catch(IOException e){
            e.getMessage();
        } 
    }
    
    public void updateDataPesanan(){
        try{
            try (BufferedWriter out = new BufferedWriter( new FileWriter("src/my_package/data-pesanan.txt", true))) {
                out.write("\n" + getDataOrderTemp());
            }
        }catch(IOException e){
            e.getMessage();
        }
    }

    public String getDataOrderTemp() {
        return dataOrderTemp;
    }

    public void setDataOrderTemp(String dataOrder) {
        this.dataOrderTemp = dataOrder;
    }    
}
