package com.jeroenluers.pes.infrastructure.database.competition;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
class Competition {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private String name;

  private String countryCode;
}
