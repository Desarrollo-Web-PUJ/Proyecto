# Sistema de Gestión Multiempresa

## Descripción

Con este proyecto organizado, vamos a desarrollar, a través del sistema CRUD, un sistema para la gestión de múltiples empresas que les permita tener una interfaz común para el manejo de estas mismas. Con este proyecto buscamos brindar procesos de mayor seguridad, confiabilidad y optimización a cualquier tipo de empresa que desee sumarse a este plan.

Este proyecto, utilizando tecnologías Spring Boot, HTML, JS, Thymeleaf, etc., va a hacerse a través del método de desarrollo CRUD (create, replace, update, delete), con el cual cualquier empresa que decida sumarse a nuestra misión será capaz de gestionar cómo se crea, edita, consulta y elimina dicha empresa. Además de esto, vamos a ofrecer un historial de todos los cambios, tanto internos, ya sea personal o gestión interna, como externos, ya sea la trazabilidad o funciones del proyecto, ofreciendo un sistema novedoso, consistente y de fácil uso y manejo.

## Desarrollo

A través del desarrollo de este curso y con ayuda de GitHub, vamos a ir generando diferentes historias de usuario, así como reportes del proyecto, dando un historial y una medida de ayuda para la creación del mismo, durante el cual también se harán pruebas de ejemplo antes de ser lanzado realmente.

<p align="center">
  <img width="1261" height="651" alt="Historial de historias de usuario" src="https://github.com/user-attachments/assets/25609220-28cf-4571-b4ae-df0d64e1d62d" />
</p>

### Tecnologías Spring a utilizar

- En la capa backend vamos a usar Spring Boot, un framework del proyecto para la lógica CRUD, que a la vez se instalará con múltiples dependencias en VS Code.

<p align="center">
  <img width="263" height="235" alt="Tecnologías Spring" src="https://github.com/user-attachments/assets/da1592f4-cc9d-4bac-abdd-3925ea5c6aa8" />
</p>

Para la gestión y construcción del proyecto se aplicará Maven, ya que este cuenta con un modelo de configuración más simple, aparte de estar basado en formato XML.

<p align="center">
  <img width="294" height="739" alt="Estructura del proyecto en Maven" src="https://github.com/user-attachments/assets/538569ad-93c1-438a-8266-00527783e6a8" />
</p>

- Thymeleaf se usará en la capa de vistas para el renderizado del sistema Spring.
- Para el control de versiones se usarán las herramientas de Git y GitHub, ya sea para el historial de cambios, generación de historias de usuario y reportes de proyecto, usadas en un proyecto conjunto de todos los integrantes.

### Arquitectura base del sistema en VS Code

```
demo/
├── .mvn/
├── .vscode/
├── src/
│   ├── main/
│   │   ├── java/co/edu/javeriana/demo/
│   │   └── resources/
│   └── test/
├── target/
├── .gitattributes
├── .gitignore
├── HELP.md
├── mvnw
├── mvnw.cmd
└── pom.xml
```

## Características

- **Multiempresa (multi-tenant):** cada organización tiene su propio espacio aislado; los procesos pertenecen a la empresa, no a usuarios individuales. Esto asegura que, a pesar de que todas estas están en una misma interfaz, cada empresa tenga su propio espacio personal, sin tener relación alguna con las otras, más allá de la implementación del sistema a realizar.
- **Autenticación segura** con control de acceso por empresa y roles (administrador, editor, solo lectura). Esto se hace con el fin de que cada empresa pueda delegar criterio propio de cómo se debe manejar esta internamente, ya que nosotros, como creadores, no buscamos tener ninguna intervención directa en cómo la empresa gestiona sus propios procesos internos.
- **CRUD de procesos organizacionales:** nombre, descripción, categoría y estado (borrador / publicado).
- **Historial y trazabilidad** de cada cambio realizado sobre un proceso.
- **Búsquedas y filtros avanzados** sobre procesos. Con esto buscaremos implementar un sistema de filtrado para que la empresa pueda buscar con más facilidad el proceso, empleado, trabajo o función que se ha de realizar.
- **Eliminación lógica** (estado inactivo) para no perder información histórica, respetando los derechos de privacidad de cada usuario, así como de la propia empresa.
- **Editor visual de procesos** mediante actividades, arcos y gateways (exclusivos, paralelos e inclusivos).
- **Roles funcionales** asociados a actividades, con validación de uso antes de eliminarlos.

## Requerimientos

- **CRUD:** el sistema debe permitir crear, editar, consultar y eliminar procesos de la organización.
- **Eliminación lógica:** el sistema debe permitir una eliminación lógica en vez de un borrado definitivo, para conservar el historial de la acción tomada.
- **Seguridad:** se debe contar con un sistema de autenticación seguro, con control y acceso por empresa, así como por el rol, tal como administrador, lector, tipo empleado, entre otros.
- **Usabilidad:** el sistema debe ofrecer una interfaz común, fácil de entender, consistente y novedosa para cualquier tipo de empresa.
- **Privacidad:** la eliminación lógica y el manejo del historial deben respetar los derechos de privacidad de la propia empresa y de cada usuario registrado en esta.

## Integrantes

- **David Mannios** — rol de _(pendiente)_
- **Juan Pablo Peña** — rol de _(pendiente)_
- **Andrés Díaz** — rol de _(pendiente)_
- **Alejandro** — rol de _(pendiente)_

## Metodología

A lo largo del curso se va a ver la generación de un aproximado de 28 historias de usuario y reportes del proyecto vía GitHub, en la cual vamos a incluir pruebas de ejemplo antes del lanzamiento del proyecto como tal.

## Despliegue con Docker

### Requisitos
- Docker
- Docker Compose

### Construcción y ejecución

Desde la raíz del proyecto:

docker compose up -d --build

### Verificar contenedor

docker ps

### Acceso a la aplicación

La aplicación se encuentra disponible en:

http://10.43.99.46:8080

### Detener la aplicación

docker compose down

### Consultar logs

docker compose logs -f