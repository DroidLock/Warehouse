package org.mladi.warehouse.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lieferant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long lieferantenNr;
    private String lieferant;


    public Lieferant(){

    }

    public Lieferant(String lieferant) {
        this.lieferant = lieferant;
    }

    public long getLieferantenNr() {
        return lieferantenNr;
    }

    public void setLieferantenNr(long lieferantenNr) {
        this.lieferantenNr = lieferantenNr;
    }

    public String getLieferant() {
        return lieferant;
    }

    public void setLieferant(String lieferant) {
        this.lieferant = lieferant;
    }

}
