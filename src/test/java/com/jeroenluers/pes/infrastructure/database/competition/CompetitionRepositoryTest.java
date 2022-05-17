package com.jeroenluers.pes.infrastructure.database.competition;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class CompetitionRepositoryTest {

  @Autowired private CompetitionRepository competitionRepository;

  @Test
  void shouldReturnCompetitions() {
    final List<Competition> competitions = competitionRepository.findAll();

    assertThat(competitions.size(), is(2));

    val competition1 = competitions.get(0);
    assertThat(competition1.getId(), is(1));
    assertThat(competition1.getName(), is("Netherlands"));
    assertThat(competition1.getCountryCode(), is("NL"));

    val competition2 = competitions.get(1);
    assertThat(competition2.getId(), is(2));
    assertThat(competition2.getName(), is("England"));
    assertThat(competition2.getCountryCode(), is("EN"));
  }
}
