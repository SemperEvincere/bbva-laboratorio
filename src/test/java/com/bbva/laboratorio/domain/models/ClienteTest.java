package com.bbva.laboratorio.domain.models;


import com.bbva.laboratorio.domain.models.enums.Moneda;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClienteTest {

  @Test
  public void testCrearClienteConCuentas() {
    // arrange
    Cuenta cuenta1 = new Cuenta();
    UUID idCuenta1 = UUID.randomUUID();
    cuenta1.setId(idCuenta1);
    cuenta1.setSaldoActual(BigDecimal.valueOf(1000));
    cuenta1.setSaldoInicial(BigDecimal.valueOf(500));
    cuenta1.setMoneda(Moneda.USD);

    Cuenta cuenta2 = new Cuenta();
    UUID idCuenta2 = UUID.randomUUID();
    cuenta2.setId(idCuenta2);
    cuenta2.setSaldoActual(BigDecimal.valueOf(2000));
    cuenta2.setSaldoInicial(BigDecimal.valueOf(1000));
    cuenta2.setMoneda(Moneda.EUR);

    List<Cuenta> cuentas = new ArrayList<>();
    cuentas.add(cuenta1);
    cuentas.add(cuenta2);

    // act
    Cliente cliente = new Cliente();
    cliente.setNombre("Juan");
    cliente.setApellido("Pérez");
    cliente.setDireccion(new Direccion());
    cliente.setTelefono("123456789");
    cliente.setEmail("juanperez@ejemplo.com");
    cliente.setCuentas(cuentas);

    // assert
    Assertions.assertEquals(idCuenta1, cliente.getCuentas().get(0).getId());
    Assertions.assertEquals("Juan", cliente.getNombre());
    Assertions.assertEquals("Pérez", cliente.getApellido());
    Assertions.assertEquals(idCuenta2, cliente.getCuentas().get(1).getId());
    Assertions.assertEquals(cuenta1, cliente.getCuentas().get(0));
    Assertions.assertEquals(cuenta2, cliente.getCuentas().get(1));
  }

}