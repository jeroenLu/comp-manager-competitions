package com.jeroenluers.pes.infrastructure.database.competition;

import static org.assertj.core.api.Assertions.assertThat;

import com.jeroenluers.pes.domain.models.CompetitionDto;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

class CompetitionDtoMapperTest {

  private final CompetitionDtoMapper competitionDtoMapper =
      Mappers.getMapper(CompetitionDtoMapper.class);

  private final Competition competitionEntity = CompetitionTestDataHelper.getCompetition();
  private final List<Competition> competitionEntities = CompetitionTestDataHelper.getCompetitions();

  @Test
  void shouldMapToCompetition() {
    final CompetitionDto mappedCompetition = competitionDtoMapper.toCompetition(competitionEntity);

    assertThat(mappedCompetition).usingRecursiveComparison().isEqualTo(competitionEntity);
  }

  @Test
  void shouldMapToCompetitions() {
    final List<CompetitionDto> mappedCompetitions =
        competitionDtoMapper.toCompetitions(competitionEntities);

    assertThat(mappedCompetitions).usingRecursiveComparison().isEqualTo(competitionEntities);
  }
}
