package model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;

@XmlRootElement
public class ListaFaktur {
    public ListaFaktur() {}

    @XmlElement(name = "faktura")
    public ArrayList<Faktura> getFaktury() {
        return this.faktury;
    }

    public void setFaktury(ArrayList<Faktura> faktury) {
        this.faktury = faktury;
    }


    private ArrayList<Faktura> faktury = new ArrayList<>();
}
