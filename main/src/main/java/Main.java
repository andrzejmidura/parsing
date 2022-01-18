import java.util.Objects;

public class Main {
    public static void main(String[] args) throws Exception {
        // check if args are correct
        if (args.length != 2) {
            throw new Exception("Incorrect number of arguments! Expected: 2");
        }

        // save the file type
        String[] inputFilePath = args[0].split("\\.");
        String fileType = inputFilePath[inputFilePath.length-1];

        // TODO: check if output filename is correct

        // call appropriate reader (csv/xlsx)
        if(Objects.equals(fileType, "csv")) {
            // TODO: check if file is empty
            CSVReader csvReader = new CSVReader(System.getProperty("user.dir") + "\\main\\src\\main\\resources\\" + args[0], System.getProperty("user.dir") + "\\main\\src\\main\\resources\\" + args[1]);
            csvReader.parse();
            System.out.println("Input file converted successfully to " + args[1] + ".");

        } else if (Objects.equals(fileType, "xlsx")) {

            // xlsx reader
            XLSXReader xlsxReader = new XLSXReader(System.getProperty("user.dir") + "\\main\\src\\main\\resources\\" + args[0], System.getProperty("user.dir") + "\\main\\src\\main\\resources\\" + args[1]);
            xlsxReader.parse();
            System.out.println("Input file converted successfully to " + args[1] + ".");

        } else {
            throw new Exception("Wrong input file type! Expected: csv/xlsx");
        }
    }
}
