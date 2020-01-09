package framework.utils;

import com.opencsv.CSVWriter;
import org.apache.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CSVUtils {
    private static final Logger log = Logger.getLogger(CSVUtils.class);
    private static final String PATH = "src/test/results/%s";
    public static void toCSVFile(ResultSet resultSet, String fileSrc){
        String csv = String.format(PATH, fileSrc);
        CSVWriter writer = null;
        try{
            log.info("Matching the filename");
            writer = new CSVWriter(new FileWriter(csv, true));
        } catch (IOException e){
            log.error("Matching the filename failed");
            e.printStackTrace();
        }
        try{
            log.info(String.format("Writing request results to the %s", fileSrc));
            writer.writeAll(resultSet, true);
            log.info("Writer closes");
            writer.close();
        } catch (SQLException | IOException e){
            log.info("Write failed");
            e.printStackTrace();
        }

    }
}
