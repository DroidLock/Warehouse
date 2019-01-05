package org.mladi.warehouse.Model;

import javax.persistence.*;

@Entity
public class Artikel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long artikelnummer;
    private String artikelname;
    private String einheit;
    private double preis;
    @ManyToOne
    private Lieferant lieferant;

public Artikel(){

}

    public Artikel(String artikelname, String einheit, double preis, Lieferant lieferant) {
        this.artikelname = artikelname;
        this.einheit = einheit;
        this.preis = preis;
        this.lieferant = lieferant;
    }

    public long getArtikelnummer() {
        return artikelnummer;
    }

    public void setArtikelnummer(long artikelnummer) {
        this.artikelnummer = artikelnummer;
    }

    public String getArtikelname() {
        return artikelname;
    }

    public void setArtikelname(String artikelname) {
        this.artikelname = artikelname;
    }

    public String getEinheit() {
        return einheit;
    }

    public void setEinheit(String einheit) {
        this.einheit = einheit;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public Lieferant getLieferant() {
        return lieferant;
    }

    public void setLieferant(Lieferant lieferant) {
        this.lieferant = lieferant;
    }


}
