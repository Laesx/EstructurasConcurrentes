# Tienda Online

# Almacén en Java con Hilos y ConcurrentLinkedQueue

Este proyecto Java simula un almacén en el que se utilizan hilos para gestionar diferentes operaciones concurrentes. Se utiliza `ConcurrentLinkedQueue` para manejar de manera segura las operaciones en el almacén.

## Características

- **Gestión de Almacén:** Utiliza hilos para gestionar el contenido del almacén de productos de manera concurrente.
- **Cola Concurrente:** Emplea `ConcurrentLinkedQueue` para asegurar la concurrencia en las operaciones del almacén.

## Requisitos

- Java 7 o superior.

## Ejecución

1. Clona el repositorio.
2. Abre el proyecto en tu entorno de desarrollo favorito.
3. Compila y ejecuta la aplicación.

## Uso de Hilos y ConcurrentLinkedQueue

El proyecto utiliza hilos para realizar operaciones simultáneas en el almacén. La clase `ConcurrentLinkedQueue` se encarga de gestionar de forma segura las operaciones concurrentes en la cola del almacén.

### Ejemplo de Uso:

```java
// Crea una cola concurrente para gestionar las operaciones en el almacén
ConcurrentLinkedQueue<Operacion> colaAlmacen = new ConcurrentLinkedQueue<>();

// Crea hilos para realizar diferentes operaciones
Thread hiloGestionAlmacen = new Thread(new GestionAlmacen(colaAlmacen));
Thread hiloMovimientos = new Thread(new MovimientosProductos(colaAlmacen));

// Inicia los hilos
hiloGestionAlmacen.start();
hiloMovimientos.start();
