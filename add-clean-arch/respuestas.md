# Informe: Attribute-Driven Design (ADD) y su Relación con Clean Architecture

### Realizado por: Juan Sebastian Gomez Agudelo
### cod: 2259474

## 1. ¿Qué es Attribute-Driven Design (ADD) y cuál es su propósito en el diseño de software?

Attribute-Driven Design (ADD) es un enfoque sistemático de diseño arquitectónico que guía la construcción de una arquitectura de software basada en **atributos de calidad** como rendimiento, escalabilidad, disponibilidad, seguridad, y otros requerimientos no funcionales. Su propósito principal es **asegurar que la arquitectura resultante sea capaz de satisfacer los requerimientos del sistema**, especialmente aquellos que impactan directamente en la experiencia del usuario y la mantenibilidad del sistema.

ADD parte de una premisa fundamental: el diseño debe estar impulsado no solo por las funcionalidades, sino por los atributos de calidad que determinan el éxito operativo del sistema.

---

## 2. ¿Cómo se relaciona ADD con Clean Architecture en el proceso de diseño de sistemas?

ADD y Clean Architecture se complementan. Mientras ADD se enfoca en **el proceso de toma de decisiones arquitectónicas basadas en atributos de calidad**, Clean Architecture proporciona **una estructura modular, desacoplada y mantenible** para implementar esas decisiones.

- **ADD** define **qué** se necesita y **por qué** (requerimientos arquitectónicos).
- **Clean Architecture** define **cómo** organizar el sistema para satisfacer esos requerimientos.

Juntas, permiten construir sistemas robustos, alineados con el negocio, escalables y sostenibles a largo plazo.

---

## 3. ¿Cuáles son los pasos principales del método ADD para definir una arquitectura de software?

El proceso ADD se desarrolla en las siguientes etapas:

1. **Seleccionar un módulo de diseño** (generalmente el sistema completo al inicio).
2. **Identificar los requerimientos de entrada**: funcionales, atributos de calidad, restricciones.
3. **Elegir tácticas arquitectónicas y patrones** adecuados a los atributos de calidad.
4. **Dividir el módulo en componentes** y asignar responsabilidades.
5. **Definir interfaces y relaciones entre componentes**.
6. **Verificar decisiones** respecto a los atributos de calidad y restricciones.
7. **Registrar las decisiones arquitectónicas** para trazabilidad.
8. **Repetir el proceso recursivamente** para cada componente.

---

## 4. ¿Cómo se identifican los atributos de calidad en ADD y por qué son importantes?

Los atributos de calidad se identifican a través de:

- Análisis de requerimientos no funcionales.
- Entrevistas con stakeholders.
- Uso de escenarios de calidad (Quality Attribute Scenarios).

Son importantes porque:

- Determinan el comportamiento del sistema ante carga, fallos o cambios.
- Impactan directamente en la arquitectura.
- Son clave para la sostenibilidad del sistema a largo plazo.

Ejemplo: Un sistema financiero puede priorizar **seguridad y disponibilidad**, mientras que una red social puede priorizar **escalabilidad y rendimiento**.

---

## 5. ¿Por qué Clean Architecture complementa ADD en la implementación de una solución?

Clean Architecture ofrece una forma estructurada y desacoplada de implementar decisiones arquitectónicas:

- **Capas claramente definidas**: Entidades, casos de uso, interfaces, frameworks.
- **Inversión de dependencias**: permite cambiar tecnologías sin afectar la lógica central.
- **Alta cohesión y bajo acoplamiento**, alineado con principios SOLID.

Esto permite implementar los patrones definidos en ADD respetando los atributos de calidad y facilitando el mantenimiento.

---

## 6. ¿Qué criterios se deben considerar al definir las capas en Clean Architecture dentro de un proceso ADD?

Al definir capas en Clean Architecture, deben considerarse:

- **Separación de responsabilidades** basada en casos de uso.
- **Independencia tecnológica**: frameworks deben quedar en capas externas.
- **Aislamiento de lógica de negocio**: entidades y casos de uso no deben depender de detalles externos.
- **Alineación con atributos de calidad**: rendimiento, seguridad, mantenibilidad.
- **Trazabilidad hacia los requisitos identificados en ADD**.

---

## 7. ¿Cómo ADD ayuda a tomar decisiones arquitectónicas basadas en necesidades del negocio?

ADD obliga a:

- **Priorizar atributos de calidad** en función de los objetivos del negocio.
- **Justificar cada decisión técnica** en términos de valor de negocio.
- **Involucrar a stakeholders** para asegurar alineación entre la arquitectura y los resultados esperados.
- **Evaluar alternativas** y seleccionar la más adecuada según las restricciones y metas estratégicas.

---

## 8. ¿Cuáles son los beneficios de combinar ADD con Clean Architecture en un sistema basado en microservicios?

- **Diseño guiado por calidad**: ADD asegura que cada microservicio responda a atributos clave como disponibilidad, resiliencia o escalabilidad.
- **Modularidad natural**: Clean Architecture favorece la encapsulación de lógica dentro de cada microservicio.
- **Desacoplamiento efectivo**: facilita mantenimiento, escalado independiente y pruebas.
- **Adaptación al cambio**: cada microservicio puede evolucionar sin romper el ecosistema completo.
- **Alineación con objetivos del negocio**, gracias a la trazabilidad de decisiones en ADD.

---

## 9. ¿Cómo se asegura que la arquitectura resultante cumpla con los atributos de calidad definidos en ADD?

Mediante:

- **Evaluación continua**: revisiones arquitectónicas, prototipos, pruebas de concepto.
- **Tácticas específicas**: patrones de diseño orientados a cada atributo (por ejemplo, cache para rendimiento, circuit breaker para disponibilidad).
- **Métricas e indicadores**: rendimiento, tiempos de respuesta, cobertura de pruebas, etc.
- **Documentación de decisiones** y su relación con los atributos esperados.

---

## 10. ¿Qué herramientas o metodologías pueden ayudar a validar una arquitectura diseñada con ADD y Clean Architecture?

Algunas herramientas y enfoques útiles:

- **ATAM (Architecture Tradeoff Analysis Method)**: para evaluar decisiones arquitectónicas frente a atributos de calidad.
- **C4 Model**: visualización de niveles de abstracción arquitectónica.
- **SonarQube**: análisis estático de código.
- **Arquillian, JUnit, TestContainers**: pruebas arquitectónicas y de integración.
- **ADR (Architectural Decision Records)**: registro y trazabilidad de decisiones.
