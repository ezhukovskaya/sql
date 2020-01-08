package framework.utils;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CSVUtils {
    public static void toCSVFile(ResultSet resultSet, String fileSrc){
        String csv = String.format("src/test/results/%s", fileSrc);
        CSVWriter writer = null;
        try{
            writer = new CSVWriter(new FileWriter(csv, true));
        } catch (IOException e){
            e.printStackTrace();
        }
        try{
            writer.writeAll(resultSet, true);
        } catch (SQLException | IOException e){
            e.printStackTrace();
        }
    }
}
