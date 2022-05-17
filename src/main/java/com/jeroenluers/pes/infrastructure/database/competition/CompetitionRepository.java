package com.jeroenluers.pes.infrastructure.database.competition;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

interface CompetitionRepository extends CrudRepository<Competition, Integer> {
  List<Competition> findAll();
}
