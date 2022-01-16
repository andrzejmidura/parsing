package model;

import jakarta.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"nazwaOdbiorcy", "adresOdbiorcy", "NIPOdbiorcy", "dataWystawienia", "dataSprzedazy", "nrFaktury", "tytulPozycji", "liczbaSztuk", "cenaJednostkowa", "stawkaPodatku", "kwotaPodatku", "cenaNettoPozycji", "cenaBruttoPozycji", "cenaNettoFakturyLacznie", "cenaBruttoFakturyLacznie"})
public class Faktura {
    // constructors
    public Faktura() {}
    public Faktura(String[] attributes) {
        this.nazwaOdbiorcy =            attributes[0];
        this.adresOdbiorcy =            attributes[1];
        this.NIPOdbiorcy =              attributes[2];
        this.dataWystawienia =          attributes[3];
        this.dataSprzedazy =            attributes[4];
        this.nrFaktury =                attributes[5];
        this.tytulPozycji =             attributes[6];
        this.liczbaSztuk =              attributes[7];
        this.cenaJednostkowa =          attributes[8];
        this.stawkaPodatku =            attributes[9];
        this.kwotaPodatku =             attributes[10];
        this.cenaNettoPozycji =         attributes[11];
        this.cenaBruttoPozycji =        attributes[12];
        this.cenaNettoFakturyLacznie =  attributes[13];
        this.cenaBruttoFakturyLacznie = attributes[14];
    }

    // getters and setters
    public String getNazwaOdbiorcy() {
        return nazwaOdbiorcy;
    }

    public void setNazwaOdbiorcy(String nazwaOdbiorcy) {
        this.nazwaOdbiorcy = nazwaOdbiorcy;
    }

    public String getAdresOdbiorcy() {
        return adresOdbiorcy;
    }

    public void setAdresOdbiorcy(String adresOdbiorcy) {
        this.adresOdbiorcy = adresOdbiorcy;
    }

    public String getNIPOdbiorcy() {
        return NIPOdbiorcy;
    }

    public void setNIPOdbiorcy(String NIPOdbiorcy) {
        this.NIPOdbiorcy = NIPOdbiorcy;
    }

    public String getDataWystawienia() {
        return dataWystawienia;
    }

    public void setDataWystawienia(String dataWystawienia) {
        this.dataWystawienia = dataWystawienia;
    }

    public String getDataSprzedazy() {
        return dataSprzedazy;
    }

    public void setDataSprzedazy(String dataSprzedazy) {
        this.dataSprzedazy = dataSprzedazy;
    }

    public String getNrFaktury() {
        return nrFaktury;
    }

    public void setNrFaktury(String nrFaktury) {
        this.nrFaktury = nrFaktury;
    }

    public String getTytulPozycji() {
        return tytulPozycji;
    }

    public void setTytulPozycji(String tytulPozycji) {
        this.tytulPozycji = tytulPozycji;
    }

    public String getLiczbaSztuk() {
        return liczbaSztuk;
    }

    public void setLiczbaSztuk(String liczbaSztuk) {
        this.liczbaSztuk = liczbaSztuk;
    }

    public String getCenaJednostkowa() {
        return cenaJednostkowa;
    }

    public void setCenaJednostkowa(String cenaJednostkowa) {
        this.cenaJednostkowa = cenaJednostkowa;
    }

    public String getStawkaPodatku() {
        return stawkaPodatku;
    }

    public void setStawkaPodatku(String stawkaPodatku) {
        this.stawkaPodatku = stawkaPodatku;
    }

    public String getKwotaPodatku() {
        return kwotaPodatku;
    }

    public void setKwotaPodatku(String kwotaPodatku) {
        this.kwotaPodatku = kwotaPodatku;
    }

    public String getCenaNettoPozycji() {
        return cenaNettoPozycji;
    }

    public void setCenaNettoPozycji(String cenaNettoPozycji) {
        this.cenaNettoPozycji = cenaNettoPozycji;
    }

    public String getCenaBruttoPozycji() {
        return cenaBruttoPozycji;
    }

    public void setCenaBruttoPozycji(String cenaBruttoPozycji) {
        this.cenaBruttoPozycji = cenaBruttoPozycji;
    }

    public String getCenaNettoFakturyLacznie() {
        return cenaNettoFakturyLacznie;
    }

    public void setCenaNettoFakturyLacznie(String cenaNettoFakturyLacznie) {
        this.cenaNettoFakturyLacznie = cenaNettoFakturyLacznie;
    }

    public String getCenaBruttoFakturyLacznie() {
        return cenaBruttoFakturyLacznie;
    }

    public void setCenaBruttoFakturyLacznie(String cenaBruttoFakturyLacznie) {
        this.cenaBruttoFakturyLacznie = cenaBruttoFakturyLacznie;
    }


    // attributes
    private String nazwaOdbiorcy;
    private String adresOdbiorcy;
    private String NIPOdbiorcy;
    private String dataWystawienia;
    private String dataSprzedazy;
    private String nrFaktury;
    private String tytulPozycji;
    private String liczbaSztuk;
    private String cenaJednostkowa;
    private String stawkaPodatku;
    private String kwotaPodatku;
    private String cenaNettoPozycji;
    private String cenaBruttoPozycji;
    private String cenaNettoFakturyLacznie;
    private String cenaBruttoFakturyLacznie;
}
