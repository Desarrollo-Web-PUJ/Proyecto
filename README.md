# Sistema de Gestión Multiempresa

## Descripción

Con este proyecto organizado, vamos a desarrollar, a través del sistema CRUD, un sistema para la gestión de múltiples empresas que les permita tener una interfaz común para el manejo de estas mismas. Con este proyecto buscamos brindar procesos de mayor seguridad, confiabilidad y optimización a cualquier tipo de empresa que desee sumarse a este plan.

Este proyecto, utilizando tecnologías Spring Boot, HTML, JS, Thymeleaf, etc., va a hacerse a través del método de desarrollo CRUD (create, replace, update, delete), con el cual cualquier empresa que decida sumarse a nuestra misión será capaz de gestionar cómo se crea, edita, consulta y elimina dicha empresa. Además de esto, vamos a ofrecer un historial de todos los cambios, tanto internos, ya sea personal o gestión interna, como externos, ya sea la trazabilidad o funciones del proyecto, ofreciendo un sistema novedoso, consistente y de fácil uso y manejo.

## Desarrollo

A través del desarrollo de este curso y con ayuda de GitHub, vamos a ir generando diferentes historias de usuario, así como reportes del proyecto, dando un historial y una medida de ayuda para la creación del mismo, durante el cual también se harán pruebas de ejemplo antes de ser lanzado realmente.

### Tecnologías Spring a utilizar

<p align="center">
  <img width="263" height="235" alt="Tecnologías Spring" src="https://github.com/user-attachments/assets/da1592f4-cc9d-4bac-abdd-3925ea5c6aa8" />
</p>

Para la gestión y construcción del proyecto se aplicará Maven, ya que este cuenta con un modelo de configuración más simple, aparte de estar basado en formato XML.

<p align="center">
  <img width="294" height="739" alt="Estructura del proyecto en Maven" src="https://github.com/user-attachments/assets/538569ad-93c1-438a-8266-00527783e6a8" />
</p>

## Características

- **Multiempresa (multi-tenant):** cada organización tiene su propio espacio aislado; los procesos pertenecen a la empresa, no a usuarios individuales. Esto asegura que, a pesar de que todas estas están en una misma interfaz, cada empresa tenga su propio espacio personal, sin tener relación alguna con las otras, más allá de la implementación del sistema a realizar.
- **Autenticación segura** con control de acceso por empresa y roles (administrador, editor, solo lectura). Esto se hace con el fin de que cada empresa pueda delegar criterio propio de cómo se debe manejar esta internamente, ya que nosotros, como creadores, no buscamos tener ninguna intervención directa en cómo la empresa gestiona sus propios procesos internos.
- **CRUD de procesos organizacionales:** nombre, descripción, categoría y estado (borrador / publicado).
- **Historial y trazabilidad** de cada cambio realizado sobre un proceso.
- **Búsquedas y filtros avanzados** sobre procesos. Con esto buscaremos implementar un sistema de filtrado para que la empresa pueda buscar con más facilidad el proceso, empleado, trabajo o función que se ha de realizar.
- **Eliminación lógica** (estado inactivo) para no perder información histórica, respetando los derechos de privacidad de cada usuario, así como de la propia empresa.
- **Editor visual de procesos** mediante actividades, arcos y gateways (exclusivos, paralelos e inclusivos).
- **Roles funcionales** asociados a actividades, con validación de uso antes de eliminarlos.
