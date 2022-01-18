import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import model.Faktura;
import model.ListaFaktur;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class XLSXReader {
    // constructors
    public XLSXReader() {}
    public XLSXReader(String pathToFile, String outputFilename) {
        this.file = new File(pathToFile);
        this.outputFilename = outputFilename;
    }

    // methods
    public void parse() {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ListaFaktur.class, Faktura.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE );
            File output = new File(this.outputFilename);

            XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(this.file));
            Iterator<Row> rowIterator = workbook.getSheetAt(0).rowIterator();
            ListaFaktur listaFaktur = new ListaFaktur();
            ArrayList<Faktura> faktury = new ArrayList<>();

            if (rowIterator.hasNext()) { rowIterator.next(); } // the first contains names, not data
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Faktura faktura = new Faktura();
                faktura.setNazwaOdbiorcy(               row.getCell(0).toString());
                faktura.setAdresOdbiorcy(               row.getCell(1).toString());
                faktura.setNIPOdbiorcy(                 row.getCell(2).toString());
                faktura.setDataWystawienia(             row.getCell(3).toString());
                faktura.setDataSprzedazy(               row.getCell(4).toString());
                faktura.setNrFaktury(                   row.getCell(5).toString());
                faktura.setTytulPozycji(                row.getCell(6).toString());
                faktura.setLiczbaSztuk(                 row.getCell(7).toString());
                faktura.setCenaJednostkowa(             row.getCell(8).toString());
                faktura.setStawkaPodatku(               row.getCell(9).toString());
                faktura.setKwotaPodatku(                row.getCell(10).toString());
                faktura.setCenaNettoPozycji(            row.getCell(11).toString());
                faktura.setCenaBruttoPozycji(           row.getCell(12).toString());
                faktura.setCenaNettoFakturyLacznie(     row.getCell(13).toString());
                faktura.setCenaBruttoFakturyLacznie(    row.getCell(14).toString());
                faktury.add(faktura);
            }
            listaFaktur.setFaktury(faktury);
            marshaller.marshal(listaFaktur, output);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }


    // attributes
    private File file = null;
    private String outputFilename = "";
}
