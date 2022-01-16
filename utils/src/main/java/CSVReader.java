import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import model.Faktura;
import model.ListaFaktur;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class CSVReader {
    // constructors
    public CSVReader() {}
    public CSVReader(String pathToFile, String outputFilename) {
        this.file = new File(pathToFile);
        this.outputFilename = outputFilename;
    }

    // methods
    public void generateJavaClasses() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(this.file));
            JAXBContext jaxbContext = JAXBContext.newInstance(ListaFaktur.class, Faktura.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE );
            File output = new File(this.outputFilename);
            Faktura faktura = new Faktura();
            ListaFaktur listaFaktur = new ListaFaktur();
            ArrayList<Faktura> faktury = new ArrayList<>();
            String[] separatedLine;
            String line;

            reader.readLine();
            while((line = reader.readLine()) != null) {
                separatedLine = line.split("\t");
                if(separatedLine.length == 15) {
                    faktura.setNazwaOdbiorcy(separatedLine[0]);
                    faktura.setAdresOdbiorcy(separatedLine[1]);
                    faktura.setNIPOdbiorcy(separatedLine[2]);
                    faktura.setDataWystawienia(separatedLine[3]);
                    faktura.setDataSprzedazy(separatedLine[4]);
                    faktura.setNrFaktury(separatedLine[5]);
                    faktura.setTytulPozycji(separatedLine[6]);
                    faktura.setLiczbaSztuk(separatedLine[7]);
                    faktura.setCenaJednostkowa(separatedLine[8]);
                    faktura.setStawkaPodatku(separatedLine[9]);
                    faktura.setKwotaPodatku(separatedLine[10]);
                    faktura.setCenaNettoPozycji(separatedLine[11]);
                    faktura.setCenaBruttoPozycji(separatedLine[12]);
                    faktura.setCenaNettoFakturyLacznie(separatedLine[13]);
                    faktura.setCenaBruttoFakturyLacznie(separatedLine[14]);
                    faktury.add(faktura);
                }
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
