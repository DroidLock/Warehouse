package org.mladi.warehouse.repository;

import org.mladi.warehouse.Model.Artikel;
import org.springframework.data.repository.CrudRepository;

public interface IArtikelRepository extends CrudRepository<Artikel, Long> {
}
