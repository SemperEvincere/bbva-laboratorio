package com.bbva.laboratorio.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Direccion {

  private String calle;
  private String numeroCivico;
  private String departamento;
  private String piso;
  private String ciudad;
  private String codigoPosta;
  private String provincia;
}
