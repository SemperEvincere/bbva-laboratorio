package com.bbva.laboratorio.domain.models;

import java.util.List;
import java.util.UUID;
import lombok.Data;

@Data
public class Cliente {

  private UUID id;
  private List<Cuenta> cuentas;
  private String nombre;
  private String apellido;
  private Direccion direccion;
  private String telefono;
  private String email;

  public Cliente(UUID id,
      List<Cuenta> cuentas,
      String nombre,
      String apellido,
      Direccion direccion,
      String telefono,
      String email) {
    this.id = id;
    this.cuentas = cuentas;
    this.nombre = nombre;
    this.apellido = apellido;
    this.direccion = direccion;
    this.telefono = telefono;
    this.email = email;
  }

  public Cliente() {
  }
}
