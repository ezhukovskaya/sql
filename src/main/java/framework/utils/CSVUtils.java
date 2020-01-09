package framework.utils;

import com.opencsv.CSVWriter;
import org.apache.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CSVUtils {
    private static final Logger log = Logger.getLogger(CSVUtils.class);

    public static void toCSVFile(ResultSet resultSet, String fileSrc) {
        String csv = String.format("src/test/results/%s", fileSrc);
        try (CSVWriter writer = new CSVWriter(new FileWriter(csv, true))){
            log.info(String.format("Writing request results to the %s", fileSrc));
            writer.writeAll(resultSet, true);
            log.info("Writer closes");
        } catch (SQLException | IOException e) {
            log.info("Write failed");
            e.printStackTrace();
        }
    }
}
