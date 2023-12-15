# Tienda Online

# Almacén en Java con Hilos y ConcurrentLinkedDeque

Este proyecto Java simula un almacén en el que se utilizan hilos para gestionar diferentes operaciones concurrentes. Se utiliza `ConcurrentLinkedDeque` para manejar de manera segura las operaciones en el almacén.

ConcurrentLinkedQueue es una estructura de datos en Java que se utiliza para implementar una cola concurrente. Esta cola permite el acceso simultáneo y seguro desde múltiples hilos, lo que la hace ideal para aplicaciones que requieren concurrencia.

## Características

- **Gestión de Almacén:** Utiliza hilos para gestionar el contenido del almacén de productos de manera concurrente.
- **Cola Concurrente:** Emplea `ConcurrentLinkedDeque` para asegurar la concurrencia en las operaciones del almacén.

## Métodos que hemos usado

- Método **remove**: Elimina una única instancia del elemento especificado de esta cola, si está presente.
- Método **add**: Inserta el elemento especificado al final de esta cola.

## Ejecución

1. Clona el repositorio.
2. Abre el proyecto en tu entorno de desarrollo favorito.
3. Compila y ejecuta la aplicación.

## Uso de Hilos y ConcurrentLinkedQueue

El proyecto utiliza hilos para realizar operaciones simultáneas en el almacén. La clase `ConcurrentLinkedDeque` se encarga de gestionar de forma segura las operaciones concurrentes en la cola del almacén.

## Casos de usos
- Supongamos que estamos construyendo una aplicación de gestión de pedidos en un restaurante de comida rápida. En un entorno de restaurante, los pedidos se realizan constantemente, y tanto los clientes como los 
empleados pueden interactuar con el sistema. Utilizar ConcurrentLinkedDeque podría ser beneficioso para gestionar la cola de pedidos de manera concurrente y eficiente.
- Imaginemos una aplicación de procesamiento de eventos en tiempo real, como un sistema de monitoreo de sensores en una red IoT (Internet de las cosas). En este escenario, múltiples eventos pueden ser generados por diferentes sensores y enviados en tiempo real. Los eventos se almacenan de manera segura en la ConcurrentLinkedDeque, y varios procesadores pueden trabajar en paralelo para procesar estos eventos. Esto simula un sistema de monitoreo de sensores en una red IoT, donde la concurrencia es esencial para manejar múltiples eventos simultáneamente. La cola concurrente garantiza un procesamiento seguro y eficiente de los eventos en un entorno multi-hilo.

## Descripción de la estructura
La carpeta Pojos contine:
  - Clase Almacen, que es la que contiene mostrar catalogo, encontrar la posición y comprobar si existe.
  - Clase Producto, la cual contiene los atributos id, nombre y descripcion, contiene los getters y los setters de los atributos y el toString.
La carpeta tiendaonline contiene:
  - Clase AddProductos, la cual contiene AddProducto, addProductoEnAlmacen la cual de forma aleatoria le dará tanto a producto como a la descripción un número aleatorio y el método run el cuál nos dirá si se ha añadido correctamente o no se ha podido añadir.
  - Clase TiendaOnline, la cual contiene el menú de la aplicación, los métodos de mostrar, añadir productos y añadir productos de forma no segura.
## Tabla con métodos de interés

| Modificador y Tipo         | Método y Descripción                                                                        |
| -------------------------- | ------------------------------------------------------------------------------------------- |
| boolean                    | add(E e)                                                                                   |
|                            | Inserta el elemento especificado al final de esta cola doble.                              |
| boolean                    | addAll(Collection<? extends E> c)                                                         |
|                            | Añade todos los elementos de la colección especificada al final de esta cola doble, en el  |
|                            | orden en que son devueltos por el iterador de la colección especificada.                   |
| void                       | addFirst(E e)                                                                              |
|                            | Inserta el elemento especificado al principio de esta cola doble.                           |
| void                       | addLast(E e)                                                                               |
|                            | Inserta el elemento especificado al final de esta cola doble.                               |
| void                       | clear()                                                                                   |
|                            | Elimina todos los elementos de esta cola doble.                                            |
| boolean                    | contains(Object o)                                                                         |
|                            | Devuelve true si esta cola doble contiene al menos un elemento e tal que o.equals(e).      |
| Iterator<E>                | descendingIterator()                                                                       |
|                            | Devuelve un iterador sobre los elementos en esta cola doble en orden secuencial inverso.   |
| E                          | element()                                                                                 |
|                            | Obtiene, pero no elimina, la cabeza de la cola representada por esta cola doble (en otras  |
|                            | palabras, el primer elemento de esta cola doble).                                           |
| E                          | getFirst()                                                                                |
|                            | Obtiene, pero no elimina, el primer elemento de esta cola doble.                            |
| E                          | getLast()                                                                                 |
|                            | Obtiene, pero no elimina, el último elemento de esta cola doble.                            |
| boolean                    | isEmpty()                                                                                 |
|                            | Devuelve true si esta colección no contiene elementos.                                       |
| Iterator<E>                | iterator()                                                                               |
|                            | Devuelve un iterador sobre los elementos en esta cola doble en secuencia correcta.         |
| boolean                    | offer(E e)                                                                               |
|                            | Inserta el elemento especificado al final de esta cola doble.                               |
| boolean                    | offerFirst(E e)                                                                          |
|                            | Inserta el elemento especificado al principio de esta cola doble.                            |
| boolean                    | offerLast(E e)                                                                           |
|                            | Inserta el elemento especificado al final de esta cola doble.                               |
| E                          | peek()                                                                                   |
|                            | Obtiene, pero no elimina, la cabeza de la cola representada por esta cola doble (en otras  |
|                            | palabras, el primer elemento de esta cola doble), o devuelve null si esta cola doble está   |
|                            | vacía.                                                                                     |
| E                          | peekFirst()                                                                              |
|                            | Obtiene, pero no elimina, el primer elemento de esta cola doble, o devuelve null si esta    |
|                            | cola doble está vacía.                                                                    |
| E                          | peekLast()                                                                               |
|                            | Obtiene, pero no elimina, el último elemento de esta cola doble, o devuelve null si esta    |
|                            | cola doble está vacía.                                                                    |
| E                          | poll()                                                                                   |
|                            | Obtiene y elimina la cabeza de la cola representada por esta cola doble (en otras palabras,|
|                            | el primer elemento de esta cola doble), o devuelve null si esta cola doble está vacía.    |
| E                          | pollFirst()                                                                              |
|                            | Obtiene y elimina el primer elemento de esta cola doble, o devuelve null si esta cola      |
|                            | doble está vacía.                                                                         |
| E                          | pollLast()                                                                               |
|                            | Obtiene y elimina el último elemento de esta cola doble, o devuelve null si esta cola      |
|                            | doble está vacía.                                                                         |
| E                          | pop()                                                                                    |
|                            | Extrae un elemento de la pila representada por esta cola doble.                             |
| void                       | push(E e)                                                                                |
|                            | Empuja un elemento en la pila representada por esta cola doble (en otras palabras, en la    |
|                            | cabeza de esta cola doble) si es posible hacerlo inmediatamente sin violar las restricciones|
|                            | de capacidad, lanzando una IllegalStateException si actualmente no hay espacio disponible.|
| E                          | remove()                                                                                 |
|                            | Obtiene y elimina la cabeza de la cola representada por esta cola doble (en otras palabras,|
|                            | el primer elemento de esta cola doble).                                                    |
| boolean                    | remove(Object o)                                                                         |
|                            | Elimina el primer elemento e tal que o.equals(e), si tal elemento existe en esta cola doble.|



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
