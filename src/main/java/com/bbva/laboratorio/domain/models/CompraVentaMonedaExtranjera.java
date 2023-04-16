package com.bbva.laboratorio.domain.models;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompraVentaMonedaExtranjera extends Movimiento {

  private BigDecimal cotizacion;
  private BigDecimal comision;
}
