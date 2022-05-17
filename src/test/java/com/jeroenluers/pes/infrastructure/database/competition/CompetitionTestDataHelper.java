package com.jeroenluers.pes.infrastructure.database.competition;

import java.util.Arrays;
import java.util.List;

class CompetitionTestDataHelper {

  public static final Integer COMPETITION_ID = 1;
  public static final String COUNTRY_CODE_NL = "NL";
  public static final String COMPETITION_NAME_NL = "Netherlands";

  static Competition getCompetition() {
    final Competition competition = new Competition();
    competition.setId(COMPETITION_ID);
    competition.setCountryCode(COUNTRY_CODE_NL);
    competition.setName(COMPETITION_NAME_NL);

    return competition;
  }

  static List<Competition> getCompetitions() {
    return Arrays.asList(getCompetition(), getCompetition());
  }
}
