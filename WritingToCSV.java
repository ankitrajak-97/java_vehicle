import java.io.FileNotFoundException;
import java.io.FileWriter;
import com.opencsv.CSVWriter;

public class WritingToCSV {
    public static void main(String args[]) throws Exception {
        // Instantiating the CSVWriter class
        CSVWriter writer = new CSVWriter(new FileWriter("D:\\JAVA\\JAVA\\src"));
        // Writing data to a csv file
        String line1[] = { "Mfg Company", "Model", "Year of Mfg", "cc", "Vehicle type" };
        String line2[] = { "Tata", "Nexon", "2012", "1200", "Petrol" };
        String line3[] = { "Maruti", "Dzire", "2012", "1400", "Petrol" };
        String line4[] = { "KIA", "inspire", "2020", "1600", "EV" };
        String line5[] = { "Hyundai", "Verna", "2012", "1500", "diesel" };
        String line6[] = { "Honda", "Mazda", "2022", "1300", "Petrol" };
        // Writing data to the csv file
        writer.writeNext(line1);
        writer.writeNext(line2);
        writer.writeNext(line3);
        writer.writeNext(line4);
        writer.writeNext(line5);
        writer.writeNext(line6);
        // Flushing data from writer to file
        writer.flush();
        System.out.println("Data entered");
    }
}