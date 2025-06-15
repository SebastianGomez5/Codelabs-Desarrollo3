# Respuestas Codelab: Attribute-Driven Design (ADD) y su Integración con Clean Architecture

**Nombre del estudiante:** Juan Sebastian Gomez Agudelo 
**Código estudiantil:** 2259474

---

## 1. ¿Qué es Attribute-Driven Design (ADD) y cuál es su propósito en el diseño de software?

Attribute-Driven Design (ADD) es un método de diseño arquitectónico que se enfoca en la toma de decisiones basadas en **atributos de calidad** (como rendimiento, seguridad, disponibilidad, mantenibilidad, etc.), más allá de los requerimientos funcionales.

Su propósito principal es **garantizar que la arquitectura del sistema responda a las necesidades de calidad específicas del negocio y del entorno operativo**, estructurando el diseño de manera sistemática y documentada.

---

## 2. ¿Cómo se relaciona ADD con Clean Architecture en el proceso de diseño de sistemas?

ADD define **qué decisiones arquitectónicas deben tomarse** para cumplir los atributos de calidad, mientras que **Clean Architecture ofrece una estructura práctica y desacoplada** para implementarlas.

ADD proporciona la lógica estratégica y los objetivos de calidad, y Clean Architecture ejecuta esa lógica en un diseño técnico organizado, flexible y sostenible.

---

## 3. ¿Cuáles son los pasos principales del método ADD para definir una arquitectura de software?

1. **Seleccionar el módulo de diseño** (inicialmente, el sistema completo).
2. **Identificar entradas clave**: requisitos funcionales, atributos de calidad y restricciones.
3. **Elegir tácticas y patrones arquitectónicos** adecuados.
4. **Dividir el módulo en componentes** con responsabilidades específicas.
5. **Establecer relaciones y definir interfaces** entre componentes.
6. **Evaluar decisiones arquitectónicas** según atributos de calidad.
7. **Registrar decisiones arquitectónicas** para trazabilidad.
8. **Repetir el proceso recursivamente** para subcomponentes.

---

## 4. ¿Cómo se identifican los atributos de calidad en ADD y por qué son importantes?

Los atributos de calidad se identifican mediante:

- Análisis de requisitos no funcionales.
- Entrevistas con stakeholders.
- Escenarios de atributos de calidad (Quality Attribute Scenarios).

Son importantes porque definen cómo el sistema debe comportarse **bajo condiciones reales de uso** y guían las decisiones de diseño para cumplir expectativas clave del negocio y los usuarios.

---

## 5. ¿Por qué Clean Architecture complementa ADD en la implementación de una solución?

Porque Clean Architecture:

- **Separa las preocupaciones**: dominio, aplicación, infraestructura.
- **Facilita la prueba de decisiones tomadas en ADD**.
- **Permite cambiar frameworks y tecnologías** sin afectar la lógica central.
- **Implementa tácticas de calidad**, como desacoplamiento, inyección de dependencias y control de acceso.

De esta forma, Clean Architecture **traduce las decisiones estratégicas de ADD en una arquitectura técnica efectiva**.

---

## 6. ¿Qué criterios se deben considerar al definir las capas en Clean Architecture dentro de un proceso ADD?

- **Alineación con atributos de calidad identificados en ADD**.
- **Separación clara de responsabilidades**.
- **Inversión de dependencias**, donde las capas internas no dependen de las externas.
- **Modularidad y facilidad de prueba**.
- **Flexibilidad para sustituir tecnologías sin afectar el dominio**.
- **Trazabilidad entre decisiones arquitectónicas y componentes técnicos**.

---

## 7. ¿Cómo ADD ayuda a tomar decisiones arquitectónicas basadas en necesidades del negocio?

ADD traduce necesidades del negocio en **requisitos de calidad específicos** (por ejemplo, alta disponibilidad para un sistema financiero), y luego guía la arquitectura con:

- Tácticas específicas (por ejemplo, redundancia, balanceo de carga).
- Componentización y asignación de responsabilidades.
- Priorización de decisiones según impacto en el negocio.

De este modo, ADD **conecta la arquitectura con el valor de negocio**.

---

## 8. ¿Cuáles son los beneficios de combinar ADD con Clean Architecture en un sistema basado en microservicios?

- **Diseño guiado por calidad**, no solo por funcionalidad.
- **Modularidad natural**: cada microservicio cumple un rol bien definido.
- **Desacoplamiento tecnológico**, favoreciendo la escalabilidad.
- **Mejor mantenimiento** y despliegue independiente.
- **Decisiones justificadas** por escenarios reales.
- **Adaptabilidad** a cambios en el negocio y en el entorno técnico.

---

## 9. ¿Cómo se asegura que la arquitectura resultante cumpla con los atributos de calidad definidos en ADD?

- **Evaluaciones iterativas** con stakeholders.
- **Pruebas de concepto y prototipos** para atributos críticos.
- **Aplicación de tácticas arquitectónicas adecuadas** (por ejemplo, circuit breakers, cachés, logs estructurados).
- **Revisión de trazabilidad**: decisiones, escenarios, componentes.
- **Uso de métricas** e indicadores concretos (tiempo de respuesta, cobertura de pruebas, tasa de errores).

---

## 10. ¿Qué herramientas o metodologías pueden ayudar a validar una arquitectura diseñada con ADD y Clean Architecture?

- **ATAM (Architecture Tradeoff Analysis Method)**.
- **Quality Attribute Scenarios**.
- **ADR (Architectural Decision Records)**.
- **Modelado con el C4 Model**.
- **SonarQube** para análisis estático.
- **Pruebas de estrés, carga y resiliencia**.
- **Pruebas unitarias y de integración aisladas por capa**.