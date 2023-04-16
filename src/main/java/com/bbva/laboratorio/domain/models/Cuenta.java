package com.bbva.laboratorio.domain.models;

import com.bbva.laboratorio.domain.models.enums.Moneda;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cuenta {

  private UUID id;
  private Cliente titular;
  private List<Cliente> cotitulares;
  private LocalDate fechaCreacion;
  private BigDecimal saldoInicial;
  private BigDecimal saldoActual;
  private BigDecimal descubiertoAcordado;
  private LocalDate fechaCierre;
  private Moneda moneda;
  private List<Movimiento> movimientos;


}
