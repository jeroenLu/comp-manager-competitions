package com.jeroenluers.pes.utils;

import com.jeroenluers.pes.domain.models.CompetitionDto;
import java.util.Arrays;
import java.util.List;
import lombok.val;

public class TestdataHelper {

  public static final Integer COMPETITION_ID = 1;
  public static final String COUNTRY_CODE_NL = "NL";
  public static final String COMPETITION_NAME_NL = "Netherlands";

  public static List<CompetitionDto> getCompetitionDtos() {
    return Arrays.asList(getCompetitionDto(), getCompetitionDto());
  }

  public static CompetitionDto getCompetitionDto() {
    val competitionDto = new CompetitionDto();
    competitionDto.setId(COMPETITION_ID);
    competitionDto.setCountryCode(COUNTRY_CODE_NL);
    competitionDto.setName(COMPETITION_NAME_NL);

    return competitionDto;
  }
}
