package com.example.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.model.Seccion;
import com.example.demo.repository.SeccionRepository;

@Component
public class DataLoader implements CommandLineRunner {

    private final SeccionRepository seccionRepository;

    public DataLoader(SeccionRepository seccionRepository) {
        this.seccionRepository = seccionRepository;
    }

    @Override
    public void run(String... args) {
        if (seccionRepository.count() > 0) {
            return;
        }

        seccionRepository.save(new Seccion(
            "descripcion",
            "Descripción",
            "Qué es el Sistema de Gestión Multiempresa",
            "Con este proyecto organizado, vamos a desarrollar, a través del sistema CRUD, un sistema para la gestión de múltiples empresas que les permita tener una interfaz común para el manejo de estas mismas. Con este proyecto buscamos brindar procesos de mayor seguridad, confiabilidad y optimización a cualquier tipo de empresa que desee sumarse a este plan. Este proyecto, utilizando tecnologías Spring Boot, HTML, JS, Thymeleaf, etc., va a hacerse a través del método de desarrollo CRUD (create, replace, update, delete), con el cual cualquier empresa que decida sumarse a nuestra misión será capaz de gestionar cómo se crea, edita, consulta y elimina dicha empresa. Además de esto, vamos a ofrecer un historial de todos los cambios, tanto internos como externos, ofreciendo un sistema novedoso, consistente y de fácil uso y manejo."
        ));

        seccionRepository.save(new Seccion(
            "desarrollo",
            "Desarrollo y tecnologías",
            "Stack técnico y arquitectura del proyecto",
            "A través del desarrollo de este curso y con ayuda de GitHub, vamos a ir generando diferentes historias de usuario, así como reportes del proyecto, dando un historial y una medida de ayuda para la creación del mismo, durante el cual también se harán pruebas de ejemplo antes de ser lanzado realmente. En la capa backend usamos Spring Boot para la lógica CRUD. Para la gestión y construcción del proyecto se aplica Maven, por su modelo de configuración simple basado en XML. Thymeleaf se usa en la capa de vistas para el renderizado. Para el control de versiones se usan Git y GitHub.\n\nEstructura base del proyecto:\ndemo/\n├── .mvn/\n├── .vscode/\n├── src/\n│   ├── main/\n│   │   ├── java/co/edu/javeriana/demo/\n│   │   └── resources/\n│   └── test/\n├── target/\n├── .gitattributes\n├── .gitignore\n├── HELP.md\n├── mvnw\n├── mvnw.cmd\n└── pom.xml"
        ));

        seccionRepository.save(new Seccion(
            "caracteristicas",
            "Características",
            "Funcionalidades principales del sistema",
            "Multiempresa (multi-tenant): cada organización tiene su propio espacio aislado; los procesos pertenecen a la empresa, no a usuarios individuales. Autenticación segura con control de acceso por empresa y roles (administrador, editor, solo lectura). CRUD de procesos organizacionales: nombre, descripción, categoría y estado (borrador / publicado). Historial y trazabilidad de cada cambio realizado sobre un proceso. Búsquedas y filtros avanzados sobre procesos. Eliminación lógica (estado inactivo) para no perder información histórica, respetando los derechos de privacidad de cada usuario y de la empresa. Editor visual de procesos mediante actividades, arcos y gateways (exclusivos, paralelos e inclusivos). Roles funcionales asociados a actividades, con validación de uso antes de eliminarlos."
        ));

        seccionRepository.save(new Seccion(
            "requerimientos",
            "Requerimientos",
            "Requisitos funcionales y no funcionales",
            "CRUD: el sistema debe permitir crear, editar, consultar y eliminar procesos de la organización. Eliminación lógica: el sistema debe permitir una eliminación lógica en vez de un borrado definitivo, para conservar el historial de la acción tomada. Seguridad: se debe contar con un sistema de autenticación seguro, con control y acceso por empresa y por rol (administrador, lector, empleado, entre otros). Usabilidad: el sistema debe ofrecer una interfaz común, fácil de entender, consistente y novedosa para cualquier tipo de empresa. Privacidad: la eliminación lógica y el manejo del historial deben respetar los derechos de privacidad de la empresa y de cada usuario registrado en esta."
        ));

        seccionRepository.save(new Seccion(
            "integrantes",
            "Integrantes",
            "Equipo del proyecto",
            "David Mannios — rol pendiente por definir.\nJuan Pablo Peña — rol pendiente por definir.\nAndrés Díaz — rol pendiente por definir.\nAlejandro — rol pendiente por definir."
        ));

        seccionRepository.save(new Seccion(
            "metodologia",
            "Metodología del taller",
            "Qué es esta Wiki y cómo se evalúa",
            "Esta Wiki es una aplicación web server-side cuyo objetivo es organizar, presentar y navegar información de manera estructurada, simulando un portal de documentación técnica, y sirve como caso de uso controlado para aplicar Thymeleaf sobre una arquitectura MVC básica: Controladores que atienden las solicitudes HTTP, Vistas en Thymeleaf sin lógica de negocio compleja, y un Modelo persistido con Spring Data JPA y H2.\n\nCriterios de evaluación: uso correcto de Thymeleaf (th:text, th:each, th:if) 35%, formulario de Contáctenos con validaciones en JavaScript 13%, arquitectura MVC 10%, HTML semántico y CSS propio 10%, layouts y fragmentos reutilizables (th:fragment, th:replace) 9%, despliegue en contenedor Docker 8%, navegación clara entre secciones 5%, y quices individuales 10%.\n\nLa aplicación debe compilar y ejecutarse sin errores, y quedar desplegada en un contenedor Docker accesible vía URL: no se permiten ejecuciones desde el IDE ni por línea de comandos en la entrega final."
        ));
    }
}