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
    
    public void loadDatabase(){
        try{
            FileReader file = new FileReader("src/database/plainDataOrder.txt");
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
    
    public void updateDatabase(){
        try{
            try (BufferedWriter out = new BufferedWriter( new FileWriter("src/database/plainDataOrder.txt", true))) {
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
