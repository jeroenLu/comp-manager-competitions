package com.jeroenluers.pes.infrastructure.database.competition;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.jeroenluers.pes.domain.models.CompetitionDto;
import com.jeroenluers.pes.utils.TestdataHelper;
import java.util.List;
import lombok.val;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class GetCompetitionsAdapterTest {

  @InjectMocks private GetCompetitionsAdapter getCompetitionsAdapter;

  @Mock private CompetitionRepository competitionRepository;
  @Mock private CompetitionDtoMapper competitionDtoMapper;

  private final List<Competition> competitionEntities = CompetitionTestDataHelper.getCompetitions();
  private final List<CompetitionDto> competitionDtos = TestdataHelper.getCompetitionDtos();

  void competitionsExist_shouldReturnCompetitions() {
    when(competitionRepository.findAll()).thenReturn(competitionEntities);
    when(competitionDtoMapper.toCompetitions(competitionEntities)).thenReturn(competitionDtos);

    val competitions = getCompetitionsAdapter.getCompetitions();

    assertThat(competitions, is(competitionDtos));
    verify(competitionRepository).findAll();
    verify(competitionDtoMapper).toCompetitions(competitionEntities);
  }
}
