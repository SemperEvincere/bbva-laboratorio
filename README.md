# bbva-laboratorio
## Proyecto LAB 1
## Mini Banco
Durante el laboratorio desarrollaremos el backend de una pequeña aplicación bancaria en
capas. Al finalizar el proyecto deberán entregar la implementación de las distintas capas, los
tests y la documentación que se solicitará oportunamente.

Objetivo: Implementación y test del modelo de dominio que se describe a continuación.
El sistema deberá administrar cuentas bancarias de clientes, que podrán ser de dos tipos:
en moneda nacional y en moneda extranjera. Todas las cuentas deberán tener un cliente
titular, y opcionalmente varios cotitulares, independientemente de las monedas. Los clientes
podrán ser titulares o cotitulares de varias cuentas. La información a mantener para los
clientes es la siguiente:
- Nombre
- Apellido
- Dirección (Calle, Número Cívico, Departamento, Piso, Ciudad, Código Postal,
Provincia)
- Teléfono
- Email
Todo cliente es responsable de conocer todas las cuentas de las que es titular y las cuentas
de las que es cotitular.
Las información sobre las cuentas, independientemente de su tipo es:
- Nro (de tipo Long)
- Fecha de creación
- Saldo inicial
- Saldo actual
- Descubierto acordado
- Fecha de cierre
Además, las cuentas en moneda extranjera deberán mantener información sobre la moneda
asociada. En la actualidad el banco soporta sólo EUR y USD. pero podría en el futuro
soportar otras monedas).
Toda cuenta es responsable de conocer su titular y cotitulares.
Además cada cuenta deberá mantener información sobre los movimientos realizados. Para
cada movimiento deberá mantener:
- Fecha y hora de realización
- Monto (que se asume en la moneda correspondiente)
- Descripción
Se considerarán algunos movimientos específicos:
- Depósitos y extracciones, que deberán mantener información sobre la caja/cajero en
la que se realizó (por simplicidad puede asumir que es una String).
- Transferencias recibidas (por simplicidad de cuentas en el banco): se deberá
mantener la cuenta de origen.
- Transferencias realizadas (por simplicidad a cuentas en el banco): se deberá
mantener la cuenta de destino.
- Compra/Venta de moneda extranjera: se deberá mantener la cotización y la comisión
aplicada.
Se debe:
- Definir el modelo de objetos que permita representar al dominio:
- Implementar el modelo en Java (no considerar validaciones)
- Definir test de unidad para los tipos definidos. Concentrarse en casos de éxito.
Incluir casos para testear que
- los tipos mantienen la información esperada.
- las cuentas pueden tener 1 titular y cotitulares.
- los clientes pueden ser titulares y cotitulares de varias cuentas.
- cada cuenta puede tener distintos movimientos.
