# Respuestas Codelab: Aplicación de Clean Architecture en Microservicios con Spring Boot

**Nombre del estudiante:** Juan Sebastian Gomez Agudelo  
**Código estudiantil:** 2259474

---

## 1. ¿Cuál es el propósito principal de Clean Architecture en el desarrollo de software?

El propósito de Clean Architecture es **organizar el código en capas claramente definidas y desacopladas**, permitiendo que la lógica de negocio sea independiente de detalles técnicos como frameworks, bases de datos, o interfaces externas. Esta separación de preocupaciones mejora la **mantenibilidad, escalabilidad, testabilidad y flexibilidad** del sistema a largo plazo.

---

## 2. ¿Qué beneficios aporta Clean Architecture a un microservicio en Spring Boot?

Al aplicar Clean Architecture en un microservicio con Spring Boot, se obtienen beneficios como:

- **Desacoplamiento** entre la lógica del negocio y la tecnología.
- **Facilidad para realizar pruebas unitarias**, especialmente sobre los casos de uso.
- **Sustitución sencilla de frameworks** o bases de datos sin afectar la lógica principal.
- **Escalabilidad modular**, ideal para entornos distribuidos.
- **Mantenimiento ágil**, al tener responsabilidades claramente separadas.

---

## 3. ¿Cuáles son las principales capas de Clean Architecture y qué responsabilidad tiene cada una?

Las capas típicas en Clean Architecture son:

1. **Entidad (Domain/Model)**  
   - Contiene la lógica de negocio pura y entidades del dominio.
   - Es completamente independiente de detalles técnicos.

2. **Caso de uso (Application/UseCases)**  
   - Define los flujos de negocio específicos del sistema.
   - Orquesta las entidades para cumplir un objetivo.

3. **Interfaces (Interface Adapters)**  
   - Implementa controladores, presentadores y gateways.
   - Traduce datos entre la capa de aplicación y el mundo externo.

4. **Infraestructura (Frameworks & Drivers)**  
   - Incluye tecnologías externas como Spring Boot, JPA, bases de datos, APIs, etc.
   - Implementa interfaces definidas en capas superiores.

---

## 4. ¿Por qué se recomienda desacoplar la lógica de negocio de la infraestructura en un microservicio?

Porque la infraestructura cambia frecuentemente (frameworks, bases de datos, herramientas externas), mientras que la **lógica de negocio permanece estable**. Al desacoplarla:

- Se evitan dependencias rígidas con tecnologías específicas.
- Se facilita la evolución del sistema sin reescribir reglas de negocio.
- Se promueve la reutilización y portabilidad del núcleo del sistema.

---

## 5. ¿Cuál es el rol de la capa de aplicación y qué tipo de lógica debería contener?

La **capa de aplicación (Application Layer)** es responsable de orquestar **los casos de uso del sistema**, coordinando entidades del dominio y llamando a servicios externos si es necesario.

Debe contener:

- **Lógica de negocio específica de cada flujo** (por ejemplo, crear un pedido, validar un pago).
- Coordinación de servicios, validaciones y eventos.
- Interfaces de entrada (commands, queries, DTOs) y salida (presenters, responses).

**No debe contener lógica de infraestructura** (bases de datos, HTTP, etc.).

---

## 6. ¿Qué diferencia hay entre un UseCase y un Service en Clean Architecture?

| Concepto | UseCase | Service |
|----------|---------|---------|
| Rol | Representa un flujo de negocio específico. | Puede representar una funcionalidad más genérica o transversal. |
| Ubicación | Capa de aplicación. | Puede estar en aplicación, dominio o infraestructura (dependiendo del tipo). |
| Ejemplo | `CrearOrdenUseCase` | `EmailNotificationService`, `HashingService` |

**UseCase** es el corazón del flujo de negocio, mientras que **Service** puede ser un colaborador técnico o de soporte al dominio.

---

## 7. ¿Por qué se recomienda definir Repositories como interfaces en la capa de dominio en lugar de usar directamente JpaRepository?

Porque:

- **JpaRepository pertenece a la infraestructura**, y al usarlo directamente se rompe el principio de inversión de dependencias.
- Definir interfaces en el dominio permite abstraer el almacenamiento y cumplir con Clean Architecture.
- La implementación concreta se puede inyectar posteriormente desde la capa de infraestructura, sin acoplar la lógica de negocio a un ORM.

Esto promueve el **desacoplamiento y la testabilidad** del sistema.

---

## 8. ¿Cómo se implementa un UseCase en un microservicio con Spring Boot y qué ventajas tiene?

### Ejemplo básico:

```java
// En la capa de dominio
public interface PedidoRepository {
    void guardar(Pedido pedido);
}

// En la capa de aplicación
@Service
public class CrearPedidoUseCase {
    private final PedidoRepository pedidoRepository;

    public CrearPedidoUseCase(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public void ejecutar(CrearPedidoCommand command) {
        Pedido pedido = new Pedido(command.getDatos());
        pedidoRepository.guardar(pedido);
    }
}
```


### 9. ¿Qué problemas podrían surgir si no aplicamos Clean Architecture en un proyecto de microservicios?

- Acoplamiento excesivo a frameworks o tecnologías.
- Difícil mantenimiento cuando el código crece.
- Baja reutilización de lógica de negocio.
- Pruebas complicadas, especialmente si la lógica está mezclada con persistencia o controladores.
- Fragilidad ante cambios en infraestructura (por ejemplo, cambios en JPA afectan directamente la lógica).

---

### 10. ¿Cómo Clean Architecture facilita la escalabilidad y mantenibilidad en un entorno basado en microservicios?

- **Escalabilidad:** cada microservicio puede evolucionar de forma independiente, ya que su lógica central no depende del resto de la infraestructura.
- **Mantenibilidad:** el código está modularizado, lo que permite aplicar cambios en una capa sin afectar otras.
- **Claridad:** cada equipo puede enfocarse en su dominio sin preocuparse por detalles técnicos.
- **Testabilidad:** los casos de uso se prueban sin necesidad de levantar toda la infraestructura.


