import com.google.gson.Gson;
import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Converter {

    private DB db;

    public DB getDb() {
        return db;
    }

    private String fileName;

    public List<List<String>> records = new ArrayList<List<String>>();

    public Converter(DB db) {
        this.db = db;

    }
    public void ObjToJson(String fileName) {
        this.fileName = fileName;

        Gson gson = new Gson();

        for (int i = 0; i < db.users.size(); i++) {
            String json = gson.toJson(db.users.get(i));
            try(FileWriter writer = new FileWriter(fileName, true)) {

                writer.write(json + "\n");
            } catch(IOException ex){

                System.out.println(ex.getMessage());
            }

        }
    }

    /*public void CsvToObj() {

        try (CSVReader csvReader = new CSVReader(new FileReader("/Users/dyakovdaniil/Documents/university/Dyakov_11_202_2/Dyakov_11_202_2/Classwork2/src/BataDase.csv"));) {
            String[] values = null;
            while ((values = csvReader.readNext()) != null) {
                records.add(Arrays.asList(values));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < records.size(); i++) {
            User u = new User(records.get(i));
            db.users.add(u);
        }

    }
     */
}
