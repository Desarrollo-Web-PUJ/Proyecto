package com.example.demo;

import com.example.demo.model.Seccion;
import com.example.demo.repository.SeccionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class WikiController {

    private final SeccionRepository seccionRepository;

    public WikiController(SeccionRepository seccionRepository) {
        this.seccionRepository = seccionRepository;
    }

    @GetMapping("/")
    public String inicio(Model model) {
        model.addAttribute("secciones", seccionRepository.findAll());
        return "inicio";
    }

    @GetMapping("/wiki")
    public String indiceWiki(Model model) {
        model.addAttribute("secciones", seccionRepository.findAll());
        return "documentacion";
    }

    @GetMapping("/wiki/{id}")
    public String verSeccion(@PathVariable String id, Model model) {
        Seccion seccion = seccionRepository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Sección no encontrada: " + id));

        model.addAttribute("seccion", seccion);
        model.addAttribute("secciones", seccionRepository.findAll());
        return "seccion";
    }

    @GetMapping("/contacto")
    public String contacto() {
        return "contacto";
    }
}