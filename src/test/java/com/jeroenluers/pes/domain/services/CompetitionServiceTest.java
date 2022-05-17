package com.jeroenluers.pes.domain.services;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.jeroenluers.pes.domain.models.CompetitionDto;
import com.jeroenluers.pes.domain.ports.outgoing.GetCompetitionsPort;
import com.jeroenluers.pes.utils.TestdataHelper;
import java.util.List;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CompetitionServiceTest {

  private final List<CompetitionDto> competitionDtos = TestdataHelper.getCompetitionDtos();

  @InjectMocks private CompetitionService competitionService;

  @Mock GetCompetitionsPort getCompetitionsPort;

  @Test
  void shouldReturnCompetitions() {
    when(getCompetitionsPort.getCompetitions()).thenReturn(competitionDtos);

    val competitions = competitionService.getCompetitions();

    assertThat(competitions).isEqualTo(competitionDtos);
    verify(getCompetitionsPort).getCompetitions();
  }
}
