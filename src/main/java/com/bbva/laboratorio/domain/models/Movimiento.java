package com.bbva.laboratorio.domain.models;

import com.bbva.laboratorio.domain.models.enums.TipoMovimiento;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movimiento {

  private LocalDateTime fechaHora;
  private BigDecimal monto;
  private String descripcion;
  private TipoMovimiento tipoMovimiento;
  private String origen;
  private String destino;
  private BigDecimal cotizacion;
  private BigDecimal comision;


}
