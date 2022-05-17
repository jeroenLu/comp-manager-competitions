package com.jeroenluers.pes.application;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.jeroenluers.pes.api.model.Competition;
import com.jeroenluers.pes.domain.models.CompetitionDto;
import com.jeroenluers.pes.domain.ports.incoming.GetCompetionsUseCase;
import com.jeroenluers.pes.utils.TestdataHelper;
import java.util.Collections;
import java.util.List;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CompetitionsControllerTest {

  private final List<CompetitionDto> competitionDtos = TestdataHelper.getCompetitionDtos();
  private final List<Competition> competitions = Collections.singletonList(new Competition());

  @InjectMocks private CompetitionsController competitionsController;

  @Mock private GetCompetionsUseCase getCompetionsUseCase;
  @Mock private CompetitionMapper competitionMapper;

  @Test
  public void shouldReturnCompetitions() {
    when(getCompetionsUseCase.getCompetitions()).thenReturn(competitionDtos);
    when(competitionMapper.toCompetitions(competitionDtos)).thenReturn(competitions);

    val competitions = competitionsController.getCompetitions().getBody();

    assertThat(competitions).isEqualTo(competitions);
    verify(getCompetionsUseCase).getCompetitions();
    verify(competitionMapper).toCompetitions(competitionDtos);
  }
}
