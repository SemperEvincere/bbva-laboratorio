package com.bbva.laboratorio.domain.factories;

import com.bbva.laboratorio.domain.interfaces.IMovimientoFactory;
import com.bbva.laboratorio.domain.models.Movimiento;

public abstract class MovimientoCreator implements IMovimientoFactory {

  protected abstract Movimiento createMovimientoEspecifico();
}
