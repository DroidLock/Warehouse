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
    private String lieferantenName;


    public Lieferant(){

    }

    public Lieferant(String lieferantenName) {
        this.lieferantenName = lieferantenName;
    }

    public long getLieferantenNr() {
        return lieferantenNr;
    }

    public void setLieferantenNr(long lieferantenNr) {
        this.lieferantenNr = lieferantenNr;
    }

    public String getLieferantenName() {
        return lieferantenName;
    }

    public void setLieferantenName(String lieferantenName) {
        this.lieferantenName = lieferantenName;
    }

}
