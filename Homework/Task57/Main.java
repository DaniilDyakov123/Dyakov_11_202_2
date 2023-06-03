import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opencsv.CSVReader;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<List<String>> records = new ArrayList<List<String>>();
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

        DB db = new DB();

        for (int i = 0; i < records.size(); i++) {
            User u = new User(records.get(i));
            db.users.add(u);
        }

        System.out.println(db.users.get(13));

        Converter converter = new Converter(db);



        converter.ObjToJson("/Users/dyakovdaniil/Documents/university/Dyakov_11_202_2/Dyakov_11_202_2/Classwork2/src/jsonDB.json");

        //String jsonText = "{\"name\":\"Даниил\",\"city\":\"Казань\",\"year\":2004,\"mainInterest\":\"саморазвитие\",\"bio\":\"-\",\"favColor\":\"Зелёный\",\"pet\":\"FALSE\",\"futureProf\":\"депутат\"}\n";

        GsonBuilder builder = new GsonBuilder();

        Scanner sc = new Scanner(new File("/Users/dyakovdaniil/Documents/university/Dyakov_11_202_2/Dyakov_11_202_2/Classwork2/src/jsonDB.json"));
        do {
            String jsonText = sc.nextLine();
            Gson gson = builder.create();
            User I = gson.fromJson(jsonText, User.class);
            db.users.add(I);
        } while (sc.hasNext());




    }
}
//csv -> obj -> json +++++++
//json -> obj -> csv