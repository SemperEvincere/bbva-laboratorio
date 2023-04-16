package com.bbva.laboratorio.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepositoExtraccion extends Movimiento{

  private String cajero;
}
