# Sistema de Gestión Multiempresa

## Descripción

Con este proyecto organizado, vamos a desarrollar, a través del sistema CRUD, un sistema para la gestión de múltiples empresas que les permita tener una interfaz común para el manejo de estas mismas. Con este proyecto buscamos brindar procesos de mayor seguridad, confiabilidad y optimización a cualquier tipo de empresa que desee sumarse a este plan.

Este proyecto, utilizando tecnologías Spring Boot, HTML, JS, Thymeleaf, etc., va a hacerse a través del método de desarrollo CRUD (create, replace, update, delete), con el cual cualquier empresa que decida sumarse a nuestra misión será capaz de gestionar cómo se crea, edita, consulta y elimina dicha empresa. Además de esto, vamos a ofrecer un historial de todos los cambios, tanto internos, ya sea personal o gestión interna, como externos, ya sea la trazabilidad o funciones del proyecto, ofreciendo un sistema novedoso, consistente y de fácil uso y manejo.

## Desarrollo

A través del desarrollo de este curso y con ayuda de GitHub, vamos a ir generando diferentes historias de usuario, así como reportes del proyecto, dando un historial y una medida de ayuda para la creación del mismo, durante el cual también se harán pruebas de ejemplo antes de ser lanzado realmente.

### Tecnologías Spring a utilizar
- En la capa backend vamos a usar Spring Boot, un framework del proyecto para la lógica crud que a la vez se instalara con multiples dependencias en VScode 
<p align="center">
  <img width="263" height="235" alt="Tecnologías Spring" src="https://github.com/user-attachments/assets/da1592f4-cc9d-4bac-abdd-3925ea5c6aa8" />
</p>

Para la gestión y construcción del proyecto se aplicará Maven, ya que este cuenta con un modelo de configuración más simple, aparte de estar basado en formato XML.

<p align="center">
  <img width="294" height="739" alt="Estructura del proyecto en Maven" src="https://github.com/user-attachments/assets/538569ad-93c1-438a-8266-00527783e6a8" />
</p>
- Thymeleaf Se usará en la capa de vistas para el renderizado Del sistema spring
- Para el control de versiones se usarán las herramientas de git y github, Ya sea el historial de cambios , generación de historias de usuario y reportes de proyecto, usada en un poryecto conjunto de todos los integrantes

## Características

- **Multiempresa (multi-tenant):** cada organización tiene su propio espacio aislado; los procesos pertenecen a la empresa, no a usuarios individuales. Esto asegura que, a pesar de que todas estas están en una misma interfaz, cada empresa tenga su propio espacio personal, sin tener relación alguna con las otras, más allá de la implementación del sistema a realizar.
- **Autenticación segura** con control de acceso por empresa y roles (administrador, editor, solo lectura). Esto se hace con el fin de que cada empresa pueda delegar criterio propio de cómo se debe manejar esta internamente, ya que nosotros, como creadores, no buscamos tener ninguna intervención directa en cómo la empresa gestiona sus propios procesos internos.
- **CRUD de procesos organizacionales:** nombre, descripción, categoría y estado (borrador / publicado).
- **Historial y trazabilidad** de cada cambio realizado sobre un proceso.
- **Búsquedas y filtros avanzados** sobre procesos. Con esto buscaremos implementar un sistema de filtrado para que la empresa pueda buscar con más facilidad el proceso, empleado, trabajo o función que se ha de realizar.
- **Eliminación lógica** (estado inactivo) para no perder información histórica, respetando los derechos de privacidad de cada usuario, así como de la propia empresa.
- **Editor visual de procesos** mediante actividades, arcos y gateways (exclusivos, paralelos e inclusivos).
- **Roles funcionales** asociados a actividades, con validación de uso antes de eliminarlos.

  ## Requerimentos
- **Crud:** El sistema debe permitir crear Editar consultar y eliminar procesos de la organización
- **Eliminacion logica:** El sistema debe permitir una eliminación lógica en vez de un borrado definitivo para conservar el historial De la acción tomada
- **Seguridad:** Se debe contar con un sistema de autenticación seguro con control y acceso por empresa Así como por el rol coma tal como administrador , lector coma tipo empleado entre otros
- **Usabilidad:** El sistema debe Ofrecer una interfaz común fácil de entender consistente y novedosa para cualquier tipo de empresa
- **privacidad:** La eliminación lógica y el manejo del historial deben respetar los derechos de privacidad de la propia empresa y de cada usuario registrado en esta
## Integrantes
- **David Mannios** - rol de 
- **Juan Pablo Peña** - rol de 
- **Andres Diaz** - rol de
- **Alejandro** - rol de 
## Metodologia
A lo largo del curso se va a ver la generación De un aproximado de 28 historias de usuario y reportes del proyecto Via Github Coma en esta misma vamos a incluir pruebas de ejemplo antes del lanzamiento del proyecto como tal
