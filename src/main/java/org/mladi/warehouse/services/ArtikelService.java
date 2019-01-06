package org.mladi.warehouse.services;

import org.mladi.warehouse.Model.Artikel;

import java.util.List;

public interface ArtikelService {

    public void addArtikel(Artikel artikel);
    public Artikel getArtikelById(Long id);
    public void removeArtikel(Long id);
}
