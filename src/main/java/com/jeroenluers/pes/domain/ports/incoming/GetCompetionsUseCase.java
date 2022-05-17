package com.jeroenluers.pes.domain.ports.incoming;

import com.jeroenluers.pes.domain.models.CompetitionDto;
import java.util.List;

@FunctionalInterface
public interface GetCompetionsUseCase {

  List<CompetitionDto> getCompetitions();
}
