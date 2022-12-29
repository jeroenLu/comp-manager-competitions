package com.jeroenluers.pes.application;

import com.jeroenluers.pes.api.CompetitionsApiDelegate;
import com.jeroenluers.pes.api.model.Competition;
import com.jeroenluers.pes.domain.ports.incoming.GetCompetionsUseCase;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CompetitionsController implements CompetitionsApiDelegate {

  private final GetCompetionsUseCase getCompetionsUseCase;
  private final CompetitionMapper competitionMapper;

  @Override
  public ResponseEntity<List<Competition>> getCompetitions() {

    return ResponseEntity.ok(
        competitionMapper.toCompetitions(getCompetionsUseCase.getCompetitions()));
  }
}
