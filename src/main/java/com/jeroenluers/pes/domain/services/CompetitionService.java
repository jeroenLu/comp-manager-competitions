package com.jeroenluers.pes.domain.services;

import com.jeroenluers.pes.domain.models.CompetitionDto;
import com.jeroenluers.pes.domain.ports.incoming.GetCompetionsUseCase;
import com.jeroenluers.pes.domain.ports.outgoing.GetCompetitionsPort;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class CompetitionService implements GetCompetionsUseCase {

  private final GetCompetitionsPort getCompetitionsPort;

  public List<CompetitionDto> getCompetitions() {
    return getCompetitionsPort.getCompetitions();
  }
}
