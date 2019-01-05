package org.mladi.warehouse.repository;

import org.mladi.warehouse.Model.Position;
import org.springframework.data.repository.CrudRepository;

public interface IPosition extends CrudRepository<Position, Long> {
}
