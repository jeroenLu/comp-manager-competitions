package com.jeroenluers.pes.application;

import com.jeroenluers.pes.api.model.Competition;
import com.jeroenluers.pes.domain.models.CompetitionDto;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
interface CompetitionMapper {

  Competition toCompetition(final CompetitionDto competitionDto);

  List<Competition> toCompetitions(List<CompetitionDto> competitionDtos);
}
