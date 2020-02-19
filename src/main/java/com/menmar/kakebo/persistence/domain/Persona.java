package com.menmar.kakebo.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "persona")
@Entity
public class Persona {
  @Id
  @GeneratedValue
  @SequenceGenerator(name = "sqidCasaseqgenerator")
  @Column(name = "id_persona", nullable = false)
  private Integer idPersona;

  @Column(name = "nombre_persona", length = 30, nullable = false)
  private String nomPersona;

  @Column(name = "dni_persona", length = 9)
  private String dniPersona;

  @JoinColumn(name = "casa_persona", nullable = false, referencedColumnName = "id_casa")
  @ManyToOne(fetch = FetchType.LAZY)
  private Casa casaPersona;
}
