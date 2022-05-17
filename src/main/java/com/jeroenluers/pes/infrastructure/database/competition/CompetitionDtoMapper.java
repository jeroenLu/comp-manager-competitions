package com.jeroenluers.pes.infrastructure.database.competition;

import com.jeroenluers.pes.domain.models.CompetitionDto;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
interface CompetitionDtoMapper {

  CompetitionDto toCompetition(final Competition competition);

  List<CompetitionDto> toCompetitions(final List<Competition> competitions);
}
