import java.io.File;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws Exception {
        // check if args are correct
        if (args.length != 2) {
            throw new Exception("Incorrect number of arguments! Expected: 2");
        }

        // check the file type
//        String[] inputFilePath = args[0].split(File.separator);
//        String fileType = inputFilePath[inputFilePath.length-1];
        String fileType = "csv";

        // TODO: check if output filename is correct

        // call appropriate reader (csv/xlsx)
        if(Objects.equals(fileType, "csv")) {
            // TODO: check if file is empty
            CSVReader csvReader = new CSVReader(System.getProperty("user.dir") + "\\main\\src\\main\\resources\\" + args[0], System.getProperty("user.dir") + "\\main\\src\\main\\resources\\" + args[1]);
            csvReader.generateJavaClasses();

        } else if (Objects.equals(fileType, "xlsx")) {

            // xlsx reader

        } else {
            throw new Exception("Wrong input file type! Expected: csv/xlsx");
        }
        System.out.println("Input file converted successfully to output.xml file.");
    }
}
