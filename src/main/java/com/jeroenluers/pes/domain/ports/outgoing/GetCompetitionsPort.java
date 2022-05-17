package com.jeroenluers.pes.domain.ports.outgoing;

import com.jeroenluers.pes.domain.models.CompetitionDto;
import java.util.List;

@FunctionalInterface
public interface GetCompetitionsPort {

  List<CompetitionDto> getCompetitions();
}
