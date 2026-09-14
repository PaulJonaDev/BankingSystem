# 🏦  Sistema Bancario - Java OOP

Sistema de gestión de cuentas bancarias desarrollado en Java aplicando los principios fundamentales de la **Programación Orientada a Objetos (POO)**: Encapsulamiento, Herencia, Polimorfismo, Sobreescritura y Sobrecarga de métodos[cite: 1].

---

## 📌 Contexto del Proyecto

El proyecto modela las operaciones del **Banco Nacional Andino**, gestionando tres tipos específicos de productos financieros con reglas de negocio particulares para comisiones y retiros[cite: 1]:

1. **Cuenta de Ahorros:** Genera intereses mensuales. No cobra comisión por retiros normales, pero aplica penalización si el saldo restante cae por debajo del mínimo permitido[cite: 1].
2. **Cuenta Corriente:** Diseñada para empresas. Aplica una comisión fija por cada transacción y permite operar con saldo en negativo hasta un límite de sobregiro autorizado[cite: 1].
3. **Cuenta de Inversión:** Bloquea los fondos por un plazo fijado en meses. Ofrece una tasa de interés superior, pero cobra penalización si el cliente retira antes de cumplir el plazo[cite: 1].

---

## 🏗️ Arquitectura de Clases

```text
               +-------------------+
               |  CuentaBancaria   |  (Clase Padre)
               +-------------------+
                         ^
     +-------------------+-------------------+
     |                   |                   |
+------------+   +---------------+   +-----------------+
|CuentaAhorros|  |CuentaCorriente|   | CuentaInversion |
+------------+   +---------------+   +-----------------+
