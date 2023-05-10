# Proyecto de Tests JUnit para la clase TablaEnteros

Este proyecto consiste en la implementación de pruebas unitarias utilizando JUnit para la clase `TablaEnteros`. La clase `TablaEnteros` tiene los siguientes 
métodos:

- `sumaTabla()`: devuelve la suma de los elementos de la tabla.
- `mayorTabla()`: devuelve el mayor elemento de la tabla.
- `posicionTabla(int n)`: devuelve la posición de un elemento cuyo valor se pasa como parámetro.

## Requisitos

Para ejecutar las pruebas, necesitarás tener instalado Java y JUnit en tu entorno de desarrollo.

## Configuración

1. Clona el repositorio en tu máquina local.
2. Abre el proyecto en tu IDE favorito.
3. Asegúrate de tener las dependencias de JUnit correctamente configuradas en tu proyecto.

## Ejecutar las pruebas

1. Ejecuta la clase `TablaEnterosTest` ubicada en el paquete de pruebas.
2. Los resultados de las pruebas se mostrarán en la consola.

## Descripción de las pruebas

- `testSumaTabla()`: verifica que el método `sumaTabla()` devuelve la suma correcta de los elementos de la tabla.
- `testMayorTabla()`: verifica que el método `mayorTabla()` devuelve el elemento mayor de la tabla.
- `testPosicionTabla1()`: verifica que el método `posicionTabla()` devuelve la posición correcta de un elemento existente en la tabla.
- `testPosicionTabla2()`: verifica que el método `posicionTabla()` lanza una excepción `NoSuchElementException` cuando se busca un elemento 
   inexistente en la tabla.

## Autor

- [Juan Diego Motta](https://github.com/JuanDiegoMotta)
- [Jorge Burgos Barrera](https://github.com/jorgeBurgosBr)
