package com.jeroenluers.pes.infrastructure.database.competition;

import com.jeroenluers.pes.domain.models.CompetitionDto;
import com.jeroenluers.pes.domain.ports.outgoing.GetCompetitionsPort;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
class GetCompetitionsAdapter implements GetCompetitionsPort {

  private final CompetitionRepository competitionRepository;
  private final CompetitionDtoMapper competitionDtoMapper;

  @Override
  public List<CompetitionDto> getCompetitions() {
    return competitionDtoMapper.toCompetitions(competitionRepository.findAll());
  }
}
