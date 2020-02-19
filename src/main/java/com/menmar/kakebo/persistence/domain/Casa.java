package com.menmar.kakebo.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "casa")
@Entity
public class Casa {
  @Id
  @GeneratedValue
  @SequenceGenerator(name = "sqidCasaseqgenerator")
  @Column(name = "id_casa", nullable = false)
  private Integer idCasa;

  @Column(name = "nombre_casa", length = 15, nullable = false)
  private String nomCasa;

  @Column(name = "direccion_casa", length = 50)
  private String dirCasa;
}
